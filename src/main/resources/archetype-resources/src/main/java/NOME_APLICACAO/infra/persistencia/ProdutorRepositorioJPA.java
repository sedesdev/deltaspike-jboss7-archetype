#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.NOME_APLICACAO.infra.persistencia;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Classe produtora de SessionFactory Hibernate.
 * A partir de entao pode-se delegar ao Seam o controle transacional
 * @author user
 *
 */
public class ProdutorRepositorioJPA {

	@PersistenceContext(unitName="primary")
	private EntityManager entityManager;

    
	@RequestScoped  
    @Produces  
    @EsquemaCAD
    protected EntityManager createEntityManager() { 
	    return this.entityManager;
	}
}