package br.com.unicesumar.model;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao {

	private String materia;
	private List<Nota> notas;

	public Avaliacao(String materia, List<Nota>notas) {
		this.materia = materia;
		this.notas = new ArrayList<Nota>(notas);
			
	}

	@Override
	public String toString() {
		return "\nMaterias\n" + materia + notas;
	}
}
