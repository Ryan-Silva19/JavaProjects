package aula8;

import java.util.Scanner;

public class ArmazenamentoEmVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int[] vt = new int[5];
		// Entrada
		System.out.println("Nesse programa iremos pedir para você digitar 5 números inteiros e iremos armazenar em uma única variável");
		// Processamento
		for (int i = 0; i < vt.length; i++) {
			System.out.print("Digite um número " + (i+1) + ": ");
			vt[i] = sc.nextInt();
			}
			//Saída
			System.out.println("Os números armazenados no vetor são: ");
			for (int i = 0; i < vt.length; i++) {
			System.out.println(vt[i] + " ");	
			}
			sc.close();
		}
	}