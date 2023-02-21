package com.danielF.praticaPOO.classes;

//Superclasse Pessoa tendo atributos e metodos que subclasses herdam.
public abstract class Pessoa {

	protected String nome;
	protected String registroGeral;
	protected int idade;
	protected String dataNascimento;
	protected String nomeMae;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	// método obrigatório nas subclasses;
	public abstract double salario();
	
}
