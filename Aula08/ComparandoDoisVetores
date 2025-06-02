package Aula08;

public class ComparandoDoisVetores {

	public static void main(String[] args) {
		// Variáveis
		int[] array = new int[5];
		int[] array2 = new int[5];
		boolean encontrou = false;
		// Entrada
		System.out.println("Bem vindo! Nesse programa vamos criar dois vetores com 5 números em cada, "
				+ "e vamos comparar os vetores iguais com a mesma posição");
		// Processamento
		System.out.print("A primeira ordem é: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("\nA segunda ordem é: ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) (Math.random() * 10) + 1;
			System.out.print(array2[i]);
			if (i < array2.length - 1) {
				System.out.print(", ");
			}
		}
		// Saída
		for (int i = 0; i < array.length; i++) {
			if (array[i] == array2[i]) {
				System.out.println("\nOs números na mesma posição: ");
				encontrou = true;
				System.out.println("Posição " + (i + 1) + ": " + array[i]);
			}
		}
		if (!encontrou) {
			System.out.println("\nNão foi encontrado nenhum número na mesma posição!");
		}

	}

}
