package Aula10;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

public class RankingDeHerois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		int options = 0;
		ArrayList<Heroi> listaDeHerois = new ArrayList<>();
		listaDeHerois.add(new Heroi("Pedrero", 79, 40, 30));

		// Entrada
		System.out.println("Bem vindo caro usuário, nesse programa vamos criar uma lista de ranking "
				+ "de super-heróis, você poderá adicionar e comparar os heróis criados.");
		System.out.println("\nEstes são alguns dos hérois criado:");
		System.out.println("----------------------------------------");
		// Processamento
		for (Heroi heroi : listaDeHerois) {
			System.out.println("Herói " + heroi.getNome() + " | Poder total: "
					+ (heroi.getForca() + heroi.getInteligencia() + heroi.getVelocidade()));
		}
		do {
			System.out.print("\nO que você deseja fazer ?\n1. Criar um novo super-herói\n2.Personalizar o "
					+ "poder dele\n3.Comparar os super-heróis\n4.Ver o ranking\n5.Sair\nInsira sua opção: ");
			options = sc.nextInt();
			switch (options) {
			case 1:
				listaDeHerois.add(criarHeroi(sc));
				System.out.println("Herói criado com sucesso, voltando ao menu principal...");
				break;
			case 2:
				personalizarPoder(listaDeHerois, sc);
				System.out.println("Poder personalizado com sucesso, voltando ao menu principal...");
				break;
			case 3:
				compararHerois(listaDeHerois, sc);
				System.out.println("\nComparação de heróis feita com sucesso, voltando ao menu principal...");
				break;
			case 4:
				exibirRankingDeHerois(listaDeHerois);
				System.out.println("Ranking exibido, voltando ao menu principal...");
				break;
			case 5:
				System.out.println("Saindo... obrigado por jogar!");
				break;
			default:
				System.out.println("Deu ruim em algo, tente novamente...");
				break;
			}
			
		} while (options !=5);
		// Saída

	}

	public static Heroi criarHeroi(Scanner sc) {
		sc.nextLine();
		System.out.print("Qual vai ser o nome do seu Super-Herói ?\nInsira o nome dele: ");
		String nome = sc.nextLine();
		System.out.print("Qual vai ser a força do seu herói ?\nInsira a força: ");
		int forca = sc.nextInt();
		sc.nextLine();
		System.out.print("Qual vai ser a inteligência do seu herói ?\nInsira a inteligência: ");
		int inteligencia = sc.nextInt();
		sc.nextLine();
		System.out.print("Qual vai ser a velocidade do seu herói ?\nInsira a velocidade: ");
		int velocidade = sc.nextInt();
		sc.nextLine();
		return new Heroi(nome, forca, inteligencia, velocidade);
	}

	public static void personalizarPoder(ArrayList<Heroi> listaDeHerois, Scanner sc) {
		sc.nextLine();
		System.out.print("Digite o nome do herói que deseja atualizar: ");
		String nomeBusca = sc.nextLine();

		for (Heroi heroi : listaDeHerois) {
			if (heroi.getNome().equalsIgnoreCase(nomeBusca)) {
				System.out.println("Heroi encontrado, atualize seus atributos!");
				System.out.print("Nova força: ");
				int newForca = sc.nextInt();
				sc.nextLine();
				System.out.print("Nova inteligência: ");
				int newInteligencia = sc.nextInt();
				sc.nextLine();
				System.out.print("Nova velocidade: ");
				int newVelocidade = sc.nextInt();
				sc.nextLine();

				heroi.setForca(newForca);
				heroi.setInteligencia(newInteligencia);
				heroi.setVelocidade(newVelocidade);

				System.out.println("Os atributos do " + heroi.getNome() + " foram atualizados com sucesso!");
				return;
			}
		}
		System.out.println("O herói não foi encontrado, certifique-se de que digitou corretamente");
	}

	public static void compararHerois(ArrayList<Heroi> listaDeHerois, Scanner sc) {
		sc.nextLine();
		System.out.print("Insira o nome do herói que você deseja comparar\nHerói 1: ");
		String nomeHeroi1 = sc.nextLine();
		System.out.print("digite o nome do herói que você deseja comparar\nHeroi 2: ");
		String nomeHeroi2 = sc.nextLine();
		Heroi heroi1 = null;
		Heroi heroi2 = null;

		for (Heroi heroi : listaDeHerois) {
			if (heroi.getNome().equalsIgnoreCase(nomeHeroi1)) {
				heroi1 = heroi;
			} else if (heroi.getNome().equalsIgnoreCase(nomeHeroi2)) {
				heroi2 = heroi;
			}
		}
		if (heroi1 == null || heroi2 == null) {
			System.out.println("Algum dos heróis não foram encontrados, tente novamente");
			return;
		}

		int poderHeroi1 = heroi1.getForca() + heroi1.getInteligencia() + heroi1.getVelocidade();
		int poderHeroi2 = heroi2.getForca() + heroi2.getInteligencia() + heroi2.getVelocidade();
		System.out.println("\nResultado da comparação: ");
		System.out.println("O herói " + heroi1.getNome() + " tem o poder total de " + poderHeroi1);
		System.out.println("O herói " + heroi2.getNome() + " tem o poder total de " + poderHeroi2);

		if (poderHeroi1 > poderHeroi2) {
			System.out.println("O herói " + heroi1.getNome() + " é mais forte");
		} else if (poderHeroi2 > poderHeroi1) {
			System.out.println("O herói " + heroi2.getNome() + " é mais forte");
		} else {
			System.out.println("Ambos tem o mesmo nível de poder");
		}
	}
	public static void exibirRankingDeHerois(ArrayList<Heroi> listaDeHerois){
		Collections.sort(listaDeHerois, Comparator.comparingInt(Heroi::calcularPoderTotal).reversed());
		System.out.println("\nExibição do ranking de super-heróis!");
		System.out.println("-----------------------------------------");
		for (Heroi heroi : listaDeHerois) {
			System.out.println("Herói " + heroi.getNome() + " com o poder " + heroi.calcularPoderTotal());
			System.out.println("-----------------------------------------");
		}
	}
}
