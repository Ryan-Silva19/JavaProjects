package Aula6;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int i = 1;
		double num;	
		// Entrada
		System.out.println("vamos fazer a tabuada do 1 ao 10");
		System.out.print("Digite um número: ");
		num = sc.nextDouble();
		// Processamento
		do {
			System.out.println(num + " X " + i + " = " + (num*i));
			i++;
		} while (i <= 10);
		// Saída
		sc.close();
	}

}