package Aula6;

import java.util.Scanner;

public class OddOrEvenCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int num;
		// Entrada
		System.out.println("Seja bem vindo caro usuário, vamos analisar se o número digitado por você é ímpar ou par");
		System.out.print("Digite algum número inteiro: ");
		num = sc.nextInt();
		// Processamento/ Saída
		if (num % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar");
		}
		sc.close();
	}
	
}