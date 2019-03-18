package Dicionario;

public class Busca {

	private double tempoExecucaoNano, tempoExecucaoMili;
	
	public String BuscaSequencial(String[] vetorOrdenado, String palavra) {
		
		long tempoNanoInicial = System.nanoTime();
		long tempoMiliInicial = System.currentTimeMillis();
		
		for(int i = 0; i <= vetorOrdenado.length; i++) {
			if(palavra.equals(vetorOrdenado[i])) {
				return "Palavra (" + vetorOrdenado[i] + ") encontrada!!\nLocalizada no índice " 
				+ i + " do vetor.";
			}else {
				
			}
				
		}
		long tempoNanoFinal = System.nanoTime();
		long tempoMiliFinal = System.currentTimeMillis();
		this.tempoExecucaoMili = tempoMiliFinal - tempoMiliInicial;
	    this.tempoExecucaoNano = tempoNanoFinal - tempoNanoInicial;
		return "Palavra não encontrada ou não existe no vetor";
	}
	
	public String BuscaBinaria(String[] vetorOrdenado, String palavra) {
		
		long tempoNanoInicial = System.nanoTime();
		long tempoMiliInicial = System.currentTimeMillis();
		
		int meio;
		int inicioVet = 0;
		int fimVet = vetorOrdenado.length - 1;
		
		
		while(inicioVet <= fimVet) {
			meio = (inicioVet + fimVet) / 2;
			if(palavra.length() == vetorOrdenado[meio].length()) {
				do {
				if(palavra.equals(vetorOrdenado[meio])) {
					return "Palavra" + vetorOrdenado[meio] + " encontrada no Vetor, no indice" 
						+ meio + " do vetor.";
					}else {
						
						meio++;
					}
				}while(palavra.length() == vetorOrdenado[meio].length());
				if(palavra.length() > vetorOrdenado[meio].length()) {
					meio--;
				}
			}
			if(vetorOrdenado[meio].length() < palavra.length()) {
				inicioVet = meio + 1;
			}
			else if(vetorOrdenado[meio].length() > palavra.length()) {
				fimVet = meio - 1;
			}
		}
		return "Não encontrada";
	}
	public Busca(double tempoExecucaoNano, double tempoExecucaoMili) {
		
		this.tempoExecucaoNano = tempoExecucaoNano;
		this.tempoExecucaoMili = tempoExecucaoMili;
		
	}

	public Busca() {
		
	}

	public double getTempoExecucaoNano() {
		return tempoExecucaoNano;
	}

	public void setTempoExecucaoNano(double tempoExecucaoNano) {
		this.tempoExecucaoNano = tempoExecucaoNano;
	}

	public double getTempoExecucaoMili() {
		return tempoExecucaoMili;
	}

	public void setTempoExecucaoMili(double tempoExecucaoMili) {
		this.tempoExecucaoMili = tempoExecucaoMili;
	}
	
	
	
}
