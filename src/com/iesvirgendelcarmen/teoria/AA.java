package com.iesvirgendelcarmen.teoria;

public class AA {
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
