package aula6;

import java.util.Scanner;

public class NumerosParesPedidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int num;
		// Entrada
		System.out.println("Vamos analisar o número inserido e vamos dizer os pares que vem antes desse número");
		System.out.print("Insira um número: ");
		num = sc.nextInt();
		// Processamento
		for (int i = 1; i < num; i++) {
			if (i % 2 == 0) {
				System.out.println("Os números pares são " + i);				
			}
		}
		sc.close();
	}

}