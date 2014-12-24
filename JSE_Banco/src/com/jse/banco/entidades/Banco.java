package com.jse.banco.entidades;

import java.util.ArrayList;

public class Banco {

	private String nombre;
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	/* Constructor */

	public Banco(String nombre) {
		this.nombre = nombre;
	}

	/* Metodos */

	public Cliente buscarCliente(String ced) {
		Cliente cliente1 = null;
		for (Cliente client : clientes) {
			String cedula = client.getCedula();
			if (cedula == ced) {
				cliente1 = client;
				break;
			}
		}
		return cliente1;
	}

	public boolean agregarCliente(Cliente cliente2) {
		Cliente nuevoC = buscarCliente(cliente2.getCedula());
		if (nuevoC == null) {
			clientes.add(cliente2);
			return true;
		}
		return false;

	}

	public ArrayList<Cliente> buscarClientesPorSaldo(double saldo) {
		ArrayList<Cliente> mayores = new ArrayList<Cliente>();
		for (Cliente client1 : clientes) {
			for (Cuenta cuenta1 : client1.getCuentas())
				if (cuenta1.getSaldo() >= saldo) {
					mayores.add(client1);
					break;
				}
		}
		return mayores;
	}

	public ArrayList<Cliente> buscarClientesPorEdad(int edad) {

		ArrayList<Cliente> menores = new ArrayList<Cliente>();
		for (Cliente client1 : clientes) {
			if (client1.getEdad() <= edad) {
				menores.add(client1);
			}
		}
		return menores;

	}

	public Cuenta buscarCuenta(String id) {
		Cuenta encontrado = null;
		for (Cliente client1 : clientes) {
			for (Cuenta cuenta1 : client1.getCuentas()) {
				if (cuenta1.getId() == id) {
					encontrado = cuenta1;
					break;
				}
			}
			if (encontrado != null) {
				break;
			}
		}
		return encontrado;

	}

	public void asignarCuenta(Cuenta cuentaN, Cliente clienteN) {
		clienteN.cuentas.add(cuentaN);
	}

	public boolean depositar(String id, Double monto) {
		Cuenta cuentaA = buscarCuenta(id);
		return cuentaA.depositar(monto);
	}

	public boolean retirar(String id, Double monto) {
		Cuenta cuentaA = buscarCuenta(id);
		return cuentaA.retirar(monto);
	}

	public boolean transferir(String idOrigen, String idDestino, Double monto) {
		Cuenta encontrado = null;
		Cuenta corigen = buscarCuenta(idOrigen);
		Cuenta cdestino = buscarCuenta(idDestino);
		if (corigen.retirar(monto) == true) {
			if (cdestino.depositar(monto) == true) {
				return true;
			} else {
				return false;
			}
		} else
			return false;
	}

}
