package algoritmosOrdenacao;

public class InsertionSort {
	
	public int[] insertionSort(int[] vetor, String tipoDoVetor) {
		// int numeroDeMovimentacoes = 0;
        long tempoinicial = System.nanoTime();
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
        long tempofinal = System.nanoTime();
        long tempototal = tempofinal - tempoinicial;
        
        System.out.println("Tempo de Processamento de InsertionSort em nanosegundos: " + tempototal + "ns" + "  --->  " + (tempototal * 0.000000001) + " segundos."
        			   + "\n\nTipo do vetor: " + tipoDoVetor + ", de tamanho: " + vetor.length
        			   + "\nNumero de comparacoes de chaves: " + null 
        			   + "\nNumero de movimentacoes de registro efetuadas: " + null);
        // System.out.println("Numero de Movimentações de Registros: " + numeroDeMovimentacoes );
        return vetor;
    }
}
