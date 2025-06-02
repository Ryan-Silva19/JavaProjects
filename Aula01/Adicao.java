package Aula01;

import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int num1, num2, addition;
		// Entrada
		System.out.println("digite o primeiro numero");
		num1 = sc.nextInt();
		System.out.println("digite o segundo numero");
		num2 = sc.nextInt();
		// Processamento
		addition = num1 + num2;
		// Saída
		System.out.println("A soma = " + addition);
		sc.close();
	}

}
