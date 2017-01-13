package com.ipartek.formacion.hola.pojo;

import java.util.Arrays;

/**
 * 
 * @author Curso
 *
 */
public class Receta {
	String titulo;
	String dificultad;
	String descripcion;
	int comensales;
	int tiempo;
	Ingrediente[] ingredientes;
	boolean tieneGlutenReceta;

	/**
	 * CONSTRUCTOR
	 */
	public Receta() {
		super();
	}

	/**
	 * CONSTRUCTOR CON PARAMETROS
	 * 
	 * @param titulo:
	 *            Titulo de la receta
	 * @param dificultad:
	 *            Dificultad de la receta
	 * @param descripcion:
	 *            Elaboracion de la receta
	 * @param comensales:
	 *            Numero de comensales
	 * @param tiempo:
	 *            Tiempo de elaboracion
	 * @param ingredientes:
	 *            Array de Ingredientes, cada celca contiene un Objeto
	 *            Ingrediente
	 */
	public Receta(String titulo, String dificultad, String descripcion, int comensales, int tiempo,
			Ingrediente[] ingredientes) {
		super();
		this.titulo = titulo;
		this.dificultad = dificultad;
		this.descripcion = descripcion;
		this.comensales = comensales;
		this.tiempo = tiempo;
		this.ingredientes = ingredientes;
		tieneGluten();
	}

	/**
	 * GETTERS&SETTERS
	 * 
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public boolean isTieneGlutenReceta() {
		return tieneGlutenReceta;
	}

	public void setTieneGlutenReceta(boolean tieneGlutenReceta) {
		this.tieneGlutenReceta = tieneGlutenReceta;
	}

	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Receta : titulo=" + titulo + ",\n Ingredientes =" + Arrays.toString(ingredientes) + ",\n tiempo="
				+ tiempo + ",\n dificultad=" + dificultad + ",\n comensales=" + comensales + ",\n descripcion="
				+ descripcion + "\n Tiene Gluten=" + tieneGlutenReceta + ".";
	}

	/**
	 * 
	 */
	public void tieneGluten() {
		for (Ingrediente ingrediente : ingredientes) {
			if (ingrediente.tieneGluten) {
				this.tieneGlutenReceta = true;
			}
		}
	}

}
