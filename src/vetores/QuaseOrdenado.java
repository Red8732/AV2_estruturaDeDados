package vetores;

import java.util.Random;

public class QuaseOrdenado {
	
	//Preenche um vetor com tamanho já predefinido de forma dez porcento fora de ordem:
	
	 /* Exemplo: 
	  * QuaseOrdenado q = new QuaseOrdenado();
	  * int[] vetorMil = new int[1000];
	  * vetorMil = q.preencher(vetorMil); */
	
	public int[] preencher(int tamanho) {
		Random random = new Random();
		int[] vetor = new int[tamanho];
		int foraDeOrdem = (int) (vetor.length / 10); // Calcula 10% do tamanho do vetor
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (i+1);
		}
		
        for (int i = 0, temp; i < foraDeOrdem; i++) {
            int posicaoAleatoria = random.nextInt(vetor.length);
            
            // Troca os valores de duas posições aleatórias
            temp = vetor[i];
            vetor[i] = vetor[posicaoAleatoria];
            vetor[posicaoAleatoria] = temp;
        }
		
		return vetor;
	}
}
