package aula8;


public class ContandoVetoresPares {

	public static void main(String[] args) {
		// Variáveis
		int[] array = new int[15];
		int contador = 0;
		// Entrada
		System.out.println("Nesse programa vamos gerar 15 números entre 1 e 100 aleatoriamente e vamos listar 8 números pares");
		// Processamento
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*100) + 1;
		}	
		//Saída
		System.out.print("Vetor: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (array[i] % 2 == 0) {
				contador++;
			}if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("\nOs números pares são: " + contador);
	}
}
  