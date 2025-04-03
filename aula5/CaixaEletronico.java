package aula5;

import java.util.Scanner;
import java.util.UUID;

public class CaixaEletronico {

	private static double saldo = 0.00;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		String usuario, senha, idBanco = UUID.randomUUID().toString();
		int options;

		// Entrada
		System.out.println(
				"Seja bem vindo, vamos analisar o saldo da sua conta bancária para saque, depósito ou consulta de saldo");
		System.out.print("Insira o seu usuário: ");
		usuario = sc.nextLine();
		System.out.print("Insira sua senha: ");
		senha = sc.nextLine();

		// Processamento
		System.out.println("\nConta: " + usuario);
		System.out.println("Id: " + idBanco);
		do {
			System.out.println("\nEsoclha uma opção:");
			System.out.println("1° Consulta de saldo");
			System.out.println("2° Depósito");
			System.out.println("3° Saque");
			System.out.println("4° Sair");
			options = sc.nextInt();
			switch (options) {
			case 1:
				ConsultaSaldo();
				break;
			case 2:
				Deposito(sc);
				break;
			case 3:
				Saque(sc);
				break;
			case 4:
				System.out.println("Saindo... obrigado");
				break;
			default:
				System.out.println("Opção inválida, escolha novamente por favor");
			}

		} while (options != 4);
		// Saída
		sc.close();

	}

	// Sub-programas ou Métodos

	public static void ConsultaSaldo() {
		System.out.println("Seu saldo atual é de: R$" + saldo);

	}

	public static void Deposito(Scanner sc) {
		System.out.print("Digite o valor do depósito: R$");
		double valordeposito = sc.nextDouble();
		sc.nextLine();
		saldo += valordeposito;
		System.out.printf("Depósito realizado com sucesso. Seu novo saldo é de R$%.2f\n", saldo);
	}

	public static void Saque(Scanner sc) {
		System.out.print("Insira o valor do saque: R$");
		double valorSaque = sc.nextDouble();
		sc.nextLine();

		if (valorSaque <= saldo) {
			saldo -= valorSaque;
			System.out.println("Saque realizado com sucesso. Seu novo saldo é de R$" + saldo);
		} else {
			System.out.println("Saldo insuficiente, você não pode realizar o saque");
		}
	}
}