package com.ipartek.formacion.receta.ejercicios.herencia;

public abstract class Circulo extends ObjetoGrafico {

	private int radio;

	public Circulo(int x, int y) {
		super(x, y);
		this.setRadio(0);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

}
