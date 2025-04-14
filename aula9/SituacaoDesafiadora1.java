package aula9;

import java.util.Scanner;

public class SituacaoDesafiadora1 {

	public static void main(String[] args) {
		// Variáveis
		Scanner sc = new Scanner(System.in);
		double[] vetor = new double[8];
		/*vetor[0] = bruto, vetor[1] = inss, vetor[2] = imposto de renda, vetor[3] = vale transporte
		vetor[4] = vale alimentação, vetor[5] = vale refeição, vetor[6] = plano de saúde basico
		vetor[7] = plano de saúde avançado, vetor[8] = salário líquido*/
		// Entrada
		System.out.println("Seja bem vindo, nesse prrograma vamos calcular\n"
				+ "o salário bruto e subtrair dos descontos");
		System.out.print("Insira o salário bruto: R$ ");
		vetor[0] = sc.nextDouble();
		System.out.print("Recebe vale transporte ?  [s/n]");
		char vt = sc.next().toUpperCase().charAt(0);
		switch (vt) {
		case 'S':
			vetor[7] = vetor[0] - (6/100);
			
			break;
		case 'N':

		default:
			break;
		}
		// Processamento
		//vetor[8] = 0;
		// Saída
		System.out.println(vetor[7]);
	}

}
