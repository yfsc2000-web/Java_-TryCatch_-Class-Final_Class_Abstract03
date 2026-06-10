package TryCatch_Class_Final_Class_Abstract06.Entidades;

public enum StatusQuarto {
    DISPONiVEL(" disponivel"),
    OCUPADO( "ocupado");
    private String descricao;

    StatusQuarto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

