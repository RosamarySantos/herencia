package com.iesvirgendelcarmen.ejercicios;

public class Programador extends Informatico {
	
	private String lenguajeProgramacion;

	public Programador(String nombreEmpresa, String lenguajeProgramacion) {
		super(nombreEmpresa);
		this.lenguajeProgramacion = lenguajeProgramacion;
	}

	@Override
	public double pagarSueldo(double numeroHoras) {
		// TODO Auto-generated method stub
		return super.pagarSueldo(numeroHoras) * 1.1;
	}

	@Override
	public String toString() {
		return "Programador [lenguajeProgramacion=" + lenguajeProgramacion + ", "
				+ super.toString() + "]";
	}
	
	
	
	
}
