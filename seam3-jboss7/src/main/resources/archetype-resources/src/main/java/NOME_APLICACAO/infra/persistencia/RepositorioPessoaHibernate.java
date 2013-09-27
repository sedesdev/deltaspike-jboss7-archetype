#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.NOME_APLICACAO.infra.persistencia;

import java.util.List;

import org.hibernate.Session;

import ${package}.TIPO_DOMINIO.dominio.modelo.Pessoa;
import ${package}.TIPO_DOMINIO.dominio.repositorio.RepositorioPessoa;
import ${package}.base.infra.persistencia.RepositorioGenericoHibernate;

public class RepositorioPessoaHibernate extends RepositorioGenericoHibernate<Pessoa, Long> implements RepositorioPessoa {
	
	public RepositorioPessoaHibernate(Session session) {
		super(session);
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
