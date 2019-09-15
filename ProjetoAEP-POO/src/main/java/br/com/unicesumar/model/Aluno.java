package br.com.unicesumar.model;

import java.util.Objects;

public class Aluno {

	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
		validarNome();
	}
	
	public void validarNome(){
		if(Objects.isNull(nome) || this.nome.isEmpty()) {
			throw new RuntimeException("Nome não pode ser nulo");
		}
	}

	@Override
	public String toString() {
		return "\nAluno \nNome: " + nome;
	}
}
