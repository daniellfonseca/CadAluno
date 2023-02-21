package com.danielF.praticaPOO.classesAuxiliares;

import com.danielF.praticaPOO.interfaces.PermitirAcesso;

public class Autenticar {

	private PermitirAcesso permitirAcesso;
	
	/*somente autoriza quem possui o contrato de autenticar*/
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public Autenticar (PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
}
