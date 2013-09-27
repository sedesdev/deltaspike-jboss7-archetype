package it.pkg.base.infra.persistencia;

import java.util.List;

import org.hibernate.Session;

public class RepositorioGenericoHibernate <T, PK> {
	
	private Session session;
	
	public RepositorioGenericoHibernate(Session session) {
		this.session = session;
	}
	
	public void adicionar(T objeto){
		session.persist(objeto);
	}
	
	//TODO: Usar tipos parametrizados
	@SuppressWarnings("unchecked")
	public List<T> listar (){
		return session.createQuery("from Pessoa p").list();
	}

}
