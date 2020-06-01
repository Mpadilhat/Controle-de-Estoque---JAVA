
package Bean;

public class Cadastro {
    
    private String nome, endereco, email, telefone;
    
    // Colocar com set e mostrar com get
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
     public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
     public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
       public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String fone){
        this.telefone = fone;
    }
    
}
