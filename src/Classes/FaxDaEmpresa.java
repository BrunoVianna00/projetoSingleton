
package Classes;

import java.util.ArrayList;



public class FaxDaEmpresa {
    
    private static FaxDaEmpresa instancia;
    
    ArrayList<String> listaDeMensagem = new ArrayList<String>();

    
    private FaxDaEmpresa() {
     listaDeMensagem.add("Mensagem1");
     listaDeMensagem.add("Mensagem2");
     
        
        
        
    }
    
    public static FaxDaEmpresa getInstace(){
        if(instancia == null){
            synchronized (FaxDaEmpresa.class){
                if (instancia == null){
                    instancia = new FaxDaEmpresa();
                }    
            }
        }
        return instancia;
        
    }
    public boolean envioDeMSG(String mensagem){
         return listaDeMensagem.remove(mensagem);
     }
    
    
}
