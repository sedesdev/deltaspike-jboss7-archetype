#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.NOME_APLICACAO.webservice.rest.recurso;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class ConsultaProcessoWS {
	@GET
	@Path("/processos")
    public String pojo() {
        return "pojo ok @ " + new Date().toString();
    }
}

