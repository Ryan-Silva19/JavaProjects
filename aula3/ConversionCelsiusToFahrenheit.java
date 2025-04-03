package aula3;

import java.util.Scanner;

public class ConversionCelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double Cel, Far;
		// Entrada
		System.out.println("Conversão Celsiu para Fahrenheit");
		System.out.print("Digite o valor em Celsius: ");
		Cel = sc.nextDouble();
		sc.nextLine();
		// Processamento
		Far = (Cel * 9 / 5) + 32;
		// Saída
		System.out.printf("A temperatura em Farhrnheit = %.2f°F\n", Far);
		sc.close();

	}

}