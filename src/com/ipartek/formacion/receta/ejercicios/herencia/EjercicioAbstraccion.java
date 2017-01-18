package com.ipartek.formacion.receta.ejercicios.herencia;

/**
 * Comprobar que solo podemos instanciar objetos de las clases que no sean
 * abstractas.
 * 
 * @author Curso
 *
 */
public class EjercicioAbstraccion {

	public static void main(String[] args) {

		// ObjetoGrafico og = new ObjetoGrafico(0, 0);

		Linea l = new Linea(1, 1);

		// No se puede instanciar un objeto de clase abstracta,a menos que
		// implementes a la hora de la instanciacion.
		// Clase anonima
		Circulo c = new Circulo(5, 5) {

			@Override
			public void dibujar() {
				System.out.println("Dibujando Circulo");

			}
		};

		CirculoNoAbstracto cna = new CirculoNoAbstracto(1, 1);

	}

}
