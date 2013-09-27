#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.NOME_APLICACAO.aplicacao.facade;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.seam.remoting.annotations.WebRemote;

import ${package}.NOME_APLICACAO.aplicacao.servicos.PessoaAS;
import ${package}.TIPO_DOMINIO.dominio.modelo.Pessoa;

@Named(value="testeSeam3Facade")
public class NOME_APLICACAOFacade implements Serializable {

	private static final long serialVersionUID = 95438074873529936L;

	@Inject PessoaAS pessoaAS;
	
	public boolean adicionarPessoa(String nome){
		return pessoaAS.criaConta(nome);
	}
	
	public List<Pessoa> listar() {
		return pessoaAS.listar();
	}
	
	@WebRemote
	public void metodoJavascript(){
		System.out.println("Chamando via Javascript");
	}
	
}

