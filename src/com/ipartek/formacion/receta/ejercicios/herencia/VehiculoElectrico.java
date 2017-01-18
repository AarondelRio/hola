package com.ipartek.formacion.receta.ejercicios.herencia;

public class VehiculoElectrico extends Vehiculo {

	private float capacidadBateria;

	public final float MIN_CAPACIDAD_BATERIA = 100;

	public VehiculoElectrico() {
		super();
		this.capacidadBateria = MIN_CAPACIDAD_BATERIA;
	}

	public VehiculoElectrico(String modelo) {
		super(modelo);
		this.capacidadBateria = MIN_CAPACIDAD_BATERIA;
	}

	@Override
	public void arrancar() {
		// super.arrancar();
		System.out.println("Arrancando vehiculo electrico");
	}

	public float getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(float capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	@Override
	public String toString() {
		return "VehiculoElectrico [capacidadBateria=" + capacidadBateria + "] extends" + super.toString();
	}

}
