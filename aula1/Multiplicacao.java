package aula1;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int x, y, multiplication;
		// Entrada
		System.out.println("Digite o primeiro numero");
		x = sc.nextInt();
		System.out.println("Digite o segundo numero");
		y = sc.nextInt();
		// Processamento
		multiplication = x * y;
		// Saída
		System.out.println("A multiplicação = " + multiplication);
		sc.close();
	}

}