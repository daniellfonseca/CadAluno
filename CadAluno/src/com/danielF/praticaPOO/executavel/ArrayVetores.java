package com.danielF.praticaPOO.executavel;

import javax.swing.JOptionPane;

import com.danielF.praticaPOO.classes.Aluno;
import com.danielF.praticaPOO.classes.Disciplina;

public class ArrayVetores {

	public static void main(String[] args) {

		double[] notasDisciplina1 = { 8.5, 6.4, 7.9, 9.5 };
		double[] notasDisciplina2 = { 2.5, 7.5, 10.0, 5.5 };

		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");
		aluno.setNomeEscola("Curso jdev");

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Java");
		disciplina1.setNota(notasDisciplina1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Banco de Dados");
		disciplina2.setNota(notasDisciplina2);

		aluno.getDisciplinas().add(disciplina1);
		aluno.getDisciplinas().add(disciplina2);

		System.out.println("NOME DO ALUNO: " + aluno.getNome() + " / " + "NOME DA ESCOLA: " + aluno.getNomeEscola());
		System.out.println("================= DISCIPLINAS ===================");

		for (Disciplina d : aluno.getDisciplinas()) {

			System.out.println("NOME DISCIPLINA " + d.getDisciplina());
			System.out.println("AS NOTAS SãO= ");

			double maiorNota = 0.0;
			double menorNota = 0.0;

			for (int posicao = 0; posicao < d.getNota().length; posicao++) {
				System.out.println("Nota " + (posicao + 1) + " = " + d.getNota()[posicao]);

				if (posicao == 0) {
					maiorNota = d.getNota()[posicao];
				} else {
					if (d.getNota()[posicao] > maiorNota) {
						maiorNota = d.getNota()[posicao];
					}
				}

				if (posicao == 0) {
					menorNota = d.getNota()[posicao];
				} else {
					if (d.getNota()[posicao] < menorNota) {
						menorNota = d.getNota()[posicao];
					}
				}

			}

			System.out.println(
					"A maior nota em " + d.getDisciplina() + " é: " + maiorNota + ". E a menor nota é: " + menorNota);

		}

	}

}
