package atv3.q3;

class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoas = 0;
    }

    public void entra() {
        if (pessoas < capacidade) {
            pessoas++;
        } else {
            System.out.println("Elevador cheio");
        }
    }

    public void sai() {
        if (pessoas > 0) {
            pessoas--;
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getPessoas() {
        return pessoas;
    }
}
