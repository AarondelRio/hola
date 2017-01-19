package com.ipartek.formacion.recetas.ejercicios.collection;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;

public class ComparacionesTest {

	ArrayList<Receta> recetas = new ArrayList<Receta>();
	ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	Receta solomillo = new Receta("solomillo");
	Receta marmitako = new Receta("marmitako");
	Receta tortilla = new Receta("Torilla Patatas");

	@Before
	public void setUp() throws Exception {
		ingredientes.add(new Ingrediente("solomillo1", 1, true));
		ingredientes.add(new Ingrediente("solomillo2", 1, true));
		solomillo.setIngredientes(ingredientes);
		solomillo.setDificultad(Receta.MODERADA);

		ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(new Ingrediente("marmitako1", 1, true));
		ingredientes.add(new Ingrediente("marmitako2", 1, true));
		ingredientes.add(new Ingrediente("marmitako3", 1, true));
		marmitako.setIngredientes(ingredientes);
		marmitako.setDificultad(Receta.DIFICIL);

		ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(new Ingrediente("tortilla1", 1, true));
		ingredientes.add(new Ingrediente("tortilla2", 1, true));
		ingredientes.add(new Ingrediente("tortilla3", 1, true));
		ingredientes.add(new Ingrediente("tortilla4", 1, true));
		tortilla.setIngredientes(ingredientes);
		tortilla.setDificultad(Receta.FACIL);

		recetas.add(solomillo);
		recetas.add(marmitako);
		recetas.add(tortilla);
	}

	@After
	public void tearDown() throws Exception {
		recetas = null;
		solomillo = null;
		tortilla = null;
		marmitako = null;
	}

	@Test
	public void testComparable() {

		// ordenar de A-Z
		Collections.sort(recetas);

		// comprobar
		assertEquals(marmitako, recetas.get(0));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortilla, recetas.get(2));

		// ordenar de la Z-A
		Collections.sort(recetas, Collections.reverseOrder());
		assertEquals(marmitako, recetas.get(2));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortilla, recetas.get(0));

	}

	@Test
	public void testComparator() {
		final String MSG_ERROR = "no puede ordenar por dificultad";
		// vamos a ordenar por nivel de dificultad de Receta

		Collections.sort(recetas, new ComparatorRecetaDificultad());
		assertEquals(MSG_ERROR, tortilla, recetas.get(0));
		assertEquals(MSG_ERROR, solomillo, recetas.get(1));
		assertEquals(MSG_ERROR, marmitako, recetas.get(2));

	}

	@Test
	public void testCompararIngredientes() {
		Collections.sort(recetas, new ComparatorRecetaIngredientes());
		assertEquals(2, recetas.get(0));
		assertEquals(3, recetas.get(1));
		assertEquals(4, recetas.get(2));
	}

}