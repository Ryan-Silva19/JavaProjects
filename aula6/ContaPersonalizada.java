package aula6;

import java.util.Scanner;

public class ContaPersonalizada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int num, sum = 0;
		// Entrada
		System.out.println(
				"Vamos fazer uma conta personalizada, você irá inserir um número e vamos fazer a soma de todos os anteriores até chegar no número digitado.");
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		// Processamento
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("A soma de todos os números de 1 até " + num + " é = " + sum);
		sc.close();
	}

}