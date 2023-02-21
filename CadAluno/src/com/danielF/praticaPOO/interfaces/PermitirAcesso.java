package com.danielF.praticaPOO.interfaces;

//esta interface sera para contrato de autenticaçao;
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);// apenas declaraçao do metodo do contrato com parametros de
															// login e senha'

	public boolean autenticar();

}
