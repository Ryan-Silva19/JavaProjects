package aula9;

import java.util.Scanner;

public class ValidadorDeCPF {

	public static void main(String[] args) {
		// Variáveis
		Scanner sc = new Scanner(System.in);
		String cpf;
		// Entrada
		System.out.println("Seja bem vindo caro usuário, nesse progrma"
				+ "vamos fazer um validador de cpf, se você inserir um cpf\n"
				+ "verdadeiro, vai ser validado, senão vai ser falso");
		System.out.print("Insira um cpf(insira apenas números): ");
		cpf = sc.nextLine();
		// Processamento / Saída
		if (isCPFvalido(cpf)) {
			System.out.println("O cpf é válido!");
		} else {
			System.out.println("O cpf é inválido!");
			sc.close();
		}
	}

	public static boolean isCPFvalido(String cpf) {
		// Remove caracteres não numéricos
		cpf = cpf.replaceAll("\\D", "");
		// Verifica se o cpf tem 11 digitos
		if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
			return false;
		}
		try {
			int[] pesos1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2 };
			int[] pesos2 = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

			int soma = 0;
			for (int i = 0; i < 9; i++) {
				soma += (cpf.charAt(i) - '0') * pesos1[i];
			}
			int digito1 = 11 - (soma % 11);
			if (digito1 > 9)
				digito1 = 0;

			soma = 0;
			for (int i = 0; i < 10; i++) {
				soma += (cpf.charAt(i) - '0') * pesos2[i];
			}
			int digito2 = 11 - (soma % 11);
			if (digito2 > 9)
				digito2 = 0;

			return digito1 == (cpf.charAt(9) - '0') && digito2 == (cpf.charAt(10) - '0');
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
