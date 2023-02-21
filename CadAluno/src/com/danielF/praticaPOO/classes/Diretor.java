package com.danielF.praticaPOO.classes;

import com.danielF.praticaPOO.interfaces.PermitirAcesso;

//Nesta classe temos atributos e metodos referentes ao Diretor herdando alguns atributos e metodos da classe Pessoa.
public class Diretor extends Pessoa implements PermitirAcesso{

	private String registroEducaçao;
	private int tempoDirecao;
	private String titulacao;
	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
		
	}
	
	public Diretor() {
		
	}

	public String getRegistroEducaçao() {
		return registroEducaçao;
	}

	public void setRegistroEducaçao(String registroEducaçao) {
		this.registroEducaçao = registroEducaçao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double salario() {

		return 4589.90;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducaçao=" + registroEducaçao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", registroGeral=" + registroGeral + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", nomeMae=" + nomeMae + "]";
	}

	@Override
	public boolean autenticar(String login, String senha) {
		
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("master");
	}

}
