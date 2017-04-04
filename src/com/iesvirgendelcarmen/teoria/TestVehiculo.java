package com.iesvirgendelcarmen.teoria;

public class TestVehiculo {

	public static void main(String[] args) {
		Coche coche =  new Coche(1000, 5, "2333222", 125,
				Combustible.GASOLINA, Traccion.DELANTERA,
				false, 5);
		Moto moto =  new Moto(150, "M1211231", 400,
				Combustible.GASOLINA, TipoMoto.CARRETERA);
		System.out.println(coche);
		System.out.println(moto);
		imprimirTipoCombustibleDadoBastidor("2333222", coche);
		imprimirTipoCombustibleDadoBastidor("M1211231", moto);
		imprimirTipoCombustibleDadoBastidor("2333222", moto);
		System.out.println(coche.equals(moto));
		System.out.println(coche.equals(coche));


		
	}
	public static void imprimirTipoCombustibleDadoBastidor(String numeroBastidor,
			Vehiculo vehiculo) {
		if (vehiculo.getNumeroBastidor().equals(numeroBastidor))
			System.out.printf("El vehiculo con bastidor %s usa como "
					+ "combustible %s%n", numeroBastidor, vehiculo.getCombustible());
		else
			System.out.printf("El vehiculo con bastidor %s no corresponde%n", 
					numeroBastidor);
	}
}
