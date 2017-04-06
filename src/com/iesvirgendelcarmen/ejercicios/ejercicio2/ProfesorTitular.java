package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.time.LocalDate;
import java.time.Month;

public class ProfesorTitular extends Profesor {
	
	private LocalDate fechaOposicion;

	public ProfesorTitular(String nombrePersona, String apellidosPersona, 
			LocalDate fechaNacimientoPersona, String nif,
			Sexo sexoPersona, String especialidad, LocalDate fechaOposicion)
					throws NIFException {
		super(nombrePersona, apellidosPersona, fechaNacimientoPersona, nif, sexoPersona, especialidad);
		this.fechaOposicion = fechaOposicion;
	}
	
	
	
	@Override
	public String toString() {
		return "ProfesorTitular [fechaOposicion=" + Auxiliar.formatearFecha(fechaOposicion)
		+ ", " + super.toString() + "]";
	}



	public static void main(String[] args) {
		LocalDate fechaNacimientoPersona = LocalDate.of(1960, Month.JANUARY, 1);
		String  nif = "11111111h";
		LocalDate fechaOposicion = LocalDate.of(1990, Month.DECEMBER, 1);

		try {
			ProfesorTitular p = new ProfesorTitular("nombrePersona", "apellidosPersona", 
					fechaNacimientoPersona, nif,Sexo.OTRO, "especialidad", fechaOposicion);
			System.out.println(p);
		} catch (NIFException e) {
			System.out.println("NIF no válido");
		}
	}
}
