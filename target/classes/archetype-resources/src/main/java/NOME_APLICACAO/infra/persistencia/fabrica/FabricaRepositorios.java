#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.NOME_APLICACAO.infra.persistencia.fabrica;

import javax.persistence.EntityManager;

import ${package}.NOME_APLICACAO.infra.persistencia.RepositorioPessoaJPA;
import ${package}.TIPO_DOMINIO.dominio.repositorio.RepositorioPessoa;
import ${package}.base.infra.persistencia.fabrica.FabricaGenericaRepositoriosJPA;

public class FabricaRepositorios extends FabricaGenericaRepositoriosJPA{

	public FabricaRepositorios(EntityManager entityManager) {
		super(entityManager);
	}

	public RepositorioPessoa construirRepositorioPessoa(){
		return new RepositorioPessoaJPA(super.getEntityManager());
	}
}
