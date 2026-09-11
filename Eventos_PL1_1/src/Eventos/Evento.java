package Eventos;

public class Evento {
		private String titulo;
		private String data;
		private String local;
		private int totalM;
		
		public Evento(String titulo, String data, String local, int totalM) {
			this.titulo = titulo;
			this.data = data;
			this.local = local;
			this.totalM = totalM;
		}

		public String getTitulo() {
			return titulo;
		}
		
		public int getTotalM() {
			return totalM;
		}
		
}
