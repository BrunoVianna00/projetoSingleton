
package Teste;

import Classes.Pessoa;


public class TestePessoa {
    public static void main(String[] args){
        
        Pessoa p = new Pessoa.PessoaBuilder()
                .nome("Valdumiro")
                .RG("54346546")
                .build();
        
        System.out.println(p);
        
    }
}
