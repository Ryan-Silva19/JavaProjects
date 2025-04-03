package aula8;

public class SomaDosElementos {

	public static void main(String[] args) {
		// Variáveis
		int[] rdm = new int[10];
		int soma=0;
		// Entrada
		System.out.println("Nesse programa vamos gerar 10 números aleatórios entre 1 e 100 e vamos armazenar\nos 10 e mostrar no final na mesma variável e somar todos no final");
		// Processamento
		for (int i = 0; i < rdm.length; i++) {
			rdm[i] = (int) (Math.random()*100)+1;
		//Faço a soma enquanto processo e armazeno os números aleatórios
			soma = soma+rdm[i];
		}
		// Saída
		System.out.println("Os números gerados aleátoriamente são: ");
		for (int i = 0; i < rdm.length; i++) {
		/* Se o vetor for o último número, não vai acrescentar ", ",
		caso ele não seja o ultimo número, vai acrescentar ", "*/ 
			if (i  > 8) {
				System.out.print(rdm[i]);
			}else {			
				System.out.print(rdm[i] + ", "  );
			}	
		}
		System.out.println("\nA soma é " + soma);
	}
}