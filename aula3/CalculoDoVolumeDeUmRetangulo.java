package aula3;

import java.util.Scanner;

public class CalculoDoVolumeDeUmRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double Volume, Comprimento, Altura, Largura;
		// Entrada
		System.out.println("Cálculo do volume de uma caixa retangular:");
		System.out.print("Digite o valor do comprimento da caixa(em cm): ");
		Comprimento = sc.nextDouble();
		System.out.print("Digite o valor da altura da caixa: ");
		Altura = sc.nextDouble();
		System.out.print("Digite o valor da largura da caixa: ");
		Largura = sc.nextDouble();
		// Processamento
		Volume = Comprimento * Altura * Largura;
		// Saída
		System.out.printf("O volume da caixa = %.2fdm³\n", Volume);
		sc.close();
	}

}