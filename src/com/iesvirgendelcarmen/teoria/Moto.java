package com.iesvirgendelcarmen.teoria;

public class Moto extends Vehiculo {
	private TipoMoto tipoMoto;

	public Moto(double tara,  String numeroBastidor, int potencia,
			Combustible combustible, TipoMoto tipoMoto) {
		super(2, tara, 2, numeroBastidor, potencia, combustible);
		this.tipoMoto = tipoMoto;
	}

	@Override
	public String toString() {
		return "Moto [tipoMoto=" + tipoMoto + "\n" + super.toString() + "]";
	}
	

}
