package aula10;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesouraLagartoSpock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		String array[] = { "Pedra", "Papel", "Tesoura", "Lagarto", "Spock" };
		Random rd = new Random();
		
		int options = 0;
		int randomIndex = rd.nextInt(array.length);
		String escolhaDaMaquina = array[randomIndex];
		String jogador, maquina;
		// Entrada
		System.out.println(
				"Seja bem vindo ao pedra, papel e tesoura, só que 2.0\nVocê irá digitar o número correspondente ao "
						+ "elemento e a maquiná ira colocar outro elemento aleatório, boa sorte e divirta-se!");
		// Processamento
		do {
			System.out.print(
					"Qual opção você irá selecionar ?\n1.Pedra\n2.Papel\n3.Tesoura\n4.Spock\n5.Lagarto\n6.Desisto\nDigite o número da sua opção:");
			options = sc.nextInt();
			if (options >= 1 && options <= 5) {

			} 
//			System.out.println(Vencedor(jogador, maquina));
//			
			else if (options == 6) {
				System.out.println("Você perdeu por desistir");
			} else {
				System.out.println("Opção inválida, digite novamente uma entrada válida!");
			}
		} while (options != 6);
		// Saída

	}

	public static void Vencedor(String jogador, String maquina) {
		if (jogador.equals(maquina)) {
			return "Empate";
		}
		switch (jogador) {
		case "Pedra":
			return (maquina.equals("Tesoura") || maquina.equals("Lagarto")) ? "Você venceu" : "A máquina venceu";
			break;
		case "Papel":
			return (maquina.equals("Pedra") || maquina.equals("Spock")) ? "Você venceu" : "A máquina venceu";
			break;
		case "Tesoura":
			return (maquina.equals("Papel") || maquina.equals("Lagarto")) ? "Você venceu" : "A máquina venceu";
			break;
		case "Lagarto":
			return (maquina.equals("Spock") || maquina.equals("Papel")) ? "Você venceu" : "A máquina venceu";
			break;
		case "Spock":
			return (maquina.equals("Tesoura") || maquina.equals("Pedra")) ? "Você venceu" : "A máquina venceu";
			break;
		default:
			System.out.println("Algo deu errado, tente novamente...");
		}
	}
}