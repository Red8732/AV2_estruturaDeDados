package algoritmosOrdenacao;

public class SelectionSort {
	
	public int[] selectionSort(int[] vetor, String tipoDoVetor) {
		int comparacoes = 0;
		int movimentacoes = 0;
		
		long tempoinicial = System.nanoTime();
        for (int i = 0; i < vetor.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int tmp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = tmp;
        }
        long tempofinal = System.nanoTime();
        long tempototal = tempofinal - tempoinicial;

        System.out.println("Tempo de Processamento de SelectionSort em nanosegundos: " + tempototal + "ns" + "  --->  " + (tempototal * 0.000000001) + " segundos."
 			   + "\n\nTipo do vetor: " + tipoDoVetor + ", de tamanho: " + vetor.length
 			   + "\nNumero de comparacoes de chaves: " + comparacoes
 			   + "\nNumero de movimentacoes de registro efetuadas: " + movimentacoes);
        return vetor;
    }
}
