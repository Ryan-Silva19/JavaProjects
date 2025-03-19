package Aula6;

import java.util.Scanner;

public class AdditionChosedByUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int i, num, sum = 0;
		// Entrada
		System.out.println("Caro usuário, nesse programa você irá escolher um número, e iremos somar os números anteriores até chegar no número escolhido por você");
		System.out.print("Escolha um número: ");
		num = sc.nextInt();
		// Processamento
		for (i = 1; i <= num; i++) {
			sum+= i;
		}
		// Saída
		System.out.println("A soma dos números de 1 até " + num + " é " + sum);
		sc.close();
	}

}