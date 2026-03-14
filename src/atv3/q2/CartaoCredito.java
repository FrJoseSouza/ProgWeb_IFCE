package atv3.q2;

class CartaoCredito {

    double limite;
    double saldoFatura;
    String nomeCliente;

    void aumentaLimite(double valor) {
        limite += valor;
    }

    void diminuiLimite(double valor) {
        limite -= valor;
    }

    void realizaCompra(double valor) {

        if (saldoFatura + valor <= limite) {
            saldoFatura += valor;
            System.out.println("Compra realizada.");
        } else {
            System.out.println("Limite atingido!");
        }
    }

    void imprimeFatura() {
        System.out.println("Valor da fatura: " + saldoFatura);
    }
}