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
		int min = sc.nextInt();
		System.out.println(Arrays.toString(coutingSort(numeros,max,min)));

	}

	private static int[] coutingSort(int[] v, int maxElement, int minElement) {

		int salto = Math.abs(minElement);
		int[] c = new int[maxElement + salto + 1] ;

		System.out.println(c.length);
		for(int i = 0; i < v.length; i++) {
			c[v[i] + salto] += 1;
			System.out.println(Arrays.toString(c));
		}

		for(int j = 1; j < c.length; j++) {
			c[j] = c[j] + c[j - 1];

		}//3 1 1 6 4 -2 7
		System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(c));
		int[] b = new int[v.length];

		for(int k = v.length - 1; k>= 0; k--) {

			b[c[v[k] + salto] - 1] = v[k];
			c[v[k] + salto] --;
		}
		System.out.println(Arrays.toString(c));
		return b;
	}

    private static String imprimeArray(String array) {

		return array.replace("[", "").replace(",","").replace("]", "");
	}

}

