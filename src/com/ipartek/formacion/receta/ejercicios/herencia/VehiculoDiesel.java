package com.ipartek.formacion.receta.ejercicios.herencia;

public class VehiculoDiesel extends Vehiculo {

	private float capacidadCombustible;
	public final float MIN_CAPACIDAD_COMBUSTIBLE = 100;

	public VehiculoDiesel() {
		super();
		this.capacidadCombustible = MIN_CAPACIDAD_COMBUSTIBLE;
	}

	public VehiculoDiesel(String modelo) {
		super(modelo);
		this.capacidadCombustible = MIN_CAPACIDAD_COMBUSTIBLE;
	}

	@Override
	public void arrancar() {
		// super.arrancar();
		System.out.println("Arrancando vehiculo diesel");
	}

	public float getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(float capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	@Override
	public String toString() {
		return "VehiculoDiesel [capacidadCombustible=" + capacidadCombustible + "] extends" + super.toString();
	}

}
