package aula6;

import java.util.Scanner;

public class VerificarNumeroImparOuPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int num;
		// Entrada
		System.out.println("Vamos ver se o número digitado é ímpar ou par");
		System.out.print("Digite um número(menos 0): ");
		// Processamento / Saída
		while (true) {
			num = sc.nextInt();
			if (num == 0) {
				System.out.println("Programa Encerrado.");
				break;
			} if (num % 2 == 0) {
				System.out.println("O número " + num + " é par");
			}else {
				System.out.println("O número " + num + " é ímpar");
			}
		}
		sc.close();

	}

}