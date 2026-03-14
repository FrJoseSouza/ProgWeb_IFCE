package atv3.q4;

public class Main {

    public static void main(String[] args) {

        Jogador jogador = new Jogador();

        jogador.setNome("Neymar");
        jogador.setPosicao("atacante");
        jogador.setAnoNascimento(1992);
        jogador.setNacionalidade("Brasileiro");
        jogador.setAltura(1.75);
        jogador.setPeso(68);

        jogador.imprimirDados();
    }
}
