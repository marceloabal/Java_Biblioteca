package test;

import Entidades.*;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmaLibro a = new AlarmaLibro();
		a.attach(new Compras());
		a.attach(new Administracion());
		a.attach(new Stock());
		
		Libro libro = new Libro();
		libro.setEstado("MALO");
		
		Biblioteca b = new Biblioteca();
		b.devolverLibro(libro);
		
	}

}
