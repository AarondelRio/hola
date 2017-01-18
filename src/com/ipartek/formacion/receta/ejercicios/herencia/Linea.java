package com.ipartek.formacion.receta.ejercicios.herencia;

public class Linea extends ObjetoGrafico {
	private int longitud;

	public Linea(int x, int y) {
		super(x, y);
		this.setLongitud(0);
	}

	@Override
	public void dibujar() {
		System.out.println("Pintando Linea");

	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

}
