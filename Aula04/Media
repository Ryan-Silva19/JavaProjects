package Aula04;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double nota1, atividades1, media1;
		String aluno1, Condicao1;
		// Entrada
		System.out.println("Vamos calcular se o aluno passou ou reprovou de ano");
		System.out.print("Digite o nome do aluno: ");
		aluno1 = sc.nextLine();
		System.out.print("Dgite a nota do total do aluno: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a quantidade total de atividades feitas pelo aluno: ");
		atividades1 = sc.nextDouble();
		sc.nextLine();
		// Processamento
		media1 = nota1 / atividades1;
		// pós-processamento
		if (media1 >= 7) {
			Condicao1 = "Aprovado";
		} else {
			Condicao1 = "Reprovado";
		}
		// Saída
		System.out.printf("O %s foi %s, sua média foi de %.2f%n", aluno1, Condicao1, media1);
		sc.close();

	}

}
