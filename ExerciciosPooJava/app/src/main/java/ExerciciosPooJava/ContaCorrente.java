package ExerciciosPooJava;

/*Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.*/
public class ContaCorrente {

    String numeroConta;
    String nomeCorrentista;
    float saldo;

    public void ContaCorrente(String numeroConta, String nomeCorrentista) {
        this.setNumeroConta(numeroConta);
        this.alterarNome(nomeCorrentista);
        this.saldo = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void alterarNome(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void deposito(float deposito) {
        this.saldo = deposito + getSaldo();
    }

    public void saque(float saque) {
        this.saldo = saque + getSaldo();
    }

}
