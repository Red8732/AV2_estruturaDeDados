package executar;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import algoritmosOrdenacao.BubbleSort;
import algoritmosOrdenacao.HeapSort;
import algoritmosOrdenacao.InsertionSort;
import algoritmosOrdenacao.MergeSort;
import algoritmosOrdenacao.QuickSort;
import algoritmosOrdenacao.SelectionSort;
import vetores.Aleatorio;
import vetores.InversamenteOrdenado;
import vetores.QuaseOrdenado;

public class Executar {
	
	private static InversamenteOrdenado i = new InversamenteOrdenado();
	private static Aleatorio a = new Aleatorio();
	private static QuaseOrdenado q = new QuaseOrdenado();
	private static InsertionSort insertion = new InsertionSort();
	private static SelectionSort selection = new SelectionSort();
	private static BubbleSort bubble = new BubbleSort();
	private static MergeSort merge = new MergeSort();
	private static QuickSort quick = new QuickSort();
	private static HeapSort heap = new HeapSort();
	
	public static void main(String[] args) throws IOException {
		
// ===================================================================
		
// Exemplo de como executar o InsertionSort com um vetor do tipo Aleatorio:
		
	 /* int[] vetor = a.preencher(tamanhoDoVetor);
	  
		gerarArquivo(vetor, "insertionSort-antes");
		vetor = insertion.insertionSort(vetor, "Aleatorio");
		gerarArquivo(vetor, "insertionSort-depois"); */
		
// ===================================================================
		
		int[] vetor1 = i.preencher(1000);
		
		gerarArquivo(vetor1, "quickSort-antes");
		vetor1 = quick.quickSort(vetor1, "Inversamente Ordenado");
		gerarArquivo(vetor1, "quickSort-depois");
		
	}
	
	public static void print(int[] vetor) {
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	
	public static void gerarArquivo(int[] vetor, String nomeDoVetor) throws IOException {
		File directory = new File("C:/av2-ED/");
		
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/av2-ED/" + nomeDoVetor + ".txt"))) {
            for (int i = 0; i < vetor.length; i++) {
                writer.write("Indice: " + i + "    ;    Valor armazenado: " + vetor[i]);
                writer.newLine();
            }
            Desktop.getDesktop().open(directory);
        } catch (IOException e) {
            System.err.println("Erro ao imprimir o vetor no arquivo: " + e.getMessage());
        }
    }
}
