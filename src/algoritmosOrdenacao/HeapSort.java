package algoritmosOrdenacao;

public class HeapSort {
	
	private static int comparacoes = 0;
	private static int movimentacoes = 0;
	
	public static int[] sort(int[] v) {
        buildMaxHeap(v);
        int n = v.length;

        for (int i = v.length - 1; i > 0; i--) {
            swap(v, i, 0);
            maxHeapify(v, 0, --n);
        }
        return v;
    }

    private static void buildMaxHeap(int[] v) {
        for (int i = v.length / 2 - 1; i >= 0; i--) {
            maxHeapify(v, i, v.length);
        }
    }

    private static void maxHeapify(int[] vetor, int pos, int tamanhoDoVetor) {

        int max = 2 * pos + 1, right = max + 1;
        
        if (max < tamanhoDoVetor) {
        	
            if (right < tamanhoDoVetor && vetor[max] < vetor[right]) {
                max = right;
            }
            comparacoes++;
            if (vetor[max] > vetor[pos]) {
                swap(vetor, max, pos);
                movimentacoes++;
                maxHeapify(vetor, max, tamanhoDoVetor);
            }
        }
    }

    public static void swap(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
    
    public int[] heapSort(int[] array, String tipoDoVetor) {
        long tempoinicial = System.nanoTime();
        array = HeapSort.sort(array);
        long tempofinal = System.nanoTime();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de HeapSort em nanosegundos: " + tempototal + "ns" + "  --->  " + (tempototal * 0.000000001) + " segundos."
 			   + "\n\nTipo do vetor: " + tipoDoVetor + ", de tamanho: " + array.length
 			   + "\nNumero de comparacoes de chaves: " + comparacoes
 			   + "\nNumero de movimentacoes de registro efetuadas: " + movimentacoes);
        return array;
    }
}
