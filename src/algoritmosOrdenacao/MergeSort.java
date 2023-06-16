package algoritmosOrdenacao;

public class MergeSort {
	
	private static int comparacoes = 0;
	private static int movimentacoes = 0;
	
	public static int[] sort(int[] array) {
	       
        if (array.length <= 1) {
            return array;
        }
        int meio = array.length / 2;
        int[] dir = array.length % 2 == 0 ? new int[meio] : new int[meio + 1];
        int[] esq = new int[meio];

        int[] aux = new int[array.length];

        for (int i = 0; i < meio; i++) {
            esq[i] = array[i];
        }

        int auxIndex = 0;
        for (int i = meio; i < array.length; i++) {
            dir[auxIndex] = array[i];
            auxIndex++;
        }

        esq = sort(esq);
        dir = sort(dir);

        aux = mergesort(esq, dir);

        return aux;
    }

    static int[] mergesort(int[] esq, int[] dir) {
        int[] aux = new int[esq.length + dir.length];

        int indexDir = 0, indexEsq = 0, indexAux = 0;
        
        while (indexEsq < esq.length || indexDir < dir.length) {
            comparacoes++;
        	if (indexEsq < esq.length && indexDir < dir.length) {
                if (esq[indexEsq] <= dir[indexDir]) {
                    aux[indexAux] = esq[indexEsq];
                    indexAux++;
                    indexEsq++;
                } else {
                    aux[indexAux] = dir[indexDir];
                    indexAux++;
                    indexDir++;
                }
                movimentacoes++;
            } else if (indexEsq < esq.length) {
                aux[indexAux] = esq[indexEsq];
                indexAux++;
                indexEsq++;
                movimentacoes++;
            } else if (indexDir < dir.length) {
                aux[indexAux] = dir[indexDir];
                indexAux++;
                indexDir++;
                movimentacoes++;
            }
        }
        return aux;
    }
    
    public int[] mergeSort(int[] array, String tipoDoVetor) {
        long tempoinicial = System.nanoTime();
        array = MergeSort.sort(array);
        long tempofinal = System.nanoTime();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de MergeSort em nanosegundos: " + tempototal + "ns" + "  --->  " + (tempototal * 0.000000001) + " segundos."
 			   + "\n\nTipo do vetor: " + tipoDoVetor + ", de tamanho: " + array.length
 			   + "\nNumero de comparacoes de chaves: " + comparacoes
 			   + "\nNumero de movimentacoes de registro efetuadas: " + movimentacoes);
        return array;
    }
}
