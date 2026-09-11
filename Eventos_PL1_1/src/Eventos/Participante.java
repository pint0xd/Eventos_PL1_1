package Eventos;

import java.util.ArrayList;

public class Participante {
	private int id;
	private String nome;
	private ArrayList<Inscricao> inscricoes;
	
	public Participante(int id, String nome) {
		this.id = id;
		this.nome = nome;
		inscricoes = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public void adiconarInscricao(Evento evento) {
		Inscricao i = new Inscricao(evento);
		inscricoes.add(i);
	}
	
	public void verificarInscricao(Evento e) {
		for(Inscricao i : inscricoes) {
			if((i.getEvento()== e) && (i.getEstado()== Estado.PENDENTE )) {
				System.out.println("id=" + id + ", nome=" + nome);
				return;
			}
		}
	}

	public void mudarEstado(Evento e, Estado estado) {
		for(Inscricao i : inscricoes) {
			if(i.getEvento()== e && i.getEstado() == Estado.PENDENTE) {
				i.setEstado(estado);
				return;
			}
		}
		System.out.println("Esse utilizador não esta registado para esse evento ou ja foi confirmado ou cancelado");
	}

	public void verificarConfirmado(Evento e) {
		for(Inscricao i : inscricoes) {
			if((i.getEvento()==e) && (i.getEstado()== Estado.CONFIRMADA)){
				System.out.println("id=" + id + ", nome=" + nome);
				return;
			}
		}
	}

	public int reduzirVagas(Evento e, int total) {
		for(Inscricao i : inscricoes) {
			if((i.getEvento()==e) && ((i.getEstado()== Estado.CONFIRMADA) || i.getEstado() == Estado.PENDENTE)){
				return total-1;
			}
		}
		return total;
	}

	public boolean confirmadoNoEvento(Evento e) {
		for(Inscricao i: inscricoes) {
			if((i.getEvento()== e) && (i.getEstado()== Estado.CONFIRMADA)){
				return true;
			}
		}
		return false;
	}

	
}
