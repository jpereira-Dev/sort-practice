import java.util.Arrays;
import java.util.Scanner;

public class sol {


	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	     String[] partes = sc.nextLine().split(" ");

	     int[] numeros = new int[partes.length];
	      for (int i = 0; i < partes.length; i++) {
	        numeros[i] = Integer.parseInt(partes[i]);
	        }
		particionamento(numeros);
		System.out.println(Arrays.toString(numeros));

	}


	public static void particionamento(int[] v) {

		int pivolt = v[v.length - 1];

		int i = v.length - 1;

		for(int j = i - 1; j >= 0; j--) {

			if(v[j] > pivolt) {
				i -= 1;
				swap(v,i,j);
				System.out.println(Arrays.toString(v));

			}
		}

		swap(v,i,v.length - 1);
		System.out.println(Arrays.toString(v));



	}

public static void swap(int v[], int i, int j) {

		int aux = v[j];
		v[j] = v[i];
		v[i] = aux;

	}

}

