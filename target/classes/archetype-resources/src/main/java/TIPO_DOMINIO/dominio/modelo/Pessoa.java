#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.TIPO_DOMINIO.dominio.modelo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;


public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
