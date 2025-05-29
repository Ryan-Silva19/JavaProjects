package aula10;

import java.util.ArrayList;
import java.util.Scanner;

public class VotacaoDeMascoteDaTurma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variáveis
		ArrayList<Mascote> mascoteDaTurma = new ArrayList<>();
		int options = 0;
		// Entrada
		System.out.println("Bem vindo caro usua=ário, nesse programa vamos criar um "
				+ "sistema de votação para mascote da turma, a votação terá múltiplos "
				+ "votos até que você deseje acabar com a votação, e iremos exibir os " + "resultados no final");
		// Processamento
		do {
			System.out.print("O que você deseja fazer ?\n1.Adicionar Mascote\n2."
					+ "Iniciar a votação\n3.Exibir Resultados\n4.Encerrar o programa\nInsira sua opção: ");
			options = sc.nextInt();
			sc.nextLine();
			switch (options) {
			case 1:
				adicionarMascote(mascoteDaTurma, sc);
				break;
			case 2:
				iniciarVotacao(mascoteDaTurma, sc);
				break;
			case 3:
				exibirResultados(mascoteDaTurma);
				break;
			case 4:
				System.out.println("Programa encerrado");
				sc.close();
				break;
			default:
				System.out.println("Opção inválida, tente novamente");
			}
		} while (options != 4);
		// Saída
	}

	public static class Mascote {
		private String nome;
		private int votos;

		public Mascote(String nome) {
			this.nome = nome;
			this.votos = 0;
		}

		public String getNome() {
			return nome;
		}

		public void adicionarVoto() {
			this.votos++;
		}

		public int getVotos() {
			return votos;
		}
	}

	public static void adicionarMascote(ArrayList<Mascote> mascoteDaTurma, Scanner sc) {
		System.out.print("Insira o nome do mascote que você quer adicionar: ");
		String nome = sc.nextLine();
		Mascote novoMascote = new Mascote(nome);
		mascoteDaTurma.add(novoMascote);
		System.out.println("O mascote " + nome + " foi adicionado com sucesso");
	}

	public static void iniciarVotacao(ArrayList<Mascote> mascoteDaTurma, Scanner sc) {
		if (mascoteDaTurma.isEmpty()) {
			System.out.println("Nenhum mascote cadastrado, a votação não pode ser iniciada");
			return;
		}
		System.out.println("Mascotes disponíveis para votar:");
		for (Mascote mascote : mascoteDaTurma) {
			System.out.println("- " + mascote.getNome());
		}
		System.out.println("Insira o nome do mascote para votar ou 'fim' para encerrar a votação");
		while (true) {
			System.out.print("Mascote em que deseja votar: ");
			String voto = sc.nextLine().trim();
			if (voto.equalsIgnoreCase("Fim")) {
				System.out.println("Votação encerrada...");
				break;
			}
			boolean votou = false;
			for (Mascote mascote : mascoteDaTurma) {
				if (mascote.getNome().trim().toLowerCase().equals(voto)) {
					mascote.adicionarVoto();
					System.out.println("+ 1 voto para: " + mascote.getNome());
					votou = true;
					break;
				}
			}
			if (!votou) {
				System.out.println("O mascote não foi encontrado, digite corretamente");
			}
		}
	}

	public static void exibirResultados(ArrayList<Mascote> mascoteDaTurma) {
		if (mascoteDaTurma.isEmpty()) {
			System.out.println("Nenhum mascote encontrado pra exibir os resultados");
			return;
		}
		System.out.println("\nResultados da votação:");
		int totalVotos = 0;
		for (Mascote mascote : mascoteDaTurma) {
			totalVotos += mascote.getVotos();
		}
		if (totalVotos == 0) {
			System.out.println("Nenhum voto registrado");
			return;
		}
		for (Mascote mascote : mascoteDaTurma) {
			double porcentagemVotos = (mascote.getVotos() * 100.0) / totalVotos;
			System.out.printf("- %s recebeu %d (%.2f%%)%n", mascote.getNome(), mascote.getVotos(), porcentagemVotos);
		}
	}
}
