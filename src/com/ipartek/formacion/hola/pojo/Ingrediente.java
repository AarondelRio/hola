package com.ipartek.formacion.hola.pojo;

/**
 * 
 * @author Curso
 *
 */
public class Ingrediente {
	private int cantidad;
	private String nombre;
	private boolean tieneGluten;

	/**
	 * CONSTRUCTOR
	 */
	public Ingrediente() {
		super();
	}

	/**
	 * CONSTRUCTOR CON PARAMETROS
	 * 
	 * @param cantidad:
	 *            Numero de ingredientes
	 * @param nombre:
	 *            Nombre de ingrediente
	 * @param tieneGluten:
	 *            Si el ingrediente tiene Gluten es Positivo
	 */
	public Ingrediente(int cantidad, String nombre, boolean tieneGluten) {
		super();
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.tieneGluten = tieneGluten;
	}

	/**
	 * GETTERS&SETTERS
	 * 
	 * @return
	 */
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isTieneGluten() {
		return tieneGluten;
	}

	public void setTieneGluten(boolean tieneGluten) {
		this.tieneGluten = tieneGluten;
	}

	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\n" + cantidad + nombre + ", tieneGluten=" + tieneGluten + "";
	}

}
