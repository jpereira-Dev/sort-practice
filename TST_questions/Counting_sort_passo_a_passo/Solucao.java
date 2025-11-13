import java.util.Arrays;
import java.util.Scanner;

public class Solucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] partes = sc.nextLine().split(" ");

		int[] numeros = new int[partes.length];
		for (int i = 0; i < partes.length; i++) {
			numeros[i] = Integer.parseInt(partes[i]);
		}
		int max = sc.nextInt();

		countingSort(numeros,max);


	}
	public static int[] countingSort(int[] v, int maxElement) {

		int[] c = new int[maxElement + 1];

		String out = "";
		for(int i = 0; i < v.length; i++) {
			c[v[i]] += 1;
			out = Arrays.toString(c);
			System.out.println(imprimeArray(out));

		}

		for(int j = 1; j < c.length; j++) {
			c[j] = c[j] + c[j - 1];
		}
		System.out.println("Cumulativa do vetor de contagem - " + imprimeArray(Arrays.toString(c)));

		int[] b = new int[v.length];
		for(int k = v.length - 1; k >= 0; k--) {
			b[c[v[k]] - 1] = v[k];
			c[v[k]]--;
		}

		System.out.println(imprimeArray(Arrays.toString(c)));
		System.out.println(imprimeArray(Arrays.toString(b)));
		return b;
	}

	private static String imprimeArray(String array) {

		return array.replace("[", "").replace(",","").replace("]", "");


	}

}

