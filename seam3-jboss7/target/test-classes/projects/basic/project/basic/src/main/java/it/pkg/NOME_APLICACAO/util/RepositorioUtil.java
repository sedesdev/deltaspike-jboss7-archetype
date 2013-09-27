package it.pkg.NOME_APLICACAO.util;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Session;

import it.pkg.NOME_APLICACAO.infra.persistencia.EsquemaCAD;
import it.pkg.NOME_APLICACAO.infra.persistencia.fabrica.FabricaRepositoriosHibernate;
import it.pkg.base.infra.persistencia.fabrica.TipoFabricaHibernate;

@Named
public class RepositorioUtil implements Serializable {

	private static final long serialVersionUID = -3688012233645703429L;
	@Inject @EsquemaCAD Session session;
	//@In Session session; // Caso fosse usado Seam2
	
	public FabricaRepositoriosHibernate construirFabricaRepositorios(){
		return new FabricaRepositoriosHibernate(TipoFabricaHibernate.PADRAO, session);
		//return new FabricaRepositoriosHibernate(TipoFabricaHibernate.SEAM2, session);
	}
	
	/**
	 * Recupera a session injetada
	 * @return
	 */
	public Session getSession(){
		return session;
	}	
}
