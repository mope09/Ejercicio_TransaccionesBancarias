package com.jse.banco.cuenta;

public abstract class Cuenta implements Imprimible {
	
	private String id;
	protected  Double saldo;
	private Double interes;
	private int estado;
	
	/*Metodos*/
	public abstract boolean depositar (double monto);
	
	public abstract boolean retirar (double monto);
	/*Getters & Setters*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getInteres() {
		return interes;
	}
	public void setInteres(Double interes) {
		this.interes = interes;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public void imprimir() {
		// TODO Auto-generated method stub
		
		System.out.println("************************** ");
		System.out.println("Id de Cuenta: "+this.getId());
		System.out.println("Estado: "+this.getEstado());
		System.out.println("Interes: "+this.getInteres());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("************************** ");
		
	}

}
