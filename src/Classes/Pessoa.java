
package Classes;


public class Pessoa {
    private String nome;
    private String RG;
    
    
    private Pessoa(String nome, String RG) {
        this.nome = nome;
        this.RG = RG;
    }
    public Pessoa(){
        
    }

    public static class PessoaBuilder{
        private String nome;
        private String RG;
        
        public PessoaBuilder (){
        
        }
        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
         public PessoaBuilder RG(String RG){
            this.RG = RG;
            return this;
        }
         public Pessoa build (){
             return new Pessoa(nome, RG);
         }
    }
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getRG() {
        return RG;
    }

    
    public void setRG(String RG) {
        this.RG = RG;
    }
    
    
}
