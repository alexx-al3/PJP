package Exercicios.Exc2.app;
import Exercicios.Exc2.model.Produto;
public class Ex2 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.00);
        Produto produto2 = new Produto("Smartphone", 1500.00);

        System.out.println("Produto 1: " + produto1.nome + ", Preço: " + produto1.preco);
        System.out.println("Produto 2: " + produto2.nome + ", Preço: " + produto2.preco);
    }
}