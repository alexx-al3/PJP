
//pasta utilizada.
package Praticas;
//definição da classe
 class Pessoa {
    private String nome;
    private int idade;
   
//atribuição da classe
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    
    }
    // atribução de set 
    public void setNome(String nome) {  
        this.nome = nome;

    }
    public  String getNome() {
        return nome;
    }
    public void setInt(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    //metodo aplicado de exibição
    public void exibirDados() {
        System.out.print("nome: "+ nome + " - ");
        System.out.println("Idade: "+ idade);
        
    }


}
