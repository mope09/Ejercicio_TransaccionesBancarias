package com.jse.banco.entidades;

public class CuentaAhorros extends Cuenta {

	private String id;

	/* Constructor */

	public CuentaAhorros(String id) {
		this.id = id;
		this.setInteres(0.0001);
		this.setEstado(1);
		this.setSaldo(0.0);
	}

	/* Metodos */
	public boolean depositar(double monto) {
		if (monto < 0) {
			System.out
					.println("No se puede realizar depositos de valores negativos");
			return false;
		} else {
			try {
				saldo = saldo + monto;
				return true;

			} catch (Exception e) {
				System.out.println("No se realizo el deposito");
				return false;
			}
		}
	}

	public boolean retirar(double monto) {
		if (monto < 0) {
			System.out
					.println("No se puede realizar retiros de valores negativos");
			return false;
		} else {
			if (monto < this.getSaldo()) {
				if (monto < 1000) {
					try {
						saldo = saldo - monto;
						return true;
					} catch (Exception e) {
						System.out.println("No se realizo el deposito");
						return false;
					}
				} else {
					System.out
							.println("No se puede realizar retiros mas de 1000 (C. Ahorros)");
					return false;
				}
			} else {
				System.out
						.println("No tiene sufuciente saldo para realizar la transacción");
				return false;
			}
		}
	}

	/* Getters & Setters */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
