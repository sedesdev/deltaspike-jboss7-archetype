#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.NOME_APLICACAO.aplicacao.servicos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.apache.deltaspike.jpa.api.transaction.Transactional;

import ${package}.NOME_APLICACAO.infra.persistencia.EsquemaCAD;
import ${package}.NOME_APLICACAO.infra.persistencia.fabrica.FabricaRepositorios;
import ${package}.TIPO_DOMINIO.dominio.modelo.Pessoa;
import ${package}.TIPO_DOMINIO.dominio.repositorio.RepositorioPessoa;


@Named
public class PessoaAS implements Serializable {

	private static final long serialVersionUID = -6220520258682680149L;
	
	// Os injects de repositorioUtil deveria ser feito apenas no AS
	@Inject @EsquemaCAD EntityManager entityManager;
		
	public List<Pessoa> listar() {
		RepositorioPessoa repoPessoa = new FabricaRepositorios(entityManager)
											.construirRepositorioPessoa();	
		
		return repoPessoa.listar();
	}

	
	@Transactional
	public boolean criaConta(String nome) {
		try {
			RepositorioPessoa repoPessoa = new FabricaRepositorios(entityManager)
												.construirRepositorioPessoa();
			
			Pessoa a = new Pessoa();
			a.setName(nome);

			repoPessoa.adicionar(a);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
