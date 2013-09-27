package it.pkg.TIPO_DOMINIO.dominio.repositorio;

import java.util.List;

import it.pkg.TIPO_DOMINIO.dominio.modelo.Pessoa;

public interface RepositorioPessoa {
	public void adicionar(Pessoa pessoa);
	public List<Pessoa> listar();
}
