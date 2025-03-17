package Aula6;

import java.util.Scanner;

public class RequestedEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int i, num;
		// Entrada
		System.out.println("Bem vindo, vamos mostrar pra você os números pares com base no número pedido");
		System.out.println("Digite um número que iremos informar os pares antes dele");
		num = sc.nextInt();
		// Processamento/ Saída
		for (i = 1; i < num; i++) {
			if (i % 2 == 0) {
				System.out.println("Os números pares antes do número pedido são: " + i);				
			}
		}
		sc.close();
	}

}
