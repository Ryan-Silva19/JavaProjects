package Aula03;

import java.util.Scanner;

public class CombinacaoDeValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double a, b, c, d, ab, ac, ad, bc, bd, cd, abm, acm, adm, bcm, bdm, cdm;
		// Entradas
		System.out.println("Vamos fazer uma combinações de valores:");
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = sc.nextDouble();
		// Processamento
		// Adições
		ab = a + b;
		ac = a + c;
		ad = a + d;
		bc = b + ac;
		bd = b + d;
		cd = ac + d;
		// multiplicação
		abm = a * b;
		acm = a * ac;
		adm = a * d;
		bcm = b * ac;
		bdm = b * d;
		cdm = ac * d;
		// Saída
		System.out.println("Resultado das adições:");
		System.out.println("A + B = " + ab);
		System.out.println("A + C = " + ac);
		System.out.println("A + D = " + ad);
		System.out.println("B + C = " + bc);
		System.out.println("B + D = " + bd);
		System.out.println("C + D = " + cd);
		System.out.println("Resultado das multiplicações:");
		System.out.println("A + B = " + abm);
		System.out.println("A + C = " + acm);
		System.out.println("A + D = " + adm);
		System.out.println("B + C = " + bcm);
		System.out.println("B + D = " + bdm);
		System.out.println("C + D = " + cdm);
		sc.close();
	}

}
