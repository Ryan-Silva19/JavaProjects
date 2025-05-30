package aula10;

import java.util.ArrayList;
import java.util.Scanner;

public class IlhaDosCodigosPerdidos {

	public static void main(String[] args) {
		// Crio o scanner para receber o código digitado pelo usuário
		Scanner sc = new Scanner(System.in);
		// Crio um ArrayList para armazenar os códigos digitados
		ArrayList<String> listaDeCodigos = new ArrayList<>();
		// Crio um StringBuilder para juntar todas as letras em uma única string
		StringBuilder codigoFinal = new StringBuilder();
		// Variáveis
		String entrada, numero, letra;
		int qtd;
		// Entrada
		System.out.println("Seja bem-vindo, usuário! Você caiu de paraquedas numa ilha de códigos "
				+ "perdidos e precisa decifrá-los. Para te ajudar, irei criar um programa "
				+ "que auxiliará na decifração desses códigos. Basta inseri-los corretamente!\n"
				+ "Os códigos geralmente são compostos por um número e uma letra, exemplo '1A 2B 3C 4D',"
				+ "quando encontrar um, digite corretamente para ser decifrado!");
		System.out.print("Parece que você encontrou um código secreto! Vou decifrá-lo para você.\n"
				+ "Insira o código encontrado (separados por espaço): ");
		entrada = sc.nextLine();
		// Processamento
		// Crio um array para armazenar os códigos, separando eles pelo espaço
		String[] codigosSeparados = entrada.split(" ");
		// Uso um loop para armazenar os códigos no ArrayList
		for (String codigo : codigosSeparados) {
			listaDeCodigos.add(codigo);
		}
		// Percorro cada código armazenado no ArrayList
		for (String codigo : listaDeCodigos) {
			System.out.println("Processando código: " + codigo);
			// Extraio apenas os números do código (quantidade de repetições de cada letra)
			numero = codigo.replaceAll("[^0-9]", "");
			// Extraio apenas as letras do código (caractere que será repetido)
			letra = codigo.replaceAll("[^a-zA-Z]", "");
			// Converto a parte numérica para um valor inteiro
			qtd = Integer.parseInt(numero);
			// Adiciono a repetição da letra ao StringBuilder para formar o código final
			codigoFinal.append(letra.repeat(qtd));
		}
		// Exibo o código decifrado final
		System.out.println("Seu código decifrado é: " + codigoFinal.toString());
		// Saída
		sc.close();
	}

}
