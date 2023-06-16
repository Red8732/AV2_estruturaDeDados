package algoritmosOrdenacao;

public class InsertionSort {
	
	public int[] insertionSort(int[] vetor, String tipoDoVetor) {
		int comparacoes = 0;
		int movimentacoes = 0;
		
        long tempoinicial = System.nanoTime();
        for (int i = 0; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= atual) {
                vetor[j + 1] = vetor[j];
                j--;
                comparacoes++;
                movimentacoes++;
            }
            vetor[j + 1] = atual;
            movimentacoes++;
        }
        long tempofinal = System.nanoTime();
        long tempototal = tempofinal - tempoinicial;
        
        System.out.println("Tempo de Processamento de InsertionSort em nanosegundos: " + tempototal + "ns" + "  --->  " + (tempototal * 0.000000001) + " segundos."
        			   + "\n\nTipo do vetor: " + tipoDoVetor + ", de tamanho: " + vetor.length
        			   + "\nNumero de comparacoes de chaves: " + comparacoes
        			   + "\nNumero de movimentacoes de registro efetuadas: " + movimentacoes);
        return vetor;
    }
}
