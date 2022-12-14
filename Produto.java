package principalestoque2;

public class Produto implements Mercadoria {
    String nome;
    String tipo;
    Funcionario funcionario;
    boolean estocado;
    boolean retirado;
    
    public Produto(String n, String t, Funcionario f){
        this.nome = n;
        this.tipo = t;
        this.funcionario = f;
        this.estocado = false;
        this.retirado = false;
    }
    
    @Override
    public String toString(){
        return "\n..Produto..\n"
             + "Nome: " + this.nome + "\n"
             + "Tipo: " + this.tipo + "\n"
             + "Funcionario responsavel: " + this.funcionario.nome
             + "    (id: " + this.funcionario.id + " )\n" 
             + "Situacao: " + (!this.estocado ? "Retirado" : "Estocado") + "\n";
    }
    
    @Override
    public String estocar(){
        if(!this.estocado){
            this.estocado = true;
            this.funcionario.estocaMercadoria();
            return "\nProduto estocado com sucesso.\n";
        }else{
            return "\nEsse produto ja esta estocado.\n";
        }
    }
    
    @Override
    public String retirar(){
        if((!this.retirado)&&(this.estocado)){
            this.retirado = true;
            this.funcionario.retiraMercadoria();
            return "\nProduto retirado com sucesso.\n";
        }else if(!this.estocado){
            return "\nEsse produto nao esta estocado.\n";
        }else{
            return "\nEsse produto ja foi retirado";
        }
    }
    
}
