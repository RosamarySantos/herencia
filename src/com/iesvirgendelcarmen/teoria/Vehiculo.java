package com.iesvirgendelcarmen.teoria;

public class Vehiculo {
	
	private int numeroRuedas;
	private double tara;
	private int numeroPlazas;
	private String numeroBastidor;
	private int potencia;
	private Combustible combustible;
	
	public Vehiculo(int numeroRuedas, double tara, int numeroPlazas, 
			String numeroBastidor, int potencia, Combustible combustible) {
		this.numeroRuedas = numeroRuedas;
		this.tara = tara;
		this.numeroPlazas = numeroPlazas;
		this.numeroBastidor = numeroBastidor;
		this.potencia = potencia;
		this.combustible = combustible;
	}
	
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public double getTara() {
		return tara;
	}
	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	public String getNumeroBastidor() {
		return numeroBastidor;
	}
	public int getPotencia() {
		return potencia;
	}
	public Combustible getCombustible() {
		return combustible;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", tara=" + tara + ", numeroPlazas=" + numeroPlazas
				+ ", numeroBastidor=" + numeroBastidor + ", potencia=" + potencia + ", combustible=" + combustible
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroBastidor == null) ? 0 : numeroBastidor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (numeroBastidor == null) {
			if (other.numeroBastidor != null)
				return false;
		} else if (!numeroBastidor.equals(other.numeroBastidor))
			return false;
		return true;
	}
	
	
	
}
