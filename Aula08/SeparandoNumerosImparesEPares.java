package Aula08;

public class SeparandoNumerosImparesEPares {

	public static void main(String[] args) {
		// Variáveis
		int[] array = new int[10];
		// Entrada
		System.out.println("Bem vindo meu caro usuário, nesse programa vamos mostrar 10 números "
				+ "aleatoriamente entre 1 e 100 e vamos mostrar quais números são pares ou ímpares");
		System.out.println("Os números gerados aleatoriamente são: ");
		// Processamento / Saída
		// Inicializamos um vetor de números inteiros com 10 posições ↓
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
			System.out.print(array[i]);
		// Fromatação pra sair a vírgula em todos os números menos no último ↓
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		// Criação da formatação dos números pares ↓ 
		System.out.print("\nOs números pares são: ");
		// Criamos uma variável para identificar os números pares ↓
		boolean par = true;
		for (int i = 0; i < array.length; i++) {
		// Identificamos os pares pela fórmula e fazemos a formatação com vírgula ↓
			if (array[i] % 2 == 0) {
		// A variável "par" garante que a vírgula não seja adicionada antes do primeiro número par e não seja colocada no último	
				if (!par) {
					System.out.print(", ");
				}
				System.out.print(array[i]);
				par = false;
			}
		}
		// Criamos a formatação dos número ímpares ↓
		System.out.print("\nOs números ímpares são: ");
		// Criamos uma variável para identificar os números ímpares ↓
		boolean impar = true;
		for (int i = 0; i < array.length; i++) {
		// Se for ímpar vai separar o número ↓
			if (array[i] % 2 != 0) {
		// A variável "impar" garante que a vírgula não seja adicionada antes do primeiro número par e não seja colocada no último ↓		
				if (!impar) {
					System.out.print(", ");
				}
		// Menos no último número ↓
				System.out.print(array[i]);
				impar = false;
			}
		}

	}

}
