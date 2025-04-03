package aula5;

import java.util.Scanner;

public class IndiceDeMassaCorporal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double Peso, Altura, Imc;
		String categoria;
		// Entrada
		System.out.println("Cálculo de índice de massa corporal:");
		System.out.println("Digite seu peso(em kg): ");
		Peso = sc.nextDouble();
		System.out.print("Digite sua altura(em métros): ");
		Altura = sc.nextDouble();
		sc.nextLine();
		// Processamento
		Imc = Peso / (Math.pow(Altura, 2));
		// Pós-processamento
		if (Imc <= 18.5) {
			categoria = "Baixo peso";
		} else if (Imc > 18.5 && Imc < 24.9) {
			categoria = "Peso normal";
		} else if (Imc >= 25 && Imc < 29.9) {
			categoria = "Soberepeso";
		} else if (Imc >= 30 && Imc < 34.9) {
			categoria = "Obesidade Grau 1";
		} else if (Imc >= 35 && Imc < 39.9) {
			categoria = "Obesidade Grau 2";
		} else {
			categoria = "Obesidade Grau 3";
		}
		// Saída
		System.out.printf("Seu índice de maassa corporal é %.1f\n", Imc);
		System.out.println("Categoria: " + categoria);
		sc.close();

	}

}