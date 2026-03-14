package atv3.q2;

public class Main {

    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito();

        cartao.nomeCliente = "João";
        cartao.limite = 2000;

        cartao.realizaCompra(500);
        cartao.realizaCompra(1800);

        cartao.imprimeFatura();
    }
}