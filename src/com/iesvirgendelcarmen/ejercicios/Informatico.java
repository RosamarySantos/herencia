package com.iesvirgendelcarmen.ejercicios;

public class Informatico {
	
	private String nombreEmpresa;
	private double sueldoPorHoras;
	
	public Informatico(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public double getSueldoPorHoras() {
		return sueldoPorHoras;
	}

	public void setSueldoPorHoras(double sueldoPorHoras) {
		this.sueldoPorHoras = sueldoPorHoras;
	}
	
	public double pagarSueldo(double numeroHoras){
		return numeroHoras * sueldoPorHoras;
	}

	@Override
	public String toString() {
		return "Informatico [nombreEmpresa=" + nombreEmpresa +
				", sueldoPorHoras=" + sueldoPorHoras + "]";
	}
	
	
}
