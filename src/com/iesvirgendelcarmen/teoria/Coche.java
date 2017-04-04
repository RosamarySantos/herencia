package com.iesvirgendelcarmen.teoria;

public class Coche extends Vehiculo {
	private Traccion traccion;
	private boolean descapotable;
	private int numeroPuertas;
	public Coche(double tara, int numeroPlazas, String numeroBastidor, int potencia,
			Combustible combustible, Traccion traccion, boolean descapotable, int numeroPuertas) {
		super(4, tara, numeroPlazas, numeroBastidor, potencia, combustible);
		this.traccion = traccion;
		this.descapotable = descapotable;
		this.numeroPuertas = numeroPuertas;
	}
	@Override
	public String toString() {
		return "Coche [traccion=" + traccion + ", descapotable=" + descapotable + ", numeroPuertas=" + numeroPuertas
				+ "]\n" + super.toString();
	}
	
}
