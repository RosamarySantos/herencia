package com.iesvirgendelcarmen.teoria;

public class TestFinal {

	public static void main(String[] args) {
		A a = new A();
		//¿A qué variables puedo acceder sin usar métodos de acceso (getters)
		System.out.println(a.constantePackage + "\t" + a.modificadorProtected + 
				"\t" + a.modificadorPublico);
		//¿A qué métodos puedo acceder?
		a.metodoPublic();
		a.metodoProtected();
		a.metodoPackage();
		//a.metodoPrivate();
		a.getModificadorPrivado();
		
		B b = new B();
		//¿A qué variables puedo acceder sin usar métodos de acceso (getters)
		System.out.println(b.constantePackage + "\t" + b.modificadorProtected + 
				"\t" + b.modificadorPublico);
		//¿A qué métodos puedo acceder?
		b.metodoPublic(); //sobreescrito
		b.metodoProtected(); //sobreescrito
		b.metodoPackage(); //sobreescrito
		//b.metodoPrivate();
		b.getModificadorPrivado(); // no sobreescrito
		
		C c = new C();
		c.accesoAVariablesDeA();

	}

}
class A {
	private int modificadorPrivado = 5;
	protected String modificadorProtected = "hola";
	public boolean modificadorPublico = true;
	final int constantePackage = 8;
	public void metodoPublic(){
		System.out.printf("%d - %S -%B - %d%n", modificadorPrivado, 
				modificadorProtected, modificadorPublico, constantePackage );
	}
	protected void metodoProtected(){
		System.out.printf("%d - %S -%B - %d%n", modificadorPrivado, 
				modificadorProtected, modificadorPublico, constantePackage );
	}
	void metodoPackage(){
		System.out.printf("%d - %S -%B - %d%n", modificadorPrivado, 
				modificadorProtected, modificadorPublico, constantePackage );
	}
	private void metodoPrivate(){
		System.out.printf("%d - %S -%B - %d%n", modificadorPrivado, 
				modificadorProtected, modificadorPublico, constantePackage );
	}
	public int getModificadorPrivado() {
		return modificadorPrivado;
	}
	
}
class B extends A {
	public void accesoAVariablesPadre(){
		modificadorProtected += " hola";
		modificadorPublico = false;
		//constantePackage *= 2;
		System.out.printf("%S -%B - %d%n", modificadorProtected,
				modificadorPublico, constantePackage );
		System.out.println("Accediendo al valor de la variable privada: " + 
				getModificadorPrivado());
		
	}

	@Override
	public void metodoPublic() {
		System.out.printf("%S -%B - %d%n", modificadorProtected,
				modificadorPublico, constantePackage );
		
	}

	@Override
	protected void metodoProtected() {
		System.out.printf("%S -%B - %d%n", modificadorProtected,
				modificadorPublico, constantePackage );
		
	}

	@Override
	void metodoPackage() {
		System.out.printf("%S -%B - %d%n", modificadorProtected,
				modificadorPublico, constantePackage );
		
	}
}
class C {
	A a = new A();
	public void accesoAVariablesDeA(){
		a.modificadorProtected += " hola";
		a.modificadorPublico = false;
		//constantePackage *= 2;
		System.out.printf("%S -%B - %d%n", a.modificadorProtected,
				a.modificadorPublico, a.constantePackage );
		System.out.println("Accediendo al valor de la variable privada: " + 
				a.getModificadorPrivado());
		
	}
	
}

