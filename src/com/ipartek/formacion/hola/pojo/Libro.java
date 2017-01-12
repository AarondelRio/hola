package com.ipartek.formacion.hola.pojo;

public class Libro {
	// atributos y constantes
	private String titulo, autor;
	private int numeroPaginas;

	// CONSTRUCTORES
	// Sirven para instanciar objetos de la clase.
	// Tienen el mismo nombre que la clase.
	// No hace falta especificar el <code>return</code>.
	// Es un metodo con el mismo nombre y mismo return pero diferentes
	// parametros.

	// constructor por defecto
	public Libro() {
		super();
		this.numeroPaginas = 0;
		this.titulo = "desconocido";
		this.autor = "anonimo";
	}

	// constructor con parametros
	public Libro(String titulo, String autor, int numeroPaginas) {
		super();
		this.setNumeroPaginas(numeroPaginas);
		this.titulo = titulo;
		this.autor = autor;
	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {

		this.numeroPaginas = (numeroPaginas < 0) ? 0 : numeroPaginas;
	}

	// otros metodos

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
	}

}
