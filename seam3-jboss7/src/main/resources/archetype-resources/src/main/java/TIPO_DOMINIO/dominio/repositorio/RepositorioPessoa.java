#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.TIPO_DOMINIO.dominio.repositorio;

import java.util.List;

import ${package}.TIPO_DOMINIO.dominio.modelo.Pessoa;

public interface RepositorioPessoa {
	public void adicionar(Pessoa pessoa);
	public List<Pessoa> listar();
}
