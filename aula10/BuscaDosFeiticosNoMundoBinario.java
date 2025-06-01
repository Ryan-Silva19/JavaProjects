package aula10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BuscaDosFeiticosNoMundoBinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaDeFeiticos = new ArrayList<>(Arrays.asList("Aceleratio", "Defensio", "Expelliarmus",
				"Lumos", "Wingardium Leviosa", "Accio", "Alohomora", "Expecto Patronum", "Protego", "Avada Kedavra"));
		Collections.shuffle(listaDeFeiticos);
		// Variáveis
		String feiticoDigitado;
		// Entrada
		System.out.println("Bem vindo meu caro bruxo(a) ao mundo de harry potter.\nNesse "
				+ "programa caso precise encontrar feitiços, digite o nome dele que eu irei percorrer "
				+ "a lista de feitiços e te dizer em qual lugar da lista está");
		System.out.print("qual feitiço você deseja encontrar ?\nInsira o feitiço: ");
		feiticoDigitado = sc.nextLine();
		// Processamento

		// Saída
		sc.close();
	}

}