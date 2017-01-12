package com.ipartek.formacion.hola;

import com.ipartek.formacion.hola.pojo.Libro;

/**
 * Comentario de java doc Clase para realizar un 'Hello World'
 * 
 * @author curso
 *
 */
public class Hola {
	/**
	 * Metodo Main para ejecutar la clase
	 * 
	 * @param args
	 *            []String
	 */
	public static void main(String[] args) {
		// comentario de linea
		/*
		 * Comentario de bloque
		 * 
		 * 
		 * 
		 * 
		 * permite mas de una linea
		 */

		// operador ternario
		// asignar un valor a una variable en funcion de una condicion
		// (condicion) ? true : false ;
		int edad = (3 > 100) ? 18 : 34;

		// declarar variables
		boolean bBooleana;

		int iEntero;
		float fDineroCuenta = 10.23f; // 10,23€
		float fDineroCuenta2 = (float) 10.23;

		char caracter = 'p';
		String sCadena = "comillas dobles";

		System.out.println("Hola Mundo");

		// Instanciar un objeto de la clase libro
		Libro libroJava = new Libro();
		libroJava.numeroPaginas = 320;
		libroJava.nombre = "Java 7";
		libroJava.autor = "autor java";

		System.out.println(libroJava.describete());

		libroJava.escribir(10);

		System.out.println(libroJava.describete());

		Libro libroPhp = new Libro();
		libroPhp.numeroPaginas = 700;
		libroPhp.nombre = "Php";
		libroPhp.autor = "autor php";

		System.out.println(libroPhp.describete());

		libroPhp.escribir(20);
		System.out.println(libroPhp.describete());

	}
}
