package Aula02;

import java.util.Scanner;

public class ProblemaDoQuadro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double lar, altura, area, perimetro, diagonal;
		// Entrada
		System.out.println("Digite a largura do quadro");
		lar = sc.nextDouble();
		System.out.println("Digite a altura do quadro");
		// Processamento
		altura = sc.nextDouble();
		area = lar * altura;
		perimetro = (lar * 2) + (altura * 2);
		diagonal = Math.sqrt(Math.pow(lar, 2) + Math.pow(altura, 2));
		// Saída
		System.out.printf("A área do quadro é %.4f\n", area);
		System.out.printf("O perímetro do quadro é %.4f\n", perimetro);
		System.out.printf("A diagonal do quadro é %.4f\n", diagonal);
		sc.close();
	}

}
