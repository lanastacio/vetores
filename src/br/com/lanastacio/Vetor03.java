package br.com.lanastacio;

import java.util.Arrays;

public class Vetor03 {

	public static void main(String[] args) {
		
/*		int num[] = {3, 5, 1, 8, 4};
		
		for (int valor: num) {
			System.out.println(valor);
		}
*/
		
		double v[] = {3.5, 2.75, 9, -4.5};
		Arrays.sort(v);
		
		for (double valor: v) {
			
			System.out.print(valor + " ");
		}
	}

}
