package aula3;

import java.util.Scanner;

public class Prestacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double Pres, Val, Tem, Tax;
		// Entrada
		System.out.println("Prestação de em atraso");
		System.out.print("Digite o valor da prestação: ");
		Val = sc.nextDouble();
		System.out.print("Digite o tempo em atraso(Mês): ");
		Tem = sc.nextDouble();
		System.out.print("Digite o valor da taxa de atraso mensal(em %): ");
		Tax = sc.nextDouble();
		// Processamento
		Pres = Val * Math.pow(1 + (Tax / 100), Tem);
		// Saída
		System.out.printf("O valor da sua prestação é de R$%.2f", Pres);
		sc.close();
	}

}