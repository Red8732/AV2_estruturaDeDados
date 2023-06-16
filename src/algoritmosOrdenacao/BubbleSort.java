package algoritmosOrdenacao;

public class BubbleSort {
	
	public int[] bubbleSort(int vetor[], String tipoDoVetor) {
		int comparacoes = 0;
		int movimentacoes = 0;
		
		long tempoinicial = System.nanoTime();
        for (int i = vetor.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
        long tempofinal = System.nanoTime();
        long tempototal = tempofinal - tempoinicial;
        
        System.out.println("Tempo de Processamento de BubbleSort em nanosegundos: " + tempototal + "ns" + "  --->  " + (tempototal * 0.000000001) + " segundos."
 			   + "\n\nTipo do vetor: " + tipoDoVetor + ", de tamanho: " + vetor.length
 			   + "\nNumero de comparacoes de chaves: " + comparacoes
 			   + "\nNumero de movimentacoes de registro efetuadas: " + movimentacoes);
        return vetor;
	}
}
