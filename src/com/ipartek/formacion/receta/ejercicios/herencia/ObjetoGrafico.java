package com.ipartek.formacion.receta.ejercicios.herencia;

/**
 * 
 * @author Curso
 *
 */
public abstract class ObjetoGrafico {
	private int x;
	private int y;
	/**
	 * GeoPunto se compone de latitud y longitud, mediante una clase interna
	 */
	private GeoPunto gp;

	/*
	 * Clase interna
	 */
	class GeoPunto {
		public float latitud;
		public float longitud;
	}

	public ObjetoGrafico(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void mover(int x, int y) {
		System.out.println("objeto movido a " + x + " " + y);
	}

	public abstract void dibujar();
}
