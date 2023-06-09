package vetores;

import java.util.Random;

public class Aleatorio {
	
	//Preenche um vetor com tamanho já predefinido de forma aleatória:
	
		 /* Exemplo: 
		  * Aleatorio a = new Aleatorio();
		  * int[] vetorMil = new int[1000];
		  * vetorMil = a.preencher(vetorMil); */
	
	public int[] preencher(int[] vetor) {
		Random random = new Random();
		vetor = new int[vetor.length];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(1, (vetor.length + 1));
		}
		return vetor;
	}
}
