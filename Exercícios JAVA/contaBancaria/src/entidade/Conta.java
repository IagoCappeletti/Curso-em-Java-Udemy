package entidade;

public class Conta {


    private int numero;
    private String nome;
    private double saldo;


    public Conta (int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Conta (int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        deposio(depositoInicial);
    }


    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposio(double quantidade) {
        saldo += quantidade;
    }
    public void sacar(double quantidade) {
        saldo -= quantidade + 5.0;
    }

    public String toString () {
        return "Numero: " + numero + ", Titular: " + nome + ", Saldo R$: " + String.format("%.2f",saldo );
    }

}
