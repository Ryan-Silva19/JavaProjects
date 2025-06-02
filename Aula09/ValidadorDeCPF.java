package Aula09;

import java.util.Scanner;

public class ValidadorDeCPF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		String cpf;
		// Entrada
		System.out.println("Seja bem vindo caro usuário, nesse progrma"
				+ "vamos fazer um validador de cpf, se você inserir um cpf\n"
				+ "verdadeiro, vai ser validado, senão vai ser falso");
		System.out.print("Insira um cpf(insira apenas números): ");
		cpf = sc.nextLine();
		// Processamento
		if (validarCPF(cpf)) {
			System.out.println("CPF válido!");
		} else {
			System.out.println("CPF inválido.");
		}
		sc.close();
	}

	// Saída
	public static boolean validarCPF(String cpf) {
		if (cpf.length() != 11 || !cpf.matches("\\d+")) {
			return false;
		}
		int[] digitos = new int[11];
		for (int i = 0; i < 11; i++) {
			digitos[i] = Character.getNumericValue(cpf.charAt(i));
		}

		// Cálculo do primeiro dígito verificador
		int soma1 = 0;
		for (int i = 0; i < 9; i++) {
			soma1 += digitos[i] * (10 - i);
		}
		int primeiroDV = (soma1 * 10) % 11;
		if (primeiroDV == 10)
			primeiroDV = 0;

		// Cálculo do segundo dígito verificador
		int soma2 = 0;
		for (int i = 0; i < 10; i++) {
			soma2 += digitos[i] * (11 - i);
		}
		int segundoDV = (soma2 * 10) % 11;
		if (segundoDV == 10)
			segundoDV = 0;

		return digitos[9] == primeiroDV && digitos[10] == segundoDV;
	}
}
