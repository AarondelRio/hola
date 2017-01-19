package com.ipartek.formacion.recetas.ejercicios.collection;

import java.util.Comparator;

import com.ipartek.formacion.hola.pojo.Receta;
//comparar por numero de ingredientes

public class ComparatorRecetaDificultad implements Comparator<Receta> {

	// COMPARATOR
	@Override
	public int compare(Receta o1, Receta o2) {

		return getNumDificultad(o1) - getNumDificultad(o2);
	}

	private int getNumDificultad(Receta r) {
		int resul = 0;
		switch (r.getDificultad()) {
		case Receta.FACIL:
			resul = 0;
			break;

		case Receta.MODERADA:
			resul = 5;
			break;

		case Receta.DIFICIL:
			resul = 10;
			break;

		default:
			break;
		}
		return resul;
	}

}
