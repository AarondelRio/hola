package com.ipartek.formacion.hola.ejercicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Aprendiendo a usar ArrayList
 * 
 * @author Curso
 *
 */
public class ArrayListTest {
	// declare
	ArrayList<String> paises;

	@Test
	public void test() {
		assertNull("deberia ser null", paises);

		// initialize
		paises = new ArrayList<String>();
		assertNotNull("no deberia ser null", paises);
		assertEquals("0 paises", 0, paises.size());

		// add
		paises.add("Euskal Herria");
		assertEquals("0 paises", 1, paises.size());

		paises.add("Uzbekistan");
		paises.add("Portugal");
		paises.add("Barakaldo");
		paises.add("Alemania");

		assertEquals("0 paises", 5, paises.size());

		// remove (& returns String in that position)
		assertEquals("Barakaldo", paises.remove(3));
		assertEquals("0 paises", 4, paises.size());

		// add with index position
		paises.add(1, "Portugalete");
		assertEquals("0 paises", 5, paises.size());

		assertEquals("Euskal Herria", paises.get(0));
		assertEquals("Portugalete", paises.get(1));
		assertEquals("Uzbekistan", paises.get(2));

	}

}
