package com.jse.banco.entidades;

import java.util.ArrayList;

public class Salida {
	
	/*Metodos*/
	
	public void imprimirCuentas (ArrayList<Cuenta> cuentas){
		for (Cuenta cuentas1 : cuentas){
			cuentas1.imprimir();
		}
	}
	
	public void imprimirClientes (ArrayList<Cliente> clientes){
		for (Cliente clientes1 : clientes){
			clientes1.imprimir ();
			
		}
		
	}

}
