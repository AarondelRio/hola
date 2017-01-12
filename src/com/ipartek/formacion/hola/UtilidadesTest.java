package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testGetNumeroAleatorio() {

		int numero = -1;
		final int NUMERO_MAXIMO = 10;

		// crear array con todas las posiciones en falso
		boolean[] aResultado = new boolean[NUMERO_MAXIMO];

		// generar mil numeros aleatorios y actualizar array con true
		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getNumeroAleatorio(NUMERO_MAXIMO);
			aResultado[numero] = true;
		}

		// recorrer array y comprobar que todo es TRUE
		for (int i = 0; i < aResultado.length; i++) {
			assertTrue(aResultado[i]);

		}
	}

	@Test
	public void testSumaTonta() {
		assertEquals("no suma bien", 5, Utilidades.sumaTonta(2, 3));
		assertEquals("deberia haber sido 0, parametro negativo", 0, Utilidades.sumaTonta(-2, 3));
		assertEquals("deberia haber sido 0, parametro negativo", 0, Utilidades.sumaTonta(2, -3));
		assertEquals("deberia haber sido 0, la suma es mayor de 100", 0, Utilidades.sumaTonta(100, 1));
	}

	@Test
	public void testNoFallaNunca() {
		assertTrue(true);
	}
}
