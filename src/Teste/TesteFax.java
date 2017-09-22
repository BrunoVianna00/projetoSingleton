package Teste;

import Classes.FaxDaEmpresa;

public class TesteFax {
    
    public static void main(String[] args){
        enviarMensagem("Mensagem1");
        enviarMensagem("Mensagem1");
    }
    
    private static void enviarMensagem(String mensagem){
        FaxDaEmpresa fax = FaxDaEmpresa.getInstace();
        System.out.println("Enviando Mensagem, aguarde..." + fax.envioDeMSG(mensagem));
    }
    
}
