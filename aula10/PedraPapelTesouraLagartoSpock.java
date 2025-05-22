package aula10;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesouraLagartoSpock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		String array[] = { "Pedra", "Papel", "Tesoura", "Lagarto", "Spock" };
		// Crio a variável random pra escolher aleatoriamente um número
		Random rd = new Random();
		// Inicializo as opções como zero pra não dar bug no sistema
		int options = 0;
		// Crio as variáveis jogador e máquina
		String jogador, maquina;
		// Entrada
		// Mensagem de breve explicação do código
		System.out.println(
				"Seja bem vindo ao pedra, papel e tesoura, só que 2.0\nVocê irá digitar o número correspondente ao "
						+ "elemento e a maquiná ira colocar outro elemento aleatório, boa sorte e divirta-se!");
		// Processamento
		// crio um loop pra repetir o jogo até o usuário desistir
		do {
			// O randomIndex é para acessar alguma opção de dentro do array aleatoriamente
			int randomIndex = rd.nextInt(array.length);
			// A maquina escolhe um número aleatorio que vai acessar o array
			String escolhaDaMaquina = array[randomIndex];
			// Escolha do usuário
			System.out.print(
					"Qual opção você irá selecionar ?\n1.Pedra\n2.Papel\n3.Tesoura\n4.Lagarto\n5.Spock\n6.Desisto\nDigite o número da sua opção:");
			options = sc.nextInt();
			// Verifica a condição entre 1 e 5
			if (options >= 1 && options <= 5) {
				// Permite que o usuário escolha apenas números do array
				jogador = array[options - 1];
				// A máquina vai ter a escolha dela aleatoriamente
				maquina = escolhaDaMaquina;
				// Mostra as escolhas
				System.out.println("\nVocê escolheu " + jogador);
				System.out.println("A máquina escolheu " + maquina);
				// Chama o método que vai imprimir o resultado e exibe o vencedor
				String resultado = Vencedor(jogador, maquina);
				System.out.println(Vencedor(jogador, maquina));
				// Verifica se o resultado não for empate, quebra o loop e acaba o jogo
				if (!resultado.contains("Empate")) {
					break;
				}

			} else if (options == 6) {
				System.out.println("Você perdeu por desistir");
			} else {
				System.out.println("Opção inválida, digite novamente uma entrada válida!");
			}
		} while (true);
		// Saída
		sc.close();
	}

	// Crio o método para decidir o vencedor do jogo
	public static String Vencedor(String jogador, String maquina) {
		// Analisa se a maquina e o jogador escolher a mesma opção, e da empate
		if (jogador.equals(maquina)) {
			return "Empate\n";
		}
		// Crio os casos pra decidir a escolha do jogar e decidir o vencedor ou perdedor
		switch (jogador) {
		// Caso se o jogador escolher pedra
		case "Pedra":
			// Retorna ao loop e se a escolha da máquina for uma dessas duas, ela perde, se
			// não, ela ganha
			return (maquina.equals("Tesoura") || maquina.equals("Lagarto")) ? "Você venceu\n" : "A máquina venceu\n";
		case "Papel":
			return (maquina.equals("Pedra") || maquina.equals("Spock")) ? "Você venceu\n" : "A máquina venceu\n";
		case "Tesoura":
			return (maquina.equals("Papel") || maquina.equals("Lagarto")) ? "Você venceu\n" : "A máquina venceu\n";
		case "Lagarto":
			return (maquina.equals("Spock") || maquina.equals("Papel")) ? "Você venceu\n" : "A máquina venceu\n";
		case "Spock":
			return (maquina.equals("Tesoura") || maquina.equals("Pedra")) ? "Você venceu\n" : "A máquina venceu\n";
		// Mensagem padrão se algo der erro
		default:
			return "Algo deu errado, tente novamente";
		}
	}
}