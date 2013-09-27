#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.base.infra.persistencia.fabrica;

import org.hibernate.Session;

public class FabricaGenericaRepositoriosHibernate implements FabricaRepositorios {
	private Session session;
	private TipoFabricaHibernate tipo;
	
	public FabricaGenericaRepositoriosHibernate(TipoFabricaHibernate tipo, Session session) {
		this.session = session;
	    this.tipo = tipo;
	}
		
	public Session getSession(){
		if (tipo == TipoFabricaHibernate.SEAM2){
			return (Session) new Object();
		}else {
			return session;			
		}
	}
}