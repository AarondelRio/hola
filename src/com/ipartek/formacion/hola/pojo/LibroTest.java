package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibroTest {

	@Test
	public void testTitulo() {
		Libro libroJava = new Libro();
		libroJava.setTitulo("java7");
		assertEquals("java7", libroJava.getTitulo());
	}

	@Test
	public void testNumeroPaginas() {
		Libro l = new Libro();
		l.setNumeroPaginas(300);
		assertEquals(300, l.getNumeroPaginas());

		l.setNumeroPaginas(-300);
		assertEquals(0, l.getNumeroPaginas());
	}

	@Test
	public void testConstructorPorDefecto() {
		Libro l = new Libro();
		assertEquals(0, l.getNumeroPaginas());
		assertEquals("desconocido", l.getTitulo());
		assertEquals("anonimo", l.getAutor());

	}

	@Test
	public void testConstructorConParametros() {
		Libro l = new Libro("java7", null, 324);
		assertEquals(324, l.getNumeroPaginas());
		assertEquals("java7", l.getTitulo());
		assertEquals("anonimo", l.getAutor());

		l = new Libro("java7", null, -1);
		assertEquals(0, l.getNumeroPaginas());
		assertEquals("java7", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
	}

}
