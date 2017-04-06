package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.time.LocalDate;
import java.time.Month;

public class Persona {
	
	private String nombrePersona;
	private String apellidosPersona;
	private LocalDate fechaNacimientoPersona;
	private String nif;
	private Sexo sexoPersona;
	public Persona(String nombrePersona, String apellidosPersona, LocalDate fechaNacimientoPersona, String nif,
			Sexo sexoPersona) throws NIFException {
		if (Auxiliar.validarNIF(nif)){
			this.nombrePersona = nombrePersona;
			this.apellidosPersona = apellidosPersona;
			this.fechaNacimientoPersona = fechaNacimientoPersona;
			this.nif = nif;
			this.sexoPersona = sexoPersona;
		}
		else
			throw new NIFException();
	}
	@Override
	public String toString() {
		return apellidosPersona + ", " + nombrePersona +
				". Edad: " + Auxiliar.calcularEdad(fechaNacimientoPersona);
	}
	
	public static void main(String[] args) {
		LocalDate fechaNacimientoPersona = LocalDate.of(1960, Month.JANUARY, 1);
		String  nif = "11111111h";
		try {
			Persona p = new Persona("nombrePersona", "apellidosPersona", 
					fechaNacimientoPersona, nif, Sexo.OTRO);
			System.out.println(p);
		} catch (NIFException e) {
			System.out.println("NIF no válido");
		}
	}
	
	

}
