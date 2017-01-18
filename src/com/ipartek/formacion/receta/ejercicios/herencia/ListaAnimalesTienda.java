package com.ipartek.formacion.receta.ejercicios.herencia;

import java.util.ArrayList;

/**
 * Ejercicio para aprender a usar herencia e interfaces.</ br> Capitulo 8 del
 * Libro "Java 7".
 * 
 * @author Curso
 *
 */
public class ListaAnimalesTienda {
	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<Animal>();
		animales.add(new Burro("razaburro1", 10, "nombreburro1"));
		animales.add(new Pajaro("razapajaro1", 10, true));
		animales.add(new Burro("razaburro2", 20, "nombreburro2"));
		animales.add(new Pajaro("razapajaro2", 20, false));
		animales.add(new Burro("razaburro3", 30, "nombreburro3"));
		animales.add(new Pajaro("razapajaro3", 30, true));

		Animal animal = new Animal();
		for (int i = 0; i < animales.size(); i++) {
			animal = animales.get(i);
			System.out.println("-------------------------------------------------");
			System.out.println(animal.getRaza());

			if (animal instanceof Volador) {
				System.out.println("es volador y puedeVolar: " + ((Pajaro) animal).isPuedeVolar());
			}
			if (animal instanceof Vendible) {
				System.out.println("es vendible y su precio es: " + animal.getPrecio());
			}
			if (animal instanceof Cocinable) {
				System.out.println("es cocinable");
			}
		}
	}

}
