package com.ipartek.formacion.hola;

/**
 * Classe {@code utilidades} con metodos staticos y comunes.<br>
 * Por ejemplo: numeros aleatorios, validaciones etc..
 * 
 * @author Curso
 *
 */
public class Utilidades {
	/**
	 * Genera un numero {@code int} aleatorio desde 0 hasta <b>maximoValor</b>
	 * 
	 * @param maximoValor
	 *            numero aleatorio maximo que puede generar, incluido este.
	 * @return numero entero aleatorio
	 */
	static public int getNumeroAleatorio(int maximoValor) {
		return (int) (Math.random() * maximoValor);
	}

	/**
	 * suma dos numeros positivos, si uno de los dos negativos, return 0 si
	 * suman mas de 100 return 0
	 * 
	 * @param num1
	 *            entero a sumar
	 * @param num2
	 *            entero a sumar
	 * @return suma de los dos parametros, pero: <br>
	 *         si cualquiera de los dos numeros es negativo return 0 <br>
	 *         si la suma es superior a 100 return 0
	 */
	static public int sumaTonta(int num1, int num2) {
		int resultado = -1;

		if (num1 < 0 || num2 < 0 || (num1 + num2 > 100)) {
			resultado = 0;
		} else {
			resultado = num1 + num2;
		}
		return resultado;

	}
}
