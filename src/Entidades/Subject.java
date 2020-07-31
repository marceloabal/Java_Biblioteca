package Entidades;

public interface Subject {

	public void attach(ILibroMalEstado observador);
	public void detach(ILibroMalEstado observador);
	public void notifyObserver();
		
	
	
}
