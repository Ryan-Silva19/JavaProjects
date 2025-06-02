package Aula09;

import java.util.Scanner;

public class SituacaoDesafiadora1 {

	public static void main(String[] args) {

		// Variáveis

		Scanner sc = new Scanner(System.in);
		double[] vetor = new double[10];

		// Entrada

		System.out.println(
				"Seja bem vindo, nesse prrograma vamos calcular\n" + "o salário bruto e subtrair dos descontos");
		System.out.print("Insira o salário bruto: R$ ");
		// vetor[0] = salário bruto
		vetor[0] = sc.nextDouble();

		// Processamento

		// Aplicando o desconto do INSS
		// vetor[1] = inss
		vetor[1] = 0.00;
		// vetor[9] = salário líquido
		vetor[9] = vetor[0];
		if (vetor[0] <= 1302.00) {
			vetor[1] += 0.08 * vetor[0];
			vetor[9] -= vetor[1];
			System.out.printf("inss = -R$%.2f\n", vetor[1]);
		} else if (vetor[0] > 1302.00 && vetor[0] <= 2571.00) {
			vetor[1] += 0.09 * vetor[0];
			vetor[9] -= vetor[1];
			System.out.printf("inss = -R$%.2f\n", vetor[1]);
		} else if (vetor[0] > 2571.00 && vetor[0] <= 3856.00) {
			vetor[1] += 0.11 * vetor[0];
			vetor[9] -= vetor[1];
			System.out.printf("inss = -R$%.2f\n", vetor[1]);
		} else if (vetor[0] > 3856.00 && vetor[0] < 7087.22) {
			vetor[1] += 0.14 * vetor[0];
			vetor[9] -= vetor[1];
			System.out.printf("inss = -R$%.2f\n", vetor[1]);
		} else {
			vetor[1] += 570.88;
			vetor[9] -= vetor[1];
			System.out.printf("inss = -R$%.2f\n", vetor[1]);
		}
		// Aplicando o desconto do imposto de renda
		// vetor[2] = imposto de renda
		vetor[2] = 0.00;
		while (true) {
			try {
				System.out.println("Você tem dependentes ? Se sim, quantos ? se não, digite 0");
				// vetor[3] = dependenetes
				vetor[3] = sc.nextDouble();
				break;
			} catch (java.util.InputMismatchException e) {
				System.out.println("Entrada inválida... Digite apenas números!");
				sc.nextLine();
			}
		}
		// Caso com dependentes
		switch (vetor[3] > 0.00 ? 1 : 2) {
		case 1:
			if (vetor[0] <= 1903.98) {
				System.out.println("Isento do imposto de renda");
			} else if (vetor[0] > 1903.98 && vetor[0] <= 2826.65) {
				vetor[2] += ((0.075 * vetor[0]) - 142.80) - (vetor[3] * 189.59);
				vetor[9] -= vetor[2];
			} else if (vetor[0] > 2826.65 && vetor[0] <= 3751.05) {
				vetor[2] += ((0.15 * vetor[0]) - 354.80) - (vetor[3] * 189.59);
				vetor[9] -= vetor[2];
			} else if (vetor[0] > 3751.05 && vetor[0] <= 4664.68) {
				vetor[2] += ((0.22 * vetor[0]) - 636.13) - (vetor[3] * 189.59);
				vetor[9] -= vetor[2];
			} else {
				vetor[2] += ((0.275 * vetor[0]) - 869.36) - (vetor[3] * 189.59);
				vetor[9] -= vetor[2];
			}
			// Verifica se o imposto de renda foi zerado por causa dos dependentes
			if (vetor[2] <= 0.00) {
				vetor[2] = 0.00;
				System.out.println("O imposto de renda foi zerado por causa dos dependentes.");
			} else {
				System.out.printf("Imposto de renda = -R$%.2f\n", vetor[2]);
			}
			break;
		// Caso sem dependentes
		case 2:
			if (vetor[0] <= 1903.98) {
				vetor[9] = vetor[0];
				System.out.println("Isento do imposto de renda");
			} else if (vetor[0] > 1903.98 && vetor[0] <= 2826.65) {
				vetor[2] += (0.075 * vetor[0]) - 142.80;
				vetor[9] -= vetor[2];
				System.out.printf("imposto de renda = -R$%.2f\n", vetor[2]);
			} else if (vetor[0] > 2826.65 && vetor[0] <= 3751.05) {
				vetor[2] += (0.15 * vetor[0]) - 354.80;
				vetor[9] -= vetor[2];
				System.out.printf("imposto de renda = -R$%.2f\n", vetor[2]);
			} else if (vetor[0] > 3751.05 && vetor[0] <= 4664.68) {
				vetor[2] += (0.22 * vetor[0]) - 636.13;
				vetor[9] -= vetor[2];
				System.out.printf("imposto de renda = -R$%.2f\n", vetor[2]);
			} else {
				vetor[2] += (0.275 * vetor[0]) - 869.36;
				vetor[9] -= vetor[2];
				System.out.printf("imposto de renda = -R$%.2f\n", vetor[2]);
			}
			break;
		}
		// Desconto do vale transporte
		// vetor[4] = vale transporte
		vetor[4] = 0.00;
		char vt;
		while (true) {
			try {
				System.out.println("Recebe vale transporte ?  [s/n]");
				vt = sc.next().toUpperCase().charAt(0);
				if (vt == 'S' || vt == 'N') {
					break;
				} else {
					System.out.println("Entrada inválida, por favor digite apenas sim ou não.");
				}
			} catch (Exception e) {
				System.out.println("Ocorreu um erro... tente novamente");
				sc.nextLine();
			}
		}
		switch (vt) {
		case 'S':
			vetor[4] = vetor[0] * 0.06;
			vetor[9] -= vetor[4];
			System.out.printf("Desconto do vale transporte: -R$%.2f\n", vetor[4]);
			break;
		case 'N':
			System.out.println("Desconto do vt = R$0,00");
			break;
		}
		// Desconto do vale alimentação
		// vetor[5] = vale alimentação
		vetor[5] = 0.00;
		char va;
		while (true) {
			try {
				System.out.println("Recebe vale alimentação ? [s/n]");
				va = sc.next().toUpperCase().charAt(0);
				if (va == 'S' || va == 'N') {
					break;
				} else {
					System.out.println("Entrada inválida, por favor digite apenas sim ou não. ");
				}
			} catch (Exception e) {
				System.out.println("Ocorreu um erro... tente novamente");
			}
		}
		switch (va) {
		case 'S':
			vetor[5] = 200;
			vetor[9] -= vetor[5];
			System.out.printf("Desconto do vale alimentação = -R$%.2f\n", vetor[5]);
			break;
		case 'N':
			System.out.println("Desconto do va = R$0,00");
			break;
		}
		// Desconto do vale refeição
		// vetor[6] = vale refeição
		vetor[6] = 0.00;
		System.out.println("Recebe vale refeição ? [s/n]");
		char vr;
		while (true) {
			try {
				vr = sc.next().toUpperCase().charAt(0);
				if (vr == 'S' || vr == 'N') {
					break;
				} else {
					System.out.println("Entrada inválida, por favor digite apenas sim ou não");
				}
			} catch (Exception e) {
				System.out.println("Ocorreu um erro... tente novamente");
			}
		}
		switch (vr) {
		case 'S':
			vetor[6] = 250.00;
			vetor[9] -= vetor[6];
			System.out.printf("Desconto do vale refeição = -R$%.2f\n", vetor[6]);
			break;
		case 'N':
			System.out.println("Desconto do vr = R$0,00");
			break;
		}
		// Desconto do plano de saúde
		// vetor[7] = plano de saúde basico
		vetor[7] = 0.00;
		// vetor[8] = plano de saúde avançado
		vetor[8] = 0.00;
		System.out.println("Você recebe plano de saúde ? Se sim, qual plano ? Basico, Avançado ou Nenhum ??");
		char plano;
		while (true) {
			try {
				plano = sc.next().toUpperCase().charAt(0);
				if (plano == 'B' || plano == 'A' || plano == 'N') {
					break;
				} else {
					System.out.println("Entrada inválida, por favor digite apenas basico, avançado ou não");
				}
			} catch (Exception e) {
				System.out.println("Ocorreu um erro... tente novamente");
			}

		}
		switch (plano) {
		case 'B':
			vetor[7] = 150.00;
			vetor[9] -= vetor[7];
			System.out.printf("Desconto do plano básico = -R$%.2f\n", vetor[7]);
			break;
		case 'A':
			vetor[8] = 300.00;
			vetor[9] -= vetor[8];
			System.out.printf("Desconto do plano avançado = -R$%.2f\n", vetor[8]);
			break;
		case 'N':
			System.out.println("Desconto do plano de saúde = R$0,00");
			break;
		}
		
		// Saída

		System.out.printf(
				"Salário Bruto = R$%.2f\n" + "Desconto INSS = -R$%.2f\n" + "Desconto imposto de renda = -R$%.2f\n"
						+ "Desconto vale transporte = -R$%.2f\n" + "Desconto vale alimentação = -R$%.2f\n"
						+ "Desconto vale refeição = -R$%.2f\n" + "Desconto Plano de saúde básico = -R$%.2f\n"
						+ "Desconto Plano de saúde avançado = -R$%.2f\n" + "Salário liquído = R$%.2f",
				vetor[0], vetor[1], vetor[2], vetor[4], vetor[5], vetor[6], vetor[7], vetor[8], vetor[9]);
		sc.close();
	}

}
