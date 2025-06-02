package Aula08;

public class MediaDeNotas {

	public static void main(String[] args) {
		// Variáveis
		double[] array = new double[6];
		double media = 0;		
		// Entrada
		// Instruções de como vai funcionar o programa
		System.out.println("Bem vindo, nesse programa iremos criar 6 notas aleatórias para um aluno\n"
				+ "Por meio de um vetor, então vamos calcular sua média e dizer se ele foi\nAprovado"
				+ " ou reprovado.");
		System.out.print("As notas dele foram: ");
		// Processamento
		// Criamos um laço de repetição
		for (int i = 0; i < array.length; i++) {
		// Inserimos um vetor pra criar 6 numeros aleatórios
			array[i] = (double) (Math.random() * 10) + 1;
		// Damos vida a uma variável pra guardar o resultado de cada número criado e somar ao próximo
			media += array[i];
			/* Usamos o switch-case para substituir o if-else.
			   Criamos uma condição que verifica se o índice é menor que o tamanho do vetor (array.length - 1).
			   Se for verdade (não é o último número do array), o switch entra no caso 1,
			   onde o número é exibido e uma vírgula é acrescentada.
			   Caso contrário (último número do array), o switch entra no caso 2,
			   onde o número é exibido sem vírgula.*/	
			switch (i < array.length - 1 ? 1 : 2) {
			case 1:
				System.out.printf("%.2f" + ", ",array[i]);
				break;
			case 2:
				System.out.printf("%.2f",array[i]);
				break;
			}
		}
		// Fazemos o cálculo da média, pegando o número total da nota e dividindo pelo número total de atividades.
		media /= array.length;
		// Saída
		// Apresentamos a saída
		System.out.printf("\nSua média foi de: %.2f", media);
		System.out.print("\nResultado final: ");
		/* Usamos o switch-case da mesma maneira explicada acima, utilizando o operador ternário
		   para simplificar a condição do switch-case. */
		switch (media >= 7 ? 1 : 2) {
		case 1:
			System.out.println("Aprovado!");
			break;
		case 2:
			System.out.println("Reprovado");
			break;
		}
	}

}
