//Package Utilizada
package Praticas;

//definição da classe
public class ContaBancaria {
    private String titular;
    private double saldo;

    // atribuição da classe
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;

    }

    // atribuição do set
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirSaldo() {

        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }

    public void depositar(double valor) {

    }

    public void sacar() {

    }

}
