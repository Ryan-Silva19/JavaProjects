package aula10;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidadorDeSenhasIncomum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		String password;
		// Entrada
		System.out.println("Bem vindo caro usuário, nesse programa vamos fazer um"
				+ "validador de senha incomum, para verificar se sua senha está"
				+ "cumprindo os requisitos, a senha deve conter: uma letra maiúscula"
				+ ", um número primo, um caractere especial e não pode conter" + " vogais duplicadas seguidas.");
		System.out.print("Insira sua senha: ");
		password = sc.nextLine();
		// Processamento
		boolean senhaValida = temMaiuscula(password) && temNumeroPrimo(password) && temCaracterEspecial(password) && semVogalDuplicada(password);
		if (senhaValida) {
			System.out.println("A senha está aprovada!");
		}else {
			System.out.println("Senha inválida, tente cumpra todos os requisitos");
		}
		// Saída
		sc.close();
	}

	// Crio o método pra verificar se tem letra maiúscula na senha
	public static boolean temMaiuscula(String password) {
		// Crio o padrão usando o pattern
		Pattern maiuscula = Pattern.compile("[A-Z]");
		// Verifico se o padrão é verdadeito com o matcher
		Matcher matcher = maiuscula.matcher(password);
		// Retorno se encontrei algum padrão verdadeiro ou falso
		return matcher.find();
	}

	// Criação do metódo auxiliar pra ver se tem número primo na senha
	public static boolean numPrimo(int num) {
		if (num < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;

	}

	// Crio outro método pra analisar se tem número primo na senha
	public static boolean temNumeroPrimo(String password) {
		for (char p : password.toCharArray()) {
			if (Character.isDigit(p)) {
				int num = Character.getNumericValue(p);
				if (numPrimo(num)) {
					return true;
				}
			}
		}
		return false;
	}

	// Crio o método pra verificar se tem carácter especial
	public static boolean temCaracterEspecial(String password) {
		Pattern especial = Pattern.compile("[!@#$%&*()]");
		Matcher matcher = especial.matcher(password);
		return matcher.find();
	}

	// Método para verificar se tem vogais duplicadas
	public static boolean semVogalDuplicada(String password) {
		String vogais = "aeiouAEIOU";
		for (int i = 0; i < password.length() - 1; i++) {
			char atual = password.charAt(i);
			char proximo = password.charAt(i + 1);
			if (vogais.indexOf(atual) != -1 && atual == proximo) {
				return false;
			}
		}
		return true;
	}
}
