package TryCatch_Class_Final_Class_Abstract06.Entidades;

public enum StatusGeral {
    PAGAMENTO_RECUSADO("Pagamento recusado"),
    HOSPEDAGEM_REGISTRADA("Hospedagem resgistrada"),
    COMFIRMACAO_ENVIADA_POR_EMAIL("Confirmação enviada por email"),
    RESERVA_CONFIRMADA("Reserva confirmada");
    private String descricao;
    StatusGeral(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}

