package it.pkg.NOME_APLICACAO.infra.persistencia;

import java.util.List;

import org.hibernate.Session;

import it.pkg.TIPO_DOMINIO.dominio.modelo.Pessoa;
import it.pkg.TIPO_DOMINIO.dominio.repositorio.RepositorioPessoa;
import it.pkg.base.infra.persistencia.RepositorioGenericoHibernate;

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
