#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.base.infra.persistencia;

import java.util.List;

import javax.persistence.EntityManager;

public class RepositorioGenericoJPA <T, PK> {
	
	private EntityManager entityManager;
	
	public RepositorioGenericoJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void adicionar(T objeto){
		entityManager.persist(objeto);
	}
	
	//TODO: Usar tipos parametrizados
	@SuppressWarnings("unchecked")
	public List<T> listar (){
		return entityManager.createQuery("from Pessoa p").getResultList();
	}
}
