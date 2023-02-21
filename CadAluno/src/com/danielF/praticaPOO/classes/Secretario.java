package com.danielF.praticaPOO.classes;

import com.danielF.praticaPOO.interfaces.PermitirAcesso;

//Nesta classe temos atributos e metodos referentes ao secretario herdando alguns atributos e metodos da classe Pessoa.
public class Secretario extends Pessoa implements PermitirAcesso {

	private int registro;
	private String nivelCargo;
	private String experiencia;
	private String login;
	private String senha;

	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Secretario() {

	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public double salario() {

		return 2889.90;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", registroGeral=" + registroGeral + ", idade=" + idade + ", dataNascimento="
				+ dataNascimento + ", nomeMae=" + nomeMae + "]";
	}

	// sobrescrita do metodo de autenticar do contrato (interface PermitirAcesso);
	@Override
	public boolean autenticar(String login, String senha) {

		return autenticar();// se TRUE compila, se FALSE não compila;
	}

	// sobrescrita do metodo de autenticar do contrato (interface PermitirAcesso);
	@Override
	public boolean autenticar() {

		return login.equals("admin") && senha.equals("admin");
	}

}
