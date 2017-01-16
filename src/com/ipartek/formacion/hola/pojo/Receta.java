package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Receta {
	private String titulo;
	private String dificultad;
	private String descripcion;
	private int comensales;
	private int tiempo;
	private ArrayList<Ingrediente> ingredientes;

	public Receta() {
		super();
	}

	public Receta(String titulo, ArrayList<Ingrediente> ingredientes) {
		super();
		this.titulo = titulo;
		// this.ingredientes = ingredientes;
		setIngredientes(ingredientes);
		this.tiempo = 0;
		this.comensales = 0;
		this.dificultad = "facil";
		this.descripcion = "Lorem ipsum....";
	}

	public void addIngrendiente(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
	}

	public boolean removeIngrediente(Ingrediente ingrediente) {
		boolean resul = false;
		if (ingrediente != null) {
			final String NOMBRE_INGREDIENTE_ELIMINAR = ingrediente.getNombre();
			Ingrediente iterateIngrediente = null;
			for (int i = 0; i < this.ingredientes.size(); i++) {
				iterateIngrediente = this.ingredientes.get(i);
				if (NOMBRE_INGREDIENTE_ELIMINAR.equalsIgnoreCase(iterateIngrediente.getNombre())) {
					this.ingredientes.remove(i);
					resul = true;
					break;
				}
			}
		}
		return resul;
	}

	public boolean contiene(Ingrediente ingrediente) {
		boolean resul = false;
		if (ingrediente != null) {
			final String NOMBRE_INGREDIENTE_BUSCAR = ingrediente.getNombre();
			Ingrediente iterateIngrediente = null;
			for (int i = 0; i < this.ingredientes.size(); i++) {
				iterateIngrediente = this.ingredientes.get(i);
				if (NOMBRE_INGREDIENTE_BUSCAR.equalsIgnoreCase(iterateIngrediente.getNombre())) {
					resul = true;
					break;
				}
			}

		}
		return resul;
	}

	public boolean isGlutenFree() {
		boolean resul = true;
		if (this.ingredientes != null) {
			for (Ingrediente i : this.ingredientes) {
				if (i.isGluten()) {
					resul = false;
					break;
				}
			}
		}
		return resul;
	}

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

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = (ingredientes == null) ? new ArrayList<Ingrediente>() : ingredientes;
	}

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", dificultad=" + dificultad + ", descripcion=" + descripcion
				+ ", comensales=" + comensales + ", tiempo=" + tiempo + ", ingredientes=" + ingredientes + "]";
	}

}
