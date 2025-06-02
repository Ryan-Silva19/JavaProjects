package Aula08;

public class MaiorEMenorNumero {

	public static void main(String[] args) {
		int[] idf = new int[8];
		// Entrada
		System.out.println(
				"Nesse programa vamos gerar 8 números aleatórios e" + " vamos mostrar qual é o maior e o menor número");
		// Processamento
		for (int i = 0; i < idf.length; i++) {
			idf[i] = (int) (Math.random() * 100) + 1;
		}

		int maior = idf[0];
		int menor = idf[0];

		for (int i = 0; i < idf.length; i++) {
			if (idf[i] > maior) {
				maior = idf[i];
			}
			if (idf[i] < menor) {
				menor = idf[i];
			}
		}
		// Saída
		System.out.print("Vetor: ");
		for (int i = 0; i < idf.length; i++) {
			System.out.print(idf[i]);
			if (i < idf.length - 1) { // Adiciona uma vírgula entre
									  //os números menos no final
				System.out.print(", ");
			}
		}
		System.out.println("\nO maior número é " + maior);
		System.out.println("O menor número é " + menor);
	}

}
