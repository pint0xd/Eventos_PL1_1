package Eventos;
import java.util.ArrayList;

public class GerirEventos {
	ArrayList<Participante> participantes;
	ArrayList<Evento> eventos;
	
	public GerirEventos() {
		participantes = new ArrayList<>();
		eventos = new ArrayList<>();
	}
	
	public void criarParticipante(int id, String nome) {
		if(pesquisarParticipante(id)== null) {
			Participante p = new Participante (id, nome);
			participantes.add(p);
		}
		else {
			System.out.println("ID já em utilização");
		}
	}
	
	public void criarEvento(String titulo, String data, String local, int totalM) {
		if(pesquisarEvento(titulo)== null) {
			Evento e = new Evento(titulo, data, local, totalM);
			eventos.add(e);
		}
		else {
			System.out.println("Titulo já em utilização");
		}
	}
	
	public Participante pesquisarParticipante(int id) {
		for (Participante f: participantes) {
			if(f.getId() == id) {
				return f;
			}
		}
		return null;
	}
	
	public Evento pesquisarEvento(String titulo) {
		for(Evento e : eventos) {
			if(titulo.equalsIgnoreCase(e.getTitulo())) {
				return e;
			}
		}
		return null;
	}
	
	public void registarInscricao(int id,String titulo) {
			Participante p = pesquisarParticipante(id);
			if(p!= null) {
				Evento e = pesquisarEvento(titulo); 
				p.adiconarInscricao(e);
			}
			else {
				System.out.println("Esse id não existe");
			}
	}
			
	
	public void imprimirPorEvento(String titulo) {
		Evento e = pesquisarEvento(titulo);
		if(e != null) {
			for(Participante p : participantes) {
				p.verificarInscricao(e);
			}
		}
		else {
			System.out.println("Esse evento não existe");
		}	
	}
	
	public void mudarEstado(String titulo,int id, Estado estado) {
		Evento e = pesquisarEvento(titulo);
		Participante p = pesquisarParticipante(id);
		p.mudarEstado(e, estado);
	}
	
	public void listarConfirmados(String titulo) {
		Evento e = pesquisarEvento(titulo);
		for(Participante p : participantes) {
			p.verificarConfirmado(e);
		}
	}
	
	public int numeroDeVagas(String titulo) {
		Evento e = pesquisarEvento(titulo);
		int total = e.getTotalM();
		for(Participante p : participantes) {
			total = p.reduzirVagas(e,total);
		}
		return total;
	}
	
	public Evento eventoMaisConfirmado() {
		Evento maior = null;
		int confirmadosM = 0;
		for(Evento e : eventos) {
			int confirmados = 0;
			for(Participante p: participantes) {
				if(p.confirmadoNoEvento(e)) {
					confirmados +=1;
				}
			}
			if(confirmados > confirmadosM) {
				maior = e;
			}
		}
		return maior;
	}
	

}
