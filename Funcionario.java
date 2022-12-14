package principalestoque2;

public class Funcionario extends Pessoa{
    int mercadorias_estocadas;
    int mercadorias_retiradas;
    
    public Funcionario(String n, int i){
        this(n,i,0,0);
    }
    
    public Funcionario(String n, int i, int me, int mr){
        super(n,i);
        this.mercadorias_estocadas = me;
        this.mercadorias_retiradas = mr;
    }
    
    public void estocaMercadoria(){
        this.mercadorias_estocadas += 1;
    }
    
    public void retiraMercadoria(){
        this.mercadorias_estocadas -= 1;
        this.mercadorias_estocadas += 1;
    }
    
    @Override
    public String toString(){
        return "\n....Funcionario...\n"
             + "Nome: " + this.nome + "\n"
             + "Id: " + this.id + "\n"
             + "..Mercadorias..\n"
             + "Estocadas: " + this.mercadorias_estocadas + "\n"
             + "Retiradas: " + this.mercadorias_retiradas +"\n";
    }
}
