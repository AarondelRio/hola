package com.ipartek.formacion.hola.pojo;

/**
 * 
 * @author Curso
 *
 */
public class MainReceta {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Crea un Array e Instancia un Objeto Ingrediente dentro de cada celda.
		Ingrediente[] aIngredientes = { new Ingrediente(500, "gr de bonito", false),
				new Ingrediente(25, "gr pan de sopa", true) };

		// Instancia un objeto Receta y le pasa el array con los objetos
		// Ingrediente.
		Receta marmitako = new Receta("Marmitako", "Facil", "Rico Rico", 2, 40, aIngredientes);
		System.out.println(marmitako.toString());
	}

}
