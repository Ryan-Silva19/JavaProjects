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
	}
}