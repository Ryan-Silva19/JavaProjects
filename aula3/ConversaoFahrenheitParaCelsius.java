package aula3;

import java.util.Scanner;

public class ConversaoFahrenheitParaCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double Far, Cel;
		// Entrada
		System.out.println("Conversão Fahrenheit para Celsius");
		System.out.print("Digite o valor em Fahrenheit: ");
		Far = sc.nextDouble();
		// Processamento]
		Cel = (Far - 32) * 5 / 9;
		// Saída
		System.out.printf("A temperatura em celsius é  %.1f°C\n", Cel);
		sc.close();
	}

}