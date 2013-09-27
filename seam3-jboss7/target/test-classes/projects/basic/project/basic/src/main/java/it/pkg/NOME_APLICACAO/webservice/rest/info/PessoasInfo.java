package it.pkg.NOME_APLICACAO.webservice.rest.info;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PessoasInfo {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
