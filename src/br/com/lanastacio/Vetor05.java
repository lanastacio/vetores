package br.com.lanastacio;

import java.util.Arrays;

public class Vetor05 {

	public static void main(String[] args) {
		
		int v [] = new int[20];
		Arrays.fill(v, 100);
		for (int valor: v) {
			System.out.print(valor + " ");
		}

	}

}
