package atv3.q1;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.nome = "Civic";
        carro.peso = 1300;
        carro.fabricante = "Honda";
        carro.cor = "Preto";
        carro.valor = 120000;

        System.out.println("ANTES:");
        System.out.println("Cor: " + carro.cor);
        System.out.println("Valor: " + carro.valor);

        carro.darDesconto(10000);
        carro.pintar("Vermelho");

        System.out.println("\nDEPOIS:");
        System.out.println("Cor: " + carro.cor);
        System.out.println("Valor: " + carro.valor);
    }
}
