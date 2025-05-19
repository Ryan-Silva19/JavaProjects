package aula10;

import java.util.Scanner;

public class CofrinhoInteligente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int deposito, options, meta;
		double saldo, total;
		// Entrada
		System.out.println(
				"Seja bem vindo, vamos fazer um um programa" + "que calcule o as moedas\nque você colocar, seja de "
						+ "1 centavo, 5, 10, 25 ou 50 centavos e 1 real.\nE qual "
						+ "seria o tempo para chegar a sua meta de R$100 reais"
						+ " depositando a mesma quantidade toda semana.");
		do {
			System.out.println("Qual a unidade que irá adicionar ?");
			System.out.println("1. 0,01 centavo\n2. 0,05 centavos\n" + "3. 0,10 centavos\n4. 0,25 centavos\n"
					+ "5. 0,50 centavos\n6. 1 real\n7. Nada");
			options = sc.nextInt();
			saldo = 0;
			switch (options) {
			case 1:
				System.out.println("Quantas moedas de R$0,1 centavo quer colocar ?");
				deposito = sc.nextInt();
				if (deposito == 0) {
					break;
				}
				saldo += 0.01 * deposito;
				break;
			case 2:
				System.out.println("Quantas moedas de R$0,5 centavos quer colocar?");
				deposito = sc.nextInt();
				if (deposito == 0) {
					break;
				}
				saldo += 0.05 * deposito;
				break;
			case 3:
				System.out.println("Quantas moedas de R$0,10 centavos quer colocar?");
				deposito = sc.nextInt();
				if (deposito == 0) {
					break;
				}
				saldo += 0.10 * deposito;
				break;
			case 4:
				System.out.println("Quantas moedas de R$0,25 centavos quer colocar?");
				deposito = sc.nextInt();
				if (deposito == 0) {
					break;
				}
				saldo += 0.25 * deposito;
				break;
			case 5:
				System.out.println("Quantas moedas de R$0,50 centavos quer colocar?");
				deposito = sc.nextInt();
				if (deposito == 0) {
					break;
				}
				saldo += 0.50 * deposito;
				break;
			case 6:
				System.out.println("Quantas moedas de R$1 real quer colocar?");
				deposito = sc.nextInt();
				if (deposito == 0) {
					break;
				}
				saldo += 1 * deposito;
				break;
			case 7:
				System.out.println("Está ok, até o próximo depósito!");

				break;
			default:
				System.out.println("Error...");
				break;
			}
		} while (options != 7);
		// Processamento
		meta = 100;
		total = 0;
		total = meta / saldo;
		System.out.printf("%.2f", total);
	}
	// Saída

}
