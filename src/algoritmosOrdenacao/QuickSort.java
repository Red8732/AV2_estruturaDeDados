package algoritmosOrdenacao;

public class QuickSort {

	private static int comparacoes = 0;
	private static int movimentacoes = 0;
	
    public static int[] quickSort(int vet[], int ini, int fim) {

        int meio;
        if (ini < fim) {
            meio = partition(vet, ini, fim);
            quickSort(vet, ini, meio);
            quickSort(vet, meio + 1, fim);
        }
        return vet;
    }

    public static int partition(int vet[], int ini, int fim) {

        int pivo, topo, i;
        pivo = vet[ini];
        topo = ini;

        for (i = ini + 1; i <= fim; i++) {
        	comparacoes++;
            if (vet[i] < pivo) {
              vet[topo] = vet[i];
              vet[i] = vet[topo + 1];
              topo++;
              movimentacoes++;
            }
        }
        vet[topo] = pivo;
        return topo;
    }
    
    public int[] quickSort(int[] array, String tipoDoVetor) {
        long tempoinicial = System.nanoTime();
        array = QuickSort.quickSort(array, 0, (array.length - 1));
        long tempofinal = System.nanoTime();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de QuickSort em nanosegundos: " + tempototal + "ns" + "  --->  " + (tempototal * 0.000000001) + " segundos."
 			   + "\n\nTipo do vetor: " + tipoDoVetor + ", de tamanho: " + array.length
 			   + "\nNumero de comparacoes de chaves: " + comparacoes
 			   + "\nNumero de movimentacoes de registro efetuadas: " + movimentacoes);
        return array;
    }
}
