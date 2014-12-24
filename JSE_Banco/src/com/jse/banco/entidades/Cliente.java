package com.jse.banco.entidades;

import java.util.ArrayList;

public class Cliente implements Imprimible{
	
	private String cedula;
	private String nombre;
	private String apellido;
	private int edad;
	
	ArrayList<Cuenta> cuentas= new ArrayList<Cuenta>();

	/*Constructor*/
	public Cliente (String cedula,  String nombre, String apellido, int edad){	
		
		this.cedula= cedula;
		this.nombre= nombre;
		this.apellido = apellido;
		this.edad = edad;	
		
	}
	
	public void agregarCuenta (Cuenta e){
		cuentas.add(e);
	}
	
	/*Getters & Setters*/
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public void imprimir() {
		System.out.println("************************** ");
		System.out.println("Cedula: "+this.getCedula());
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Apellido: "+this.getApellido());
		System.out.println("Edad: "+this.getEdad());
		System.out.println("************************** ");
		
	}
	
	

}
