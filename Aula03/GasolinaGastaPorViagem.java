package Aula03;

import java.util.Scanner;

public class GasolinaGastaPorViagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double Tem, Vel, Dis, Lit;
		// Entrada
		System.out.println("Calculo da gasolina gasta por viagem");
		System.out.print("Digite o tempo que será gasto na viagem(em horas ex: 1,5 para 1 hora e 30 minutos): ");
		Tem = sc.nextDouble();
		System.out.print("Digite a velocidade média que irá percorrer(em km/h): ");
		Vel = sc.nextDouble();
		// processamento
		//Cálculo da distância percorrida
		Dis = Tem * Vel;
		//Cálculo de litros consumidos pela viagem
		Lit = Dis / 12;
		// Saída
		System.out.print("\nA velocidade média é de " + Vel + "km/h\n");
		System.out.print("O tempo gasto nessa viagem será de " + Tem + " horas\n");
		System.out.printf("A distância percorrida é de %.2fKm\n", Dis);
		System.out.printf("A quantidade de litros gasto nessa viagem será de %.2fL\n", Lit);
		System.out.println("Obrigado por usar nosso programa, boa viagem :p");
		sc.close();
	}

}
