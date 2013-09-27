package it.pkg.NOME_APLICACAO.infra.persistencia.fabrica;

import org.hibernate.Session;

import it.pkg.NOME_APLICACAO.infra.persistencia.RepositorioPessoaHibernate;
import it.pkg.TIPO_DOMINIO.dominio.repositorio.RepositorioPessoa;
import it.pkg.base.infra.persistencia.fabrica.FabricaGenericaRepositoriosHibernate;
import it.pkg.base.infra.persistencia.fabrica.TipoFabricaHibernate;

public class FabricaRepositoriosHibernate extends FabricaGenericaRepositoriosHibernate{

	public FabricaRepositoriosHibernate(TipoFabricaHibernate tipo, Session session) {
		super(tipo, session);
	}

	public RepositorioPessoa construirRepositorioPessoa(){
		return new RepositorioPessoaHibernate(super.getSession());
	}
}
