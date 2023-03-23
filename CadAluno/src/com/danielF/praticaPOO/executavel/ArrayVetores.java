package com.danielF.praticaPOO.executavel;

import javax.swing.JOptionPane;

import com.danielF.praticaPOO.classes.Aluno;
import com.danielF.praticaPOO.classes.Disciplina;

public class ArrayVetores {

	public static void main(String[] args) {
		
		double[] notasDisciplina1 = {8.5, 6.4, 7.9, 9.5};
		double[] notasDisciplina2 = {2.5, 7.5, 10.0, 5.5};
		
		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");
		aluno.setNomeEscola("Curso jdev");
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Java");
		disciplina1.setNota(notasDisciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Java");
		disciplina2.setNota(notasDisciplina2);
		
		aluno.getDisciplinas().add(disciplina1);
		aluno.getDisciplinas().add(disciplina2);
	}

}
