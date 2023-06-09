package algoritmosOrdenacao;

public class HeapSort {
	
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
            if (vetor[max] > vetor[pos]) {
                swap(vetor, max, pos);
                maxHeapify(vetor, max, tamanhoDoVetor);
            }
        }
    }

    public static void swap(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
    
    public int[] heapSort(int[] array) {
        long tempoinicial = System.currentTimeMillis();
        array = HeapSort.sort(array);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de HeapSort: " + tempototal + "ms");
        return array;
    }
}
