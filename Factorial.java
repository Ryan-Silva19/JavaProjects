package Aula6;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int num;
		long factorial = 1;
		// Entrada
		System.out.println("Seja bem vindo caro usuário, vamos fazer o cálculo de um número fatorial");
		System.out.print("Digite o número: ");
		num = sc.nextInt();
		// Processamento
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		// Saída
		System.out.println("O fatorial de " + num + " é " + factorial);
		sc.close();
	}

}