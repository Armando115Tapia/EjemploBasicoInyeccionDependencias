package com.atc;


/**
 * http://www.michael-pratt.com/blog/13/Patrones-de-Diseno-Inyeccion-de-Dependencias/
 * A la hora de diseñar o desarrollar software, uno de los principios básicos que, en mi opinión, 
 * debemos seguir es: tratar de depender de abstracciones y no de objetos o clases concretas. 
 * */

public class Messi {
	
	private IEquipo equipo;

	public Messi(IEquipo equipo) {
		super();
		this.equipo = equipo;
	}
	
	public void mostrarEquipo() {
		equipo.mostrar();
	}
	
}
