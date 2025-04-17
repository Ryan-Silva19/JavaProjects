package aula9;

import java.util.Scanner;

public class SituacaoDesafiadora1 {

	public static void main(String[] args) {

		// Variáveis
		Scanner sc = new Scanner(System.in);
		double[] vetor = new double[10];
		/*
		 * vetor[0] = bruto, vetor[1] = inss, vetor[2] = imposto de renda, vetor[3] =
		 * dependenetes, vetor[4] = vale transporte vetor[5] = vale alimentação,
		 * vetor[6] = vale refeição, vetor[7] = plano de saúde basico vetor[8] = plano
		 * de saúde avançado, vetor[9] = salário líquido
		 */
		// Entrada

		System.out.println(
				"Seja bem vindo, nesse prrograma vamos calcular\n" + "o salário bruto e subtrair dos descontos");
		System.out.print("Insira o salário bruto: R$ ");
		vetor[0] = sc.nextDouble();
		// Processamento
		// Aplicando o desconto do INSS
		vetor[1] = 0;
		if (vetor[0] <= 1302) {
			vetor[1] += 0.08 * vetor[0];
			System.out.printf("inss = -R$%.2f\n", vetor[1]);
		} else if (vetor[0] > 1302 && vetor[0] <= 2571) {
			vetor[1] += 0.09 * vetor[0];
			System.out.printf("inss = -R$%.2f\n", vetor[1]);
		} else if (vetor[0] > 2571 && vetor[0] <= 3856) {
			vetor[1] += 0.11 * vetor[0];
			System.out.printf("inss = -R$%.2f\n", vetor[1]);
		} else if (vetor[0] > 3856 && vetor[0] < 7087.22) {
			vetor[1] += 0.14 * vetor[0];
			System.out.printf("inss = -R$%.2f\n", vetor[1]);
		} else {
			vetor[1] += 570.88;
			System.out.printf("inss = -R$%.2f\n", vetor[1]);
		}
		// Aplicando o desconto do imposto de renda
		vetor[2] = 0;
		System.out.println("Você tem dependentes ? Se sim, quantos ?");
		vetor[3] = sc.nextDouble();
		switch (vetor[3] > 0 ? 1 : 2) {
		// Caso com dependentes
		case 1:
			if (vetor[0] <= 1903.98) {
				System.out.println("Isento do imposto de renda");
			} else if (vetor[0] > 1903.98 && vetor[0] <= 2826.65) {
				vetor[2] += ((0.075 * vetor[0]) - 142.80) - (vetor[3] *189.59);
			} else if (vetor[0] > 2826.65 && vetor[0] <= 3751.05) {
				vetor[2] += ((0.15 * vetor[0]) - 354.80) - (vetor[3] *189.59);
			} else if (vetor[0] > 3751.05 && vetor[0] <= 4664.68) {
				vetor[2] += ((0.22 * vetor[0]) - 636.13) - (vetor[3] *189.59);
			} else {
				vetor[2] += ((0.275 * vetor[0]) - 869.36) - (vetor[3] *189.59);
			}
			//Verifica se o imposto de renda foi zerado por causa dos dependentes
			if (vetor[2] <= 0) {
				vetor[2] = 0;
				System.out.println("O imposto de renda foi zerado por causa dos dependentes.");
			}else {
				System.out.printf("Imposto de renda = -R$%.2f\n",vetor[2]);
			}
			break;
			//Caso sem dependentes
		case 2:
			if (vetor[0] <= 1903.98) {
				System.out.println("Isento do imposto de renda");
			} else if (vetor[0] > 1903.98 && vetor[0] <= 2826.65) {
				vetor[2] += (0.075 * vetor[0]) - 142.80;
				System.out.printf("imposto de renda = -R$%.2f\n", vetor[2]);
			} else if (vetor[0] > 2826.65 && vetor[0] <= 3751.05) {
				vetor[2] += (0.15 * vetor[0]) - 354.80;
				System.out.printf("imposto de renda = -R$%.2f\n", vetor[2]);
			} else if (vetor[0] > 3751.05 && vetor[0] <= 4664.68) {
				vetor[2] += (0.22 * vetor[0]) - 636.13;
				System.out.printf("imposto de renda = -R$%.2f\n", vetor[2]);
			} else {
				vetor[2] += (0.275 * vetor[0]) - 869.36;
				System.out.printf("imposto de renda = -R$%.2f\n", vetor[2]);
			}
			break;
		}
		// Desconto do vale transporte
		vetor[9] = 0;
		System.out.print("Recebe vale transporte ?  [s/n]");
		char vt = sc.next().toUpperCase().charAt(0);
		switch (vt) {
		case 'S':
			vetor[4] = vetor[0] * 0.06;
			vetor[9] += vetor[0] - vetor[4];
			System.out.printf("Desconto do vale transporte: -R$%.2f\n", vetor[4]);
			break;
		case 'N':
			System.out.println("Desconto do vt = R$0,00");
			break;
		}
		// Desconto do vale alimentação
		System.out.println("Recebe vale alimentação ? [s/n]");
		char va = sc.next().toUpperCase().charAt(0);
		switch (va) {
		case 'S':
			vetor[5] = vetor[0] - 200;
			vetor[9] -= vetor[5];

			break;
		case 'N':
			
			break;
		}
		// Saída
		System.out.printf("salário liquido = R$%.2f\n",vetor[9]);
	}

}