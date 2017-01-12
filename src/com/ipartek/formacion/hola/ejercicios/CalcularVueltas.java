package com.ipartek.formacion.hola.ejercicios;

public class CalcularVueltas {

	public static int calcularCambios(float vueltas, float cambio) {
		int numeroCambio = 0;
		while (vueltas >= cambio) {
			vueltas -= cambio;
			numeroCambio++;
		}
		return numeroCambio;
	}

	public static void main(String[] args) {
		float compra = (float) 1326.24;
		float pago = 4 * 500;
		float vuelta = (pago - compra);

		final float[] aCambio = { 50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };
		int[] aNumeroCambio = new int[aCambio.length];

		System.out.println("---------------------");
		System.out.println("-----TICKET----------");
		System.out.println("---------------------");
		System.out.println("PAGO:" + compra + "€");
		System.out.println("RETORNO:" + (vuelta) + "€");

		for (int i = 0; i < aCambio.length; i++) {
			aNumeroCambio[i] = calcularCambios(vuelta, aCambio[i]);
			vuelta -= (aCambio[i] * aNumeroCambio[i]);
			System.out.println(aNumeroCambio[i] + " unidades" + " de " + aCambio[i]);

		}

		System.out.println("---------------------");
		System.out.println("Gracias por su visita");
		System.out.println("---------------------");
	}
}
