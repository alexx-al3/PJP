package Treino.app;

import java.util.ArrayList;
import java.util.Scanner;

import Treino.model.Pessoa;

public class Teste1{
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Pessoa> pessoas = new ArrayList<>();

        String continuar;

        do {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            // cria objeto com construtor
            Pessoa p = new Pessoa (nome, idade, salario);

            // adiciona na lista
            pessoas.add(p);

            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar dados cadastrados
        System.out.println("\nPessoas cadastradas:");
        for (Pessoa p : pessoas) {
            System.out.println("Nome: " + p.nome + 
                               ", Idade: " + p.idade + 
                               ", Salário: " + p.salario);
        }

        sc.close();
    }
}