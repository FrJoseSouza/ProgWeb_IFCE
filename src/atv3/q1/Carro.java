package atv3.q1;

class Carro {

    String nome;
    double peso;
    String fabricante;
    String cor;
    double valor;

    void darDesconto(double desconto) {
        valor -= desconto;
    }

    void pintar(String novaCor) {
        cor = novaCor;
    }
}
