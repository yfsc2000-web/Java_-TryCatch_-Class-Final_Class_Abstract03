package TryCatch_Class_Final_Class_Abstract06.Entidades;
import TryCatch_Class_Final_Class_Abstract06.Entidades.StatusQuarto;

public final class Quartos {
    private int numero;
    private StatusQuarto statusquatos;



    public Quartos(int numero, StatusQuarto statusquatos) {
        this.numero = numero;
        this.statusquatos=statusquatos;
    }

    public StatusQuarto getStatusquatos() {
        return statusquatos;
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Quartos" +
                "numero=" + numero +
                ", statusquatos=" + statusquatos;
    }
}


