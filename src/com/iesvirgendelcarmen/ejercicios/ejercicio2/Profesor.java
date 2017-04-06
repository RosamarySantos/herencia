package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.time.LocalDate;
import java.time.Month;

public class Profesor extends Persona {
	private String especialidad;

	public Profesor(String nombrePersona, String apellidosPersona, LocalDate fechaNacimientoPersona, String nif,
			Sexo sexoPersona, String especialidad) throws NIFException {
		super(nombrePersona, apellidosPersona, fechaNacimientoPersona, nif, sexoPersona);
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ". " + 
				super.toString() + "]";
	}
	
	public static void main(String[] args) {
		LocalDate fechaNacimientoPersona = LocalDate.of(1960, Month.JANUARY, 1);
		String  nif = "1111111h";
		try {
			Profesor p = new Profesor("nombrePersona", "apellidosPersona", 
					fechaNacimientoPersona, nif,Sexo.OTRO, "especialidad");
			System.out.println(p);
		} catch (NIFException e) {
			System.out.println("NIF no válido");
		}
	}
}
