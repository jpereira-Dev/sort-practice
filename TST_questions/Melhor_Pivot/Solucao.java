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
	      int a = sc.nextInt();
	      int b = sc.nextInt();
		System.out.println(melhorPivot(numeros,a,b));

	}
	public static int melhorPivot(int[] v, int i, int j) {

		int maiorElemento = buscaMaiorElemento(v);
		int menorElemento = buscaMenorElemento(v);

		int melhorPivolt = (maiorElemento + menorElemento)/ 2;

        if(Math.abs(v[i] - melhorPivolt) == Math.abs(v[j] - melhorPivolt)) {
			return i;
		}

		else if(Math.abs(v[i] - melhorPivolt) < Math.abs(v[j] - melhorPivolt)) {
			return i;
		}
		else {
			return j;
		}

	}

	private static int buscaMaiorElemento(int[] v) {

	int maiorElemento = v[0];

	for(int j = 1; j < v.length ; j++) {

		if(v[j] > maiorElemento) {
			 maiorElemento = v[j];
		}
	}
	return maiorElemento;
	}

	private static int buscaMenorElemento(int[] v) {
		int menorElemento = v[0];

		for(int j = 1; j < v.length ; j++) {

			if(v[j] < menorElemento) {
				 menorElemento = v[j];
			}
		}
		return menorElemento;
	}

}

