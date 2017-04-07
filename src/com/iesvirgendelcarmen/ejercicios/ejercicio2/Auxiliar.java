package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Auxiliar {
	
	public static boolean validarNIF(String nif){
		return 	comprobarFormato(nif) && aplicarAlgoritmoNIF(nif);
	}
	
	private static boolean comprobarFormato(String nif){
		return nif.matches("[0-9]{8}[a-zA-Z]");
	}
	
	private static boolean aplicarAlgoritmoNIF(String nif){
		final String NIF_STRING_ASOCIATION = 
				"TRWAGMYFPDXBNJZSQVHLCKE";
		int dni = Integer.parseInt(nif.substring(0, 8));
		char letra = nif.toUpperCase().charAt(8);			
		return letra == NIF_STRING_ASOCIATION.charAt(dni % 23);
	}
	
	public static int calcularTiempoDesdeActual(LocalDate fecha){
		LocalDate hoy = LocalDate.now();
		Period p = Period.between(fecha, hoy);
		return p.getYears();
	}
	
	public static String formatearFecha(LocalDate fecha){
		return fecha.getDayOfMonth() + "-" + fecha.getMonthValue() +
				"-" + fecha.getYear();
	}
	
	public static void main(String[] args) {
		System.out.println(validarNIF("11111111h"));
		LocalDate birthday = LocalDate.of(960, Month.JANUARY, 1);
		System.out.println(calcularTiempoDesdeActual(birthday));

	}
	
}
