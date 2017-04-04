package com.iesvirgendelcarmen.teoria2;

import com.iesvirgendelcarmen.teoria.AA;

public class TestFinal {

	public static void main(String[] args) {
		AA a = new AA();
		//¿A qué variables puedo acceder sin usar métodos de acceso (getters)
		//¿A qué métodos puedo acceder?
		a.metodoPublic();
	/*	a.metodoProtected();
		a.metodoPackage();*/
		//a.metodoPrivate();
		a.getModificadorPrivado();
		
		B b = new B();
		//¿A qué variables puedo acceder sin usar métodos de acceso (getters)
		System.out.println(b.modificadorPublico);
		//¿A qué métodos puedo acceder?
		b.metodoPublic(); //sobreescrito
		b.metodoProtected(); //sobreescrito
		//b.metodoPackage(); //sobreescrito
		//b.metodoPrivate();
		b.getModificadorPrivado(); // no sobreescrito
		
		C c = new C();
		c.accesoAVariablesDeA();

	}

}

class B extends AA {
	public void accesoAVariablesPadre(){
		modificadorProtected += " hola";
		modificadorPublico = false;
		//constantePackage *= 2;
		System.out.printf("%S -%B%n", modificadorProtected,
				modificadorPublico );
		System.out.println("Accediendo al valor de la variable privada: " + 
				getModificadorPrivado());
		
	}

	@Override
	public void metodoPublic() {
		System.out.printf("%S -%B%n", modificadorProtected,
				modificadorPublico);
		
	}

	@Override
	protected void metodoProtected() {
		System.out.printf("%S -%B%n", modificadorProtected,
				modificadorPublico);
		
	}

	/*@Override
	void metodoPackage() {
		System.out.printf("%S -%B - %d%n", modificadorProtected,
				modificadorPublico, constantePackage );
		
	}*/
}
class C {
	AA a = new AA();
	public void accesoAVariablesDeA(){
		//a.modificadorProtected += " hola";
		a.modificadorPublico = false;
		//constantePackage *= 2;
		System.out.printf("%B/%n",
				a.modificadorPublico);
		System.out.println("Accediendo al valor de la variable privada: " + 
				a.getModificadorPrivado());
		
	}
	
}


