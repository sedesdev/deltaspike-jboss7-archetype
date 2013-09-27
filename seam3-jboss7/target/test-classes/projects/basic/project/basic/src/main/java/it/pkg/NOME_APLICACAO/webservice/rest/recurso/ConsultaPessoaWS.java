package it.pkg.NOME_APLICACAO.webservice.rest.recurso;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import it.pkg.NOME_APLICACAO.aplicacao.facade.NOME_APLICACAOFacade;
import it.pkg.NOME_APLICACAO.webservice.rest.info.PessoasInfo;
import it.pkg.TIPO_DOMINIO.dominio.modelo.Pessoa;

@Path("")
public class ConsultaPessoaWS {


	@Inject NOME_APLICACAOFacade testeSeam3Facade;
	
	@GET
	@Path("/pessoas")
	@Produces("application/json")
    public Response pojo() {
		List<PessoasInfo> p = new ArrayList<PessoasInfo>();
		List<Pessoa> pessoas = testeSeam3Facade.listar();
		
		
		for (Pessoa pessoa : pessoas) {
			PessoasInfo pi = new PessoasInfo();
			pi.setNome(pessoa.getName());
			p.add(pi);
		}
		
        return Response.ok(p).status(200).build();
    }

}

