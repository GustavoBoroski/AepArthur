package br.com.unicesumar.test.projetoAepPoo;

import java.util.ArrayList;
import java.util.List;

import br.com.unicesumar.model.Aluno;
import br.com.unicesumar.model.Avaliacao;
import br.com.unicesumar.model.Conceito;
import br.com.unicesumar.model.Nota;

public class test {

	public static void main(String[] args) {

		List<Nota> notasGustavo = new ArrayList<Nota>();
		notasGustavo.add(new Nota(5));
		notasGustavo.add(new Nota(3));
		notasGustavo.add(new Nota(7));
		notasGustavo.add(new Nota(5));
		
		Conceito conceito1 = new Conceito(new Avaliacao("Matematica", notasGustavo), new Aluno("Gustavo"));
		conceito1.calcularMedia(notasGustavo);
		conceito1.mostrarConceito();
		//conceito1.mostraNotas(notasGustavo);
		
		List<Nota> notasAlice = new ArrayList<Nota>();
		notasAlice.add(new Nota(10));
		notasAlice.add(new Nota(10));
		notasAlice.add(new Nota(10));
		notasAlice.add(new Nota(10));
		
		Conceito conceito2 = new Conceito(new Avaliacao("Matematica", notasAlice), new Aluno("Alice"));
		conceito2.calcularMedia(notasAlice);
		conceito2.mostrarConceito();
		//conceito2.mostraNotas(notasAlice);
		
		
		
	}
}
