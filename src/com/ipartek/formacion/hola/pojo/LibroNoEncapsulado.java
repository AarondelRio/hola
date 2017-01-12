package com.ipartek.formacion.hola.pojo;

/**
 * 
 * Clase publica {@code Libro} para representar un Libro
 *
 */
public class LibroNoEncapsulado {
	// ATRIBUTOS
	/**
	 * int numeroPaginas , numero de paginas que contiene el libro
	 */
	public int numeroPaginas;

	/**
	 * String nombre, nombre del libro
	 */
	public String nombre;

	/**
	 * String autor, nombre del autor del libro
	 */
	public String autor;

	// METODOS O FUNCIONES

	/**
	 * Muestra por pantalla los atributos del libro
	 */
	public String describete() {
		return "Descripccion: " + this.nombre + " numero de paginas: " + this.numeroPaginas + " autor: " + this.autor;
	}

	/**
	 * Aumentamos el numero de paginas
	 * 
	 * @param numPaginas
	 *            numero de paginas que aumentamos
	 */
	public void escribir(int numPaginas) {
		// this.numeroPaginas = this.numeroPaginas + numPaginas;
		this.numeroPaginas += numPaginas;

	}
}