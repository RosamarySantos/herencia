package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.time.LocalDate;
import java.time.Month;

public class ProfesorInterino extends Profesor{
	
	private LocalDate annoIncorporacion;

	public ProfesorInterino(String nombrePersona, String apellidosPersona, LocalDate fechaNacimientoPersona, String nif,
			Sexo sexoPersona, String especialidad, LocalDate annoIncorporacion) throws NIFException {
		super(nombrePersona, apellidosPersona, fechaNacimientoPersona, nif, sexoPersona, especialidad);
		this.annoIncorporacion = annoIncorporacion;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [annoIncorporacion=" + Auxiliar.formatearFecha(annoIncorporacion)
		+ ", toString()=" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		LocalDate fechaNacimientoPersona = LocalDate.of(1960, Month.JANUARY, 1);
		String  nif = "11111111h";
		LocalDate fechaOposicion = LocalDate.of(1990, Month.DECEMBER, 1);

		try {
			ProfesorInterino p = new ProfesorInterino("nombrePersona", "apellidosPersona", 
					fechaNacimientoPersona, nif,Sexo.OTRO, "especialidad", fechaOposicion);
			System.out.println(p);
		} catch (NIFException e) {
			System.out.println("NIF no válido");
		}
	}
	
}
