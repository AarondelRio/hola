package com.ipartek.formacion.receta.ejercicios.herencia;

public class EjercicioConcesionario {

	public static void main(String[] args) {
		// TODO Crear vehiculos y mostrar por pantalla
		Vehiculo prius = new Vehiculo();
		prius.setPlazas(5);
		prius.setPotencia(300);
		prius.setModelo("Prius");
		System.out.println(prius.toString());

		Vehiculo ibiza = new Vehiculo();
		ibiza.setPlazas(5);
		ibiza.setPotencia(500);
		ibiza.setModelo("Ibiza");
		System.out.println(ibiza.toString());

		Vehiculo fiesta = new Vehiculo();
		fiesta.setPlazas(4);
		fiesta.setPotencia(100);
		fiesta.setModelo("Fiesta");
		System.out.println(fiesta.toString());

		VehiculoElectrico tesla = new VehiculoElectrico();
		tesla.setPlazas(5);
		tesla.setPotencia(150);
		tesla.setModelo("tesla");
		tesla.setCapacidadBateria(500);
		System.out.println(tesla.toString());

		VehiculoDiesel xsara = new VehiculoDiesel();
		xsara.setPlazas(5);
		xsara.setPotencia(100);
		xsara.setModelo("Xsara");
		xsara.setCapacidadCombustible(95);
		System.out.println(xsara.toString());

		VehiculoDiesel astra = new VehiculoDiesel();
		astra.setPlazas(5);
		astra.setPotencia(98);
		astra.setModelo("Astra");
		astra.setCapacidadCombustible(98);
		System.out.println(astra.toString());

	}

}
