package it.pkg.TIPO_DOMINIO.dominio.enumeracao;

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
