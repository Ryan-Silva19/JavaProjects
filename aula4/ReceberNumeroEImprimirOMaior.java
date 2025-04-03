package aula4;

import java.util.Scanner;

public class ReceberNumeroEImprimirOMaior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double num1, num2;
		// Entrada
		System.out.println("Nesse programa vamos receber dois números e vamos mostrar o maior");
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		// Processamento / Saída
		if (num1 > num2) {
			System.out.println("o maior número é o " + num1);
		} else {
			System.out.println("O maior número é o número " + num2);
		}
		sc.close();
	}

}