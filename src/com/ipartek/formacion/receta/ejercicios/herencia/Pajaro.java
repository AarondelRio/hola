package com.ipartek.formacion.receta.ejercicios.herencia;

public class Pajaro extends Animal implements Volador, Vendible {

	private boolean puedeVolar;

	public Pajaro() {
		super();
		this.setPuedeVolar(true);
	}

	public Pajaro(String raza, int precio, boolean puedeVolar) {
		super(raza, precio);
		this.setPuedeVolar(puedeVolar);
	}

	public boolean isPuedeVolar() {
		return puedeVolar;
	}

	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}

	@Override
	public void despegar() {
		System.out.println("ha despegado");
	}

	@Override
	public void aterrizar() {
		System.out.println("ha aterrizado");

	}

	@Override
	public void generarFactura() {
		System.out.println("factura general");

	}

	@Override
	public String toString() {
		return "Pajaro [puedeVolar=" + puedeVolar + "]";
	}

}
