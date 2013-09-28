#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.NOME_APLICACAO.infra.persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import ${package}.TIPO_DOMINIO.dominio.modelo.Pessoa;
import ${package}.TIPO_DOMINIO.dominio.repositorio.RepositorioPessoa;
import ${package}.base.infra.persistencia.RepositorioGenericoJPA;

public class RepositorioPessoaJPA extends RepositorioGenericoJPA<Pessoa, Long> implements RepositorioPessoa {
	
	public RepositorioPessoaJPA(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pessoa> listar() {
		return super.listar();
	}

	@Override
	public void adicionar(Pessoa pessoa) {
		super.adicionar(pessoa);
	}

}
