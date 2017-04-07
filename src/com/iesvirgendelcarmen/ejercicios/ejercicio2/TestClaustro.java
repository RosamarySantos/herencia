package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.time.LocalDate;
import java.util.Scanner;

public class TestClaustro {

	public static void main(String[] args) {
		Claustro claustro = new Claustro();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("Nombre de profesor:");
			String nombreProfesor = in.next();
			if (nombreProfesor.equals("fin")){
				in.close();
				break;
			}
			System.out.println("Apellidos de profesor:");
			String apellidosProfesor = in.next();
			System.out.println("Día de nacimiento:");
			int diaNacimiento = in.nextInt();
			System.out.println("Mes de nacimiento:");
			int mesNacimiento = in.nextInt();
			System.out.println("Año de nacimiento:");
			int annoNacimiento = in.nextInt();
			LocalDate fechaNacimiento = LocalDate.of(annoNacimiento, mesNacimiento, diaNacimiento);
			System.out.println("NIF");
			String nif = in.next();
			System.out.println("Sexo: hombre (H), mujer (M), otro (O)");
			String sexo= in.next();
			Sexo sexoProfesor;
			switch (sexo) {
			case "H": 
				sexoProfesor = Sexo.HOMBRE;
				break;
			case "M":
				sexoProfesor = Sexo.MUJER;
				break;
			default:
				sexoProfesor = Sexo.OTRO;
				break;
			}
			System.out.println("Especialidad:");
			String especialidad = in.next();
			System.out.println("Día de incorporación:");
			int diaIncorporacion = in.nextInt();
			System.out.println("Mes de incorporación:");
			int mesIncorporacion = in.nextInt();
			System.out.println("Año de incorporación:");
			int annoIncorporacion = in.nextInt();
			LocalDate fechaIncorporacion = LocalDate.of(annoIncorporacion, mesIncorporacion, diaIncorporacion);
			System.out.println("Titular o Interino: Titular (T), Interino (I)");
			String tipoProfesor = in.next().toUpperCase();
			if (tipoProfesor.equals("T")){
				try {
					ProfesorTitular profesor = new ProfesorTitular(nombreProfesor, apellidosProfesor, 
							fechaNacimiento, nif, sexoProfesor, especialidad, fechaIncorporacion);
					claustro.addProfesor(profesor);
				} catch (NIFException e) {
					System.out.println("No se puede crear profesor");
				}
			}
			else {
				try {
					ProfesorInterino profesor = new ProfesorInterino(nombreProfesor, apellidosProfesor, 
							fechaNacimiento, nif, sexoProfesor, especialidad, fechaIncorporacion);
					claustro.addProfesor(profesor);
				} catch (NIFException e) {
					System.out.println("No se puede crear profesor");
				}
			}
		}
		System.out.println(claustro);

	}

}
