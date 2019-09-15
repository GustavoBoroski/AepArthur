package br.com.unicesumar.model;

import java.util.List;
import java.util.Random;

public class Conceito {

	private String id;
	private Nota nota; 
	private Avaliacao avaliacao;
	private Aluno aluno;
	
	public Conceito(Avaliacao avaliacao, Aluno aluno) {
		this.nota = nota;
		this.avaliacao = avaliacao;
		this.aluno = aluno;
		geradorDeId();
	}
	
	public void geradorDeId() {
		String letras = "123456789";
		Random random = new Random();
		String armazenaChaves = "";
		int index = -1;
		for( int i = 0; i < 1; i++ ) {
		   index = random.nextInt( letras.length() );
		   armazenaChaves += letras.substring( index, index + 1 );
		}
		this.id = armazenaChaves;
	}
	
	public void calcularMedia(List<Nota> notas) {
		double media = 0.0;
		for (Nota nota : notas) {
			media += nota.getValor();
		}
		media = media / notas.size();
		if (media >= 6) {
			System.out.println("\n" + this.aluno + " passou com " + media + " de média\n==============");
		} else {
			System.out.println("\n" + this.aluno + " reprovou com " + media + " de média\n==============");
		}
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Nota getNota() {
		return nota;
	}
	
	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void mostraNotas(List<Nota> notas) {
		for (Nota nota : notas) {
			System.out.println(nota);
		}
	}

	public void mostrarConceito() {
		System.out.println("Conceito \nid: " +  id + avaliacao + aluno);
	}
}
