package Aula06;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int num;
		long factorial;
		// Entrada
		System.out.println("Nesse progrma vamos calcular o fatorial do número escolhido");
		// Processamento
		do {
			System.out.print("Digite um número para calcular o fatorial: ");
			num = sc.nextInt();

			if (num < 0) {
				System.out.println("Não podemos fazer fatorial negativo");
			} else {
				factorial = 1;
				if (num == 0) {
					System.out.println("O fatorial de " + num + " é = 1");
				} else {
					for (int i = 1; i <= num; i++) {
						factorial *= i;
					}
					// Saída
					System.out.println("O fatorial de " + num + " é = " + factorial);
				}
			}
		} while (num < 0);
		sc.close();
	}
}
