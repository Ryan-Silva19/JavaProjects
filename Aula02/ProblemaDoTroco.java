package Aula02;

import java.util.Scanner;

public class ProblemaDoTroco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		double produto, qtd, compra, pagamento, troco;
		// Entrada
		System.out.println("Digite o valor do produto:");
		produto = sc.nextDouble();
		System.out.println("Digite a quantidade de produtos:");
		qtd = sc.nextDouble();
		System.out.println("Digite o valor do pagamento:");
		pagamento = sc.nextDouble();
		// Processamento
		compra = produto * qtd;
		troco = pagamento - compra;
		// Saída
		System.out.printf("A sua compra foi = R$ %.2f\n", compra);
		System.out.printf("O seu troco é = R$ %.2f\n", troco);
		sc.close();
	}

}
