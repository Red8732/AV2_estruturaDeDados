package vetores;

public class InversamenteOrdenado {
	
	//Preenche um vetor com tamanho ja predefinido de forma inversamente ordenada:
	
	 /* Exemplo: 
	  * InversamenteOrdenado i = new InversamenteOrdenado();
	  * int[] vetorMil = new int[1000];
	  * vetorMil = i.preencher(vetorMil); */
	
	public int[] preencher(int tamanho) {
		int[] vetor = new int[tamanho];
		int aux = 0;
		
		for (int i = vetor.length; i > 0; i--) {
			vetor[aux] = i;
			aux++;
		}
		return vetor;
	}
}