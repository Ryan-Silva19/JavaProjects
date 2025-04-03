package aula8;

import java.util.Scanner;

public class MultiplicacaoPorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int[] array = new int[5];
		int num;
		// Entrada
		System.out.println("Bem vindo! Nesse programa iremos mostrar 5 números, então você irá digitar um número"
				+ " e multiplicaremos todos os números pelo seu número digitado");
		System.out.println("\nPor qual número gostaria de multiplicar ?");
		num = sc.nextInt();
		System.out.print("Os números originais são: ");
		// Processamento
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		// Saída
		System.out.print("\nOs números multiplicados pelo seu número são: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(num * array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		sc.close();
	}

}