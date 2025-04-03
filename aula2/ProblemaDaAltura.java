package aula2;

import java.util.Scanner;

public class ProblemaDaAltura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		String name1, name2;
		double height1, height2, media;
		// Entrada
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		name1 = sc.nextLine();
		System.out.print("Altura (em metros): ");
		height1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		name2 = sc.nextLine();
		System.out.print("Altura (em metros): ");
		height2 = sc.nextDouble();
		sc.nextLine();
		// Processamento
		media = (height1 + height2) / 2;
		// Saída
		System.out.println("A média de altura entre " + name1 + " e " + name2 + " é de ");
		System.out.printf("%.2fm", media);
		sc.close();
	}

}