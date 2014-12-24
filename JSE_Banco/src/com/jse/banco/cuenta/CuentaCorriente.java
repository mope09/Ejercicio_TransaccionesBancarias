package com.jse.banco.cuenta;

public class CuentaCorriente extends Cuenta {

	private String id;
	private String chequera;

	public CuentaCorriente(String id) {
		this.id = id;
		this.setInteres(0.00015);
		this.setEstado(1);
	}

	/* Metodos */
	public boolean depositar(double monto) {
		if (monto < 0) {
			System.out
					.println("No se puede realizar depositos de valores negativos");
			return false;
		} else {
			try {
				double descuento = 0.1;
				descuento = monto * descuento;
				this.setSaldo(getSaldo() + monto);
				this.setSaldo(getSaldo() - descuento);
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
			if (monto < this.getEstado()) {
				if (monto < 2000) {
					try {
						this.setSaldo(getSaldo() - monto);
						return true;
					} catch (Exception e) {
						System.out.println("No se realizo el deposito");
						return false;
					}
				} else {
					System.out
							.println("No se puede realizar retiros mas de 2000 (C. Corriente)");
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

	public String getChequera() {
		return chequera;
	}

	public void setChequera(String chequera) {
		this.chequera = chequera;
	}
}
