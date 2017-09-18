    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Classes.AviaoSingleton;

/**
 *
 * @author bruno
 */
public class AviaoSingletonTeste {
    public static void main(String[] args) {
          agendarAssento("1A");
          agendarAssento("1A");
          agendarAssento("1B");
          agendarAssento("1B");
    }
    private static void agendarAssento(String assento){
        AviaoSingleton a = AviaoSingleton.getINSTANCE();
        System.out.println("O Assento " + assento + " esta ocupado: " + a.marcarAssento(assento));
    }
}
