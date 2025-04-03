package aula7;


import java.util.Scanner;

public class DesafioFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double num, resultado;
		// Entrada
		System.out.println("Um número será somado a si mesmo 5 vezes, e em cada iteração, o resultado é multiplicado por 2");
		System.out.print("Insira um número: ");
		num = sc.nextInt();
		// Processamento
		resultado = num;
		for (int i = 1; i <= 5; i++) {
			resultado += num;
			resultado *= 2;
		}
		// Saída
		System.out.println("O resultado da multiplicação é = " + resultado);
		sc.close();
	}

}