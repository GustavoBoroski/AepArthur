package br.com.unicesumar.model;

import java.util.Objects;

public class Nota {

	private double valor;

	public Nota(double valor) {
		this.valor = valor;
		validarNota();
	}
	
	public void validarNota() {
		if(Objects.isNull(valor)) {
			throw new RuntimeException("Nota não pode ser menor que 0 e maior que 10 ");
		}
		if(this.valor < 0 || this.valor > 10) {
			throw new RuntimeException("Nota não pode ser menor que 0 e maior que 10 ");
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Nota:" + valor;
	}
}
