import java.util.Scanner;

public class Solucao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] partes = sc.nextLine().split(" ");

		int[] numeros = new int[partes.length];
		for (int i = 0; i < partes.length; i++) {
			numeros[i] = Integer.parseInt(partes[i]);
		}
		int alvo = sc.nextInt();
	}

	public static void mergeSort(int[] v, int start, int end) {

		if(start < end) {

			int midlle = (start + end) / 2;
			mergeSort(v, start, midlle);
			mergeSort(v, midlle + 1, end);
			merge(v,start,end);
		}


	}

	private static void merge(int[] v, int start, int end) {


		int sizeAux = (end - start);
		int[] aux = new int[sizeAux + 1];

		for(int i = 0; i <= sizeAux; i++) {

			aux[i] = v[start + i];
		}


		int middle = sizeAux/ 2;
		int i = 0;
		int j = middle + 1;
		int k = start;

		while( i <= middle && j <= sizeAux) {

			if(aux[i] < aux[j]) {
				v[k] = aux[i];
				i++;
			}
			else {
				v[k] = aux[j];
				j++;
			}
			k++;
		}
		while(i <= middle) {
			v[k++] = aux[i++];
		}
	}

	public static String encontrarPar(int[] v, int alvo) {

        mergeSort(v,0,v.length - 1); //ordena o array

		int i = 0;
		int j = v.length - 1;

		while(i <= j) {
			int soma = v[i] + v[j]; // soma os elementos

			if(soma == alvo) {
				return String.format("SIM: %d + %d = %d", v[i],v[j], alvo);
			}
			else if(soma < alvo) { // soma < alvo, precisamos de número maior
				i++;
			}
			else {  // soma > alvo, precisamos de um número menor
				j--;
			}
		}
		return "NAO";

    }
}

