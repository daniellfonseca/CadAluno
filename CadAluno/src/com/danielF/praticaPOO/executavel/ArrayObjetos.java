package com.danielF.praticaPOO.executavel;

import com.danielF.praticaPOO.classes.Aluno;
import com.danielF.praticaPOO.classes.Disciplina;

public class ArrayObjetos {

	public static void main(String[] args) {

		double[] notasDisciplina1 = { 8.5, 6.4, 7.9, 9.5 };
		double[] notasDisciplina2 = { 2.5, 7.5, 10.0, 5.5 };
		double[] notasDisciplina11 = { 7.9, 10, 9.8, 8.7 };
		double[] notasDisciplina12 = { 2.5, 5.9, 10.0, 5.5 };

		Aluno aluno1 = new Aluno();
		aluno1.setNome("JOAO");
		aluno1.setNomeEscola("BESTCODE");

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("ENGENHARIA DE SOFTWARE");
		disciplina1.setNota(notasDisciplina1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("LOGICA DE PROGRAMAÇAO");
		disciplina2.setNota(notasDisciplina2);

		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);

		// -----------------------------------

		Aluno aluno2 = new Aluno();
		aluno2.setNome("MARCOS");
		aluno2.setNomeEscola("BESTCODE");

		Disciplina disciplina11 = new Disciplina();
		disciplina11.setDisciplina("ORIENTAÇAO A OBJETOS");
		disciplina11.setNota(notasDisciplina11);

		Disciplina disciplina12 = new Disciplina();
		disciplina12.setDisciplina("INTEGRAÇãO");
		disciplina12.setNota(notasDisciplina12);

		aluno2.getDisciplinas().add(disciplina11);
		aluno2.getDisciplinas().add(disciplina12);

		Aluno[] arrayAluno = new Aluno[2];

		arrayAluno[0] = aluno1;
		arrayAluno[1] = aluno2;

		for (int posi = 0; posi < arrayAluno.length; posi++) {

			System.out.println("NOME DO ALUNO: " + arrayAluno[posi].getNome() + " / " + "NOME DA ESCOLA: "
					+ arrayAluno[posi].getNomeEscola());

			for (Disciplina disci : arrayAluno[posi].getDisciplinas()) {

				System.out.println("Nome da disciplina: " + disci.getDisciplina());

				for (int posiNota = 0; posiNota < disci.getNota().length; posiNota++) {
					System.out.println("Nota " + posi++ + " é: " + disci.getNota()[posiNota]);
				}
			}

		}

	}

}
