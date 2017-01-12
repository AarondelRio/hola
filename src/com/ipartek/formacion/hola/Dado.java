package com.ipartek.formacion.hola;

public class Dado {

	static String[] aAlumnos = { "Aarón", "Eneko", "Itsaso", "Ivan", "Guillermo", "lozoya", "Josu", "Ignacio", "Gomez",
			"Nerea", "Nagore", "Garbiñe", "Egoitz", "Pavel", "Perez" };

	public static void listar() {
		for (int i = 0; i < aAlumnos.length; i++) {
			System.out.println(i + "-" + aAlumnos[i]);
		}

	}

	public static void listarForeach() {
		for (String alumno : aAlumnos) {
			System.out.println(alumno);
		}
	}

	public static void main(String[] args) {
		// TODO buscar como crear numero aleatorio de 0-14
		int numeroAleatorio = Utilidades.getNumeroAleatorio((aAlumnos.length));
		String afortunado = aAlumnos[numeroAleatorio];
		System.out.println("El/La afortunad@ es:" + afortunado);
		listar();
		listarForeach();

	}
}
