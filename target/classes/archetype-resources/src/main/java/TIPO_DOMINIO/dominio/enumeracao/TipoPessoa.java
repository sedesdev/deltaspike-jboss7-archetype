#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.TIPO_DOMINIO.dominio.enumeracao;

/**
 * Tipo da pessoa
 * @author Rodrigo
 *
 */
public enum TipoPessoa  {

    FISICA("Física"), 
    JURIDICA("Jurídica");

    private String displayName;

    private TipoPessoa(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
