package Entidades;

public class Biblioteca {

	public void devolverLibro(Libro libro) {
		if (libro.getEstado().equals("MALO")) {
			AlarmaLibro a = new AlarmaLibro();
			a.notifyObserver();
		}
	}
	
}
