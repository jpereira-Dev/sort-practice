import java.util.Scanner;

public class Solucao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] partes = sc.nextLine().split(" ");

		int[] numeros = new int[partes.length];
		for (int i = 0; i < partes.length; i++) {
			numeros[i] = Integer.parseInt(partes[i]);
		}

		System.out.println(estatisticaOrdem(numeros));

	}
	//4 5 9 1 2 6 8
	public static int estatisticaOrdem(int[] v) {

		int pivot = v[0];
		int i  = 0;

		for(int j = 1; j < v.length ; j++) {

			if( v[j] <= pivot) {
				i+= 1;
				swap(v,i,j);

			}
		}
        swap(v,i,0);
		return i + 1;
	}

	private static void swap(int[] v, int i, int j) {

		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

}

