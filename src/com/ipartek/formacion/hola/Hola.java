package com.ipartek.formacion.hola;

import java.util.Arrays;

import com.ipartek.formacion.hola.pojo.LibroNoEncapsulado;

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
		float fDineroCuenta = 10.23f; // 10,23�
		float fDineroCuenta2 = (float) 10.23;

		char caracter = 'p';
		String sCadena = "comillas dobles";

		System.out.println("Hola Mundo");

		// Instanciar un objeto de la clase libro
		LibroNoEncapsulado libroJava = new LibroNoEncapsulado();
		libroJava.numeroPaginas = 320;
		libroJava.nombre = "Java 7";
		libroJava.autor = "autor java";

		System.out.println(libroJava.describete());

		libroJava.escribir(10);

		System.out.println(libroJava.describete());

		LibroNoEncapsulado libroPhp = new LibroNoEncapsulado();
		libroPhp.numeroPaginas = 700;
		libroPhp.nombre = "Php";
		libroPhp.autor = "autor php";

		System.out.println(libroPhp.describete());

		libroPhp.escribir(20);
		System.out.println(libroPhp.describete());

		/*
		 * test ordenar Ascendente y descendente
		 * 
		 * solomillo. moderado marmitako. dificil toritlla de patata. facil
		 * 
		 * 
		 * ordenar alfabeticamente por nombre ordenar de facil a dificil
		 */
		int[] disorder = { 2, 3, 5, 6, 8, 9, 7, 4, 1, 0 };
		Arrays.sort(disorder);
		// int[] order = Utilidades.bubbleSort(disorder);

		for (int i : disorder) {
			System.out.println(i);
		}
	}
}
