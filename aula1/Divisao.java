package aula1;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int x, y, division;
		// Entrada
		System.out.println("digite o primeiro numero");
		x = sc.nextInt();
		System.out.println("digite o segundo numero");
		y = sc.nextInt();
		// Processamento
		division = (x / y);
		// Saída
		System.out.println("A Divisão = " + division);
		sc.close();
	}

}