package com.atc;

/**
 * Ejemplo tomado del video: 
 * https://www.youtube.com/watch?v=MWtrUxvdJlw*/
public class App {

	public static void main(String[] args) {
		Messi m = new Messi(new Barcelona());
		m.mostrarEquipo();
		
		Messi ms = new Messi(new Juventus());
		ms.mostrarEquipo();

	}

}
