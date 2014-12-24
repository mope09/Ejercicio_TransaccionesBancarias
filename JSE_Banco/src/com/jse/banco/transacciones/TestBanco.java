package com.jse.banco.transacciones;
import java.util.ArrayList;

import com.jse.banco.entidades.*;

public class TestBanco {

	public static void main(String[] args) {
		
		Banco banco1 = new Banco ("Java Bank");
		Cliente cliente1 = new Cliente ("1722735162","Fer","Lima",40);			
		banco1.agregarCliente(cliente1);

		CuentaAhorros cahorros1 = new CuentaAhorros("1111111111");
		cliente1.agregarCuenta(cahorros1);

		Cliente cliente2 = new Cliente ("1719383919","Migue" ,"Espinoza",26);		
		banco1.agregarCliente(cliente2);
		
		CuentaAhorros cahorros2 = new CuentaAhorros("222222222");		
		banco1.asignarCuenta(cahorros2, cliente2);
		
		Cliente cliente3 = new Cliente ("179999999", "Andree", "Espinoza" ,1);				
		banco1.agregarCliente(cliente3);
		
		CuentaCorriente ccorriente1 = new CuentaCorriente("654132154");
		banco1.asignarCuenta(ccorriente1, cliente3);
		
		Salida salida1 = new Salida ();
		
		banco1.depositar("1111111111",10.0); 
		banco1.depositar("222222222",30.0);
		
		salida1.imprimirCuentas(banco1.buscarCliente("1722735162").getCuentas());
		banco1.retirar("222222222", 100.0); //No se puede realizar la transaccion
		banco1.transferir("1111111111", "222222222", 5.0);
		System.out.println("******************************");
		System.out.println("Despues de la transferencia");
		System.out.println("******************************");
		salida1.imprimirCuentas(banco1.buscarCliente("1719383919").getCuentas());
		salida1.imprimirCuentas(banco1.buscarCliente("1722735162").getCuentas());
		

	}

}
