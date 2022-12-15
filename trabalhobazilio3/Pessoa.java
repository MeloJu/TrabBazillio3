package trabalhobazilio3;

public abstract class Pessoa {
    private String nome;
    private int id;
    
    public Pessoa(String n, int i){
        this.nome = n;
        this.id = i;
    }
    
    public void AlteraNome(String n){
        this.nome = n;
    }
    
    public void AlteraID(int i){
        this.id = i;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getID(){
        return this.id;
    }
    
}
