package ExerciciosPooJava;

public class Elevador {

    private int totalAndares;
    private int andarAtual;
    private int qtdPessoas;
    private int capacidadeMaxima;

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void incializa(int capacidadeMaxima, int totalAndares) {
        this.andarAtual = 0; //TERREO
        this.qtdPessoas = 0;
        this.capacidadeMaxima = capacidadeMaxima;
        this.totalAndares = totalAndares;
    }

    public int entra(int qtdPessoaEntra) {
        if (this.qtdPessoas != this.capacidadeMaxima) {
            this.qtdPessoas = qtdPessoaEntra + this.qtdPessoas;
        }
        return this.qtdPessoas;
    }

    public int sai(int saiPessoa) {
        if (this.qtdPessoas > 0) {
            this.qtdPessoas -= saiPessoa;
        }
        return this.qtdPessoas;
    }

    public int sobe(int proxAndarSubindo) {
        if (proxAndarSubindo > this.totalAndares) {
            this.andarAtual = this.totalAndares;
        } else {
            this.andarAtual++;
        }
        return this.andarAtual;
    }

    public int desce(int proxAndarDescendo) {

        if (proxAndarDescendo < 0) {
            this.andarAtual = 0; // TERREO
        } else {
            this.andarAtual--;
        }
        return this.andarAtual;
    }

}
