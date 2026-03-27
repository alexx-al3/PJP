package Praticas;



public class Prat {
public static void main (String []args){
// Instanciando objeto com construtor
        
        Pessoa p1 = new Pessoa("João", 25);
    

        // Exibindo dados
        p1.exibirDados();

        // Alterando valores com set
        p1.setNome("Maria");
        p1.setInt(30);

        // Exibindo novamente
        p1.exibirDados();
    
}
}