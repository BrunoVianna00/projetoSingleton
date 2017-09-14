
package Teste;

import Classes.Aviao;


public class TesteAviao {
    public static void main(String[] args){
        agendarAssento("1A");
        agendarAssento("1A");
        agendarAssento("1B");
        agendarAssento("1B");
    }
    private static void agendarAssento(String assento){
        Aviao a = new Aviao();
        System.out.println("O Assento esta ocupado: " + a.bookAssento(assento));
    }
}
