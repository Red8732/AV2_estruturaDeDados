package vetores;

public class InversamenteOrdenado {
	
	//Preenche um vetor com tamanho já predefinido de forma inversamente ordenada:
	
	 /* Exemplo: int[] vetorMil = new int[1000];
	 vetorMil = v.vetorInversamenteOrdenado(vetorMil); */
	
	public int[] vetorInversamenteOrdenado(int[] vetor) {
		vetor = new int[vetor.length];
		int aux = 0;
		
		for (int i = vetor.length; i > 0; i--) {
			vetor[aux] = i;
			aux++;
		}
		return vetor;
	}
}