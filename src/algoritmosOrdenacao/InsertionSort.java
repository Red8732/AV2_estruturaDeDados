package algoritmosOrdenacao;

public class InsertionSort {
	
	public int[] insertionSort(int[] vetor) {
		// int numeroDeMovimentacoes = 0;
        long tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= atual) {
            	// numeroDeMovimentacoes++;
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de InsertionSort: " + tempototal + "ms");
        // System.out.println("Numero de Movimentações de Registros: " + numeroDeMovimentacoes );
        return vetor;
    }
}
