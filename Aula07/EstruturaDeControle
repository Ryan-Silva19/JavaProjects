package Aula07;

import java.util.Scanner;

public class EstruturaDeControle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int categoria;
		double nota, resultado, atividades;
		String nome, disciplina;
		// Entrada		
		System.out.println("Nesse programa vamos analisar a situação dos alunos e ver se eles vão passar de ano");
		System.out.print("Digite o nome do aluno: ");
		nome = sc.nextLine();
		System.out.print("Insira a diciplina do aluno: ");
		disciplina = sc.nextLine();
		
		System.out.print("Digite a nota total do aluno: ");
		nota = sc.nextDouble();
		System.out.print("Agora digite o número total de atividades: ");
		atividades = sc.nextInt();
		// Validação
		if (atividades <= 0) {
			System.out.println("O número total de atividades não pode ser zero!");
			sc.close();
			return;
		}
		// Processamento
		resultado = nota / atividades;
		// Pós-Processamento 
		if (resultado < 4) {
			categoria = 3; 
		} else if (resultado >= 4 && resultado < 7) {
			categoria = 2;
		} else {
			categoria = 1;
		}
		// Saída no switch case
		switch (categoria) {
		case 1:
			System.out.printf("O %s está aprovado na diciplina %s, sua média é de: %.2f",nome, disciplina,resultado);
			break;
		case 2:
			System.out.printf("O %s está em recuperação na diciplina %s, sua média é de: %.2f",nome, disciplina,resultado);
			break;
		case 3:
			System.out.printf("O %s está reprovado na diciplina %s, sua média é de: %.2f",nome, disciplina,resultado);
			break;
		default:
			System.out.println("Deu ruim no processamento!");
		}
		sc.close();
	}

}
