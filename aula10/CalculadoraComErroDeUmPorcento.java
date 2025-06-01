package aula10;

import java.util.Scanner;
import java.util.Random;

public class CalculadoraComErroDeUmPorcento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		// Variáveis
		double num1, num2, resultado, erro, erroPorcentagem;
		String entrada;
		char operacao;
		// Entrada
		System.out.print("Olá caro usuário, nesse programa vamos criar "
				+ "uma pequena calculadora com com 4 operações matemáticas. Só que essa "
				+ "calculadora ela tem um 'erro'\nde 1% que é calculado aleatoriamente ao "
				+ "exibir o resultado, pense nisso como um arredondamento seguro só que pra cima\n"
				+ "Insira o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Insira o segundo número: ");
		num2 = sc.nextDouble();
		sc.nextLine();
		// Processamento
		System.out.print("Insira a operçāo que deseja fazer(+, -, x, /): ");
		entrada = sc.next();
		if (!entrada.isEmpty()) {
			operacao = entrada.charAt(0);
		} else {
			System.out.println("entrada inválida!");
			sc.close();
			return;
		}
		resultado = 0;
		switch (operacao) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case 'x':
			resultado = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				resultado = num1 / num2;
			} else {
				System.out.println("Erorr... nāo existe divisāo por zero!");
			}
			break;
		default:
			System.out.println("Operaçāo inválida!");
			sc.close();
			return;
		}
		// crio a variável erro
		erro = 0;
		// crio a variável do erro da porcentagem
		erroPorcentagem = 0;
		// uso o random pra erar um valor aleatório entre 0.1 e 1
		erroPorcentagem = rd.nextDouble() * 0.009 + 0.001;
		// calculo o erro da porventagem aleatória
		erro = resultado * erroPorcentagem;
		// guardo esse erro no resulado
		resultado += erro;
		// Saída
		System.out.printf("O resultado da conta é: %.2f", resultado);
		sc.close();
	}

}