package atv3.q4;

import java.time.Year;

class Jogador {

    private String nome;
    private String posicao;
    private int anoNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setAnoNascimento(int ano) {
        this.anoNascimento = ano;
    }

    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public void setPeso(double p) {
        this.peso = p;
    }

    public int calcularIdade() {
        int anoAtual = Year.now().getValue();
        return anoAtual - anoNascimento;
    }

    public int tempoAposentadoria() {

        int idade = calcularIdade();

        if (posicao.equalsIgnoreCase("defesa")) {
            return 40 - idade;
        }

        if (posicao.equalsIgnoreCase("meio-campo")) {
            return 38 - idade;
        }

        return 35 - idade;
    }

    public void imprimirDados() {

        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Nascimento: " + anoNascimento);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);

        System.out.println("Idade: " + calcularIdade());
        System.out.println("Falta para aposentar: " + tempoAposentadoria() + " anos");
    }
}
