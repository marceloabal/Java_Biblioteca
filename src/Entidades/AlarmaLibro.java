package Entidades;

import java.util.ArrayList;

public class AlarmaLibro implements Subject {

	private static ArrayList<ILibroMalEstado> observadores = new ArrayList<ILibroMalEstado>();
	
	public void attach(ILibroMalEstado observador) {
		observadores.add(observador);
	}
	
	public void detach(ILibroMalEstado observador) {
		observadores.remove(observador);		
	}
	public void notifyObserver() {
		for (int i=0; i < observadores.size() ; i ++) {
			observadores.get(i).update();
		}
	}
	
	
}
