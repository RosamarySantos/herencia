package com.iesvirgendelcarmen.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class PruebaInformaticos {

	public static void main(String[] args) {
		
		List<Informatico> listaInformaticos = new ArrayList<>();
		
		Informatico i1 = new Analista("Dapda", "Base datos");
		i1.setSueldoPorHoras(30);
		listaInformaticos.add(i1);
			
		Informatico i2 = new Programador("Dapda", "python");
		i2.setSueldoPorHoras(20);
		listaInformaticos.add(i2);

	
		Informatico i3 = new Programador("Dapda", "php");
		i3.setSueldoPorHoras(15);
		listaInformaticos.add(i3);

		mostrarInformacionInformatico(listaInformaticos);
		

	}
	
	public static void mostrarInformacionInformatico
	(List<Informatico> i){
		for (Informatico informatico : i) {
			System.out.println(informatico);
			System.out.printf("Paga de %d horas: %.2f €%n",
					40, informatico.pagarSueldo(40));
			System.out.println("===========================");
		}
		
	}

}
