package Eventos;

public class Inscricao {
	private Estado estado;
	private Evento evento;
	
	public Inscricao(Evento evento) {
		this.estado = Estado.PENDENTE;
		this.evento = evento;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Evento getEvento() {
		return evento;
	}
}
