package Bean;

public class Contas {

    double valor_parcelas;

    public double Calcula_parcelas(int parcelas, double valor) {
        this.valor_parcelas = (valor / parcelas);
        return valor_parcelas;
    }
}

    


