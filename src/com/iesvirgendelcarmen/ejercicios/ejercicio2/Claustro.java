package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Claustro {
	
	List<Profesor> listaProfesores = new ArrayList<>();
	
	public void addProfesor(Profesor p){
		listaProfesores.add(p);
	}
	
	public void eliminarProfesor(Profesor p){
		listaProfesores.remove(p);
	}
	
	public int numeroProfesores(){
		return listaProfesores.size();
	}
	
	public List<Profesor> getProfesorMasAntiguo(){
		List<Profesor> profesoresMasAntiguos = new ArrayList<>();
		int antiguedad = Integer.MIN_VALUE;
		for (Profesor profesor : listaProfesores) {
			if (profesor instanceof ProfesorTitular ){
				int antiguedadProfesor = Auxiliar.calcularTiempoDesdeActual(
						((ProfesorTitular) profesor).getFechaOposicion());
				if (antiguedadProfesor > antiguedad){
					antiguedad = antiguedadProfesor;
					profesoresMasAntiguos.clear();
					profesoresMasAntiguos.add(profesor);
				}
				if (antiguedadProfesor == antiguedad){
					antiguedad = antiguedadProfesor;
					profesoresMasAntiguos.add(profesor);
				}
			}
			else {
				int antiguedadProfesor = Auxiliar.calcularTiempoDesdeActual(
						((ProfesorInterino) profesor).getAnnoIncorporacion());
				if (antiguedadProfesor > antiguedad){
					antiguedad = antiguedadProfesor;
					profesoresMasAntiguos.clear();
					profesoresMasAntiguos.add(profesor);
				}
				if (antiguedadProfesor == antiguedad){
					antiguedad = antiguedadProfesor;
					profesoresMasAntiguos.add(profesor);
				}
			}
		} 
		return profesoresMasAntiguos;
	}
	
	public List<Profesor> getProfesorMenosAntiguo(){
		List<Profesor> profesoresMenosAntiguos = new ArrayList<>();
		int antiguedad = Integer.MAX_VALUE;
		for (Profesor profesor : listaProfesores) {
			if (profesor instanceof ProfesorTitular ){
				int antiguedadProfesor = Auxiliar.calcularTiempoDesdeActual(
						((ProfesorTitular) profesor).getFechaOposicion());
				if (antiguedadProfesor < antiguedad){
					antiguedad = antiguedadProfesor;
					profesoresMenosAntiguos.clear();
					profesoresMenosAntiguos.add(profesor);
				}
				if (antiguedadProfesor == antiguedad){
					antiguedad = antiguedadProfesor;
					profesoresMenosAntiguos.add(profesor);
				}
			}
			else {
				int antiguedadProfesor = Auxiliar.calcularTiempoDesdeActual(
						((ProfesorInterino) profesor).getAnnoIncorporacion());
				if (antiguedadProfesor < antiguedad){
					antiguedad = antiguedadProfesor;
					profesoresMenosAntiguos.clear();
					profesoresMenosAntiguos.add(profesor);
				}
				if (antiguedadProfesor == antiguedad){
					antiguedad = antiguedadProfesor;
					profesoresMenosAntiguos.add(profesor);
				}
			}
		} 
		return profesoresMenosAntiguos;
	}

	@Override
	public String toString() {
		return "Claustro [listaProfesores=" + listaProfesores + "]";
	}
	
	

}
