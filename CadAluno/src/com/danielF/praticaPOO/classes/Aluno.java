package com.danielF.praticaPOO.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.danielF.praticaPOO.constantes.StatusAluno;

//Nesta classe temos atributos e metodos referentes ao Aluno herdando alguns atributos e metodos da classe Pessoa.
public class Aluno extends Pessoa {

	private String nomeEscola;
	private String dataMatricula;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplina(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getMediaGeralNota() {
		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();
		}
		return somaNotas / disciplinas.size();
	}

	public boolean getAlunoAprovado() {
		double media = this.getMediaGeralNota();
		if (media >= 50) {
			return true;
		} else {
			return false;
		}
	}

	// metodo teste de estrutura de condição retornando string.
	public String getSituacaoAluno() {
		double media = this.getMediaGeralNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public double salario() {

		return 1589.90;
	}

	@Override
	public String toString() {
		return "Nome do Aluno= " + nome + " , Registro Geral= " + registroGeral + " , Idade= " + idade
				+ " , Data Nascimento= " + dataNascimento + " , Nome da Escola= " + nomeEscola + " , Nome da Mae= "
				+ nomeMae + " , Data da Matricula= " + dataMatricula + " , Serie Matriculado= " + serieMatriculado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, registroGeral);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(registroGeral, other.registroGeral);
	}

}
