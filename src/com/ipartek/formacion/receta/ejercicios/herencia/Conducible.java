package com.ipartek.formacion.receta.ejercicios.herencia;

/**
 * 
 * @author Curso
 *
 */
public interface Conducible {
	final String DERECHA = "giro derecha";
	final String IZQUIERDA = "giro izquierda";

	void arrancar();

	void detener();

	void girar(String direccion);
}
