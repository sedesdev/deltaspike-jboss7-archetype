package it.pkg.NOME_APLICACAO.infra.persistencia;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * Qualificador para especificar uma fonte de dados.
 * Deve ser usado quando houver muitas fontes de dados, por exemplo
 * trabalhando com mais de um esquema
 * @author Rodrigo Mesquita
 *
 */
@Qualifier
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME) 
public @interface EsquemaCAD {} 