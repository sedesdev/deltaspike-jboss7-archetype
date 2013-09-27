#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.NOME_APLICACAO.apresentacao.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.solder.logging.Logger;

import ${package}.NOME_APLICACAO.aplicacao.facade.NOME_APLICACAOFacade;
import ${package}.TIPO_DOMINIO.dominio.modelo.Pessoa;



@Named("pessoaViewController")
@ViewScoped
public class PessoaViewController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5691014063631167292L;

	@Inject
	FacesContext facesContext;

	@Inject
	Flash flash;

	@Inject
	HttpServletRequest request;

	@Inject
	HttpServletResponse response;
	
	@Inject NOME_APLICACAOFacade testeSeam3Facade;

	@Inject Logger logger;
	
	
	private String nome;

	public List<Pessoa> listar() {
		return testeSeam3Facade.listar();
	}
	
	public String inserePessoa() {
		boolean retorno = testeSeam3Facade.adicionarPessoa(nome);
		if (retorno){
			logger.info("Pessoa inserida corretamente!");
			return "sucesso";
		}else{
			logger.info("Falha ocorrida!");
			return "falha";
		}
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

}
