package com.iesvirgendelcarmen.ejercicios;

public class Analista extends Informatico {

	private String especialidad;

	public Analista(String nombreEmpresa, String especialidad) {
		super(nombreEmpresa);
		this.especialidad = especialidad;
	}

	@Override
	public double pagarSueldo(double numeroHoras) {
		// TODO Auto-generated method stub
		return super.pagarSueldo(numeroHoras) * 1.3;
	}

	@Override
	public String toString() {
		return "Analista [especialidad=" + especialidad + ", " + super.toString() + "]";
	}
	
	
	
	
	
	
	
}
