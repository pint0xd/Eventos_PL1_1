package Eventos;

import java.util.Scanner;

public class Teste {
 
	public static void main(String[] args) {
		
		GerirEventos gestor = new GerirEventos();
		Scanner sc = new Scanner(System.in);
		int opcao = -1;
		
		while (opcao != 0) {

			System.out.println("1 - Registar participante");
			System.out.println("2 - Registar evento");
			System.out.println("3 - Registar inscrição");
			System.out.println("4 - Confirmar inscrição");
			System.out.println("5 - Cancelar inscrição");
			System.out.println("6 - Listar inscrições pendentes de um evento");
			System.out.println("7 - Listar confirmados de um evento");
			System.out.println("8 - Consultar número de vagas disponíveis");
			System.out.println("9 - Evento com mais confirmados");
			System.out.println("0 - Sair");

			System.out.println ("Escolha uma opção: ");
			
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			
				case 1:
					System.out.print("ID do participante: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("Nome do participante: ");
					String nome = sc.nextLine();
					gestor.criarParticipante(id, nome);
				break;
				
				
				case 2:
					System.out.print("Título do evento: ");
					String titulo = sc.nextLine();
					System.out.print("Data do evento: ");
					String data = sc.nextLine();
					System.out.print("Local do evento: ");
					String local = sc.nextLine();
					System.out.print("Lotação máxima: ");
					int totalM = sc.nextInt();
					sc.nextLine();
					gestor.criarEvento(titulo, data, local, totalM);
				break;
				
				case 3:
					System.out.print("ID do participante: ");
					id = sc.nextInt();
					sc.nextLine();
					System.out.print("Título do evento: ");
					titulo = sc.nextLine();
					gestor.registarInscricao(id, titulo);
				break;
				
				
				case 4:
					System.out.print("Título do evento: ");
					titulo = sc.nextLine();
					gestor.imprimirPorEvento( titulo);
					System.out.print("ID do participante: ");
					id = sc.nextInt();
					sc.nextLine();
					gestor.mudarEstado(titulo, id, Estado.CONFIRMADA);
				break;
				
				
				case 5:
					System.out.print("Título do evento: ");
					titulo = sc.nextLine();
					System.out.print("ID do participante: ");
					id = sc.nextInt();
					sc.nextLine();
					gestor.mudarEstado(titulo, id, Estado.CANCELADA);
				break;
				
				
				case 6:
					System.out.print("Título do evento: ");
					titulo = sc.nextLine();
					System.out.println("Inscrições pendentes:");
					gestor.imprimirPorEvento(titulo);
				break;
				
				
				case 7:
					System.out.print("Título do evento: ");
					titulo = sc.nextLine();
					System.out.println("Participantes confirmados:");
					gestor.listarConfirmados(titulo);
				break;
				
				case 8:
					System.out.print("Título do evento: ");
					titulo = sc.nextLine();
					Evento e = gestor.pesquisarEvento(titulo);
					if (e != null) {
						int vagas = gestor.numeroDeVagas(titulo);
						System.out.println("Vagas disponíveis: " + vagas);
					} 
					else {
						System.out.println("Esse evento não existe");
					}
				break;
				
				
				case 9:
					Evento maisConfirmado = gestor.eventoMaisConfirmado();
					if (maisConfirmado != null) {
						System.out.println("Evento com mais confirmados: " + maisConfirmado.getTitulo());
					} 
					else {
						System.out.println("Ainda não existem inscrições confirmadas");
					}
				break;
				
				
				case 0:
					System.out.println("A terminar o programa...");
				break;
				
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
			}
		}
		
		sc.close();
	}
}

//teste conflito