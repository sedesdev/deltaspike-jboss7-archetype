#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.base.infra.persistencia.fabrica;

import javax.persistence.EntityManager;

public class FabricaGenericaRepositoriosJPA implements FabricaRepositorios {
	private EntityManager entityManager;
	
	public FabricaGenericaRepositoriosJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
		
	public EntityManager getEntityManager(){
		return this.entityManager;			
	}
}