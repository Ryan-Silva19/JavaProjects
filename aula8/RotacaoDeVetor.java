package aula8;


public class RotacaoDeVetor {

	public static void main(String[] args) {
		// Variáveis
		int[] array = new int[5];
		int temp = 0;
		// Entrada
		System.out.println("Olá caro usuário, nesse programa vamos rotacionar um vetor, iremos gerar"
				+ " 5 números\naleátorios e depois vamos rotacionar o vetor, o último número vem para"
				+ " o lugar do\nprimeiro número enquanto o próximo número toma o lugar de quem estava"
				+ " do seu lado direito.");
		System.out.print("Ordem do vetor criado: ");
		// Processamento
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
			switch (i < array.length - 1 ? 1 : 2) {
			case 1:
				System.out.print(array[i] + ", ");
				break;
			case 2:
				System.out.print(array[i]);
				break;
			}
		}
		// Armazenamos o último número do vetor em uma variável temporária
		temp = array[array.length - 1];
		// Chamo o laço de repetição
		for (int i = array.length - 1; i > 0; i--) {
		/* Rotação para a direita
		   Percorremos o vetor de trás para frente, movendo os elementos para a direita sem sobrescrever os valores*/
			array[i] = array[i - 1];
		}
		// Colocamos o valor do último número guardado na primeira posição
		array[0] = temp;
		/* Saída do vetor rotacionado
		   Exibimos uma mensagem ao usuário sobre o vetor rotacionado*/
		System.out.print("\nAgora o vetor rotacionado para a direita é: ");
		/* Exibimos os números do vetor com formatação
		   Usamos o switch para adicionar a vírgula entre os números, exceto no último número*/
		for (int i = 0; i < array.length; i++) {
			switch (i < array.length - 1 ? 1 : 2) {
			case 1:
				System.out.print(array[i] + ", ");
				break;
			case 2:
				System.out.print(array[i]);
				break;
			}
		}
	}

}
