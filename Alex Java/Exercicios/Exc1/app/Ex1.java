package Exercicios.Exc1.app;
import Exercicios.Exc1.model.Pessoa;

public class Ex1 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);

    System.out.println("Pessoa 1: " + pessoa1.nome + ", Idade: " + pessoa1.idade);
    System.out.println("Pessoa 2: " + pessoa2.nome + ", Idade: " + pessoa2.idade);

    }
}
