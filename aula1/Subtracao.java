package aula1;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int x, y, z, subtraction;
		// Entrada
		System.out.println("digite o primeiro numero");
		x = sc.nextInt();
		System.out.println("digite o segundo numero");
		y = sc.nextInt();
		System.out.println("digite o terceiro numero");
		z = sc.nextInt();
		// Processamento
		subtraction = x - y - z;
		// Saída
		System.out.println("A subtração = " + subtraction);
		sc.close();

	}

}