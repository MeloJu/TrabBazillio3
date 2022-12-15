package trabalhobazilio3;

import java.util.Scanner;

public class Produto implements Mercadoria {
    private String nome;
    private String tipo;
    private Funcionario funcionario;
    private boolean estocado;
    private boolean retirado;
    
    public Produto(){
        
    }
    
    public Produto(String n, String t, Funcionario f){
        this.nome = n;
        this.tipo = t;
        this.funcionario = f;
        this.estocado = false;
        this.retirado = false;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(){
        System.out.print("Nome do produto: ");
        Scanner l = new Scanner(System.in);
        String n = l.next();
        this.nome = n;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setTipo(){
        System.out.print("Nome do tipo: ");
        Scanner l = new Scanner(System.in);
        String t = l.next();
        this.nome = t;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public void setFuncionario(Funcionario f){
        this.funcionario = f;
    }
    
    public void setEstocado(boolean e){
        this.estocado = e;
    }
    
    public void setRetirado(boolean r){
        this.retirado = r;
    }
    
    public boolean EstaEstocado(){
        if(!this.estocado)
            return false;
        else
            return true;
    }
    
    @Override
    public String toString(){
        String saida = "Nome: " + this.nome + "\n"
             + "Tipo: " + this.tipo + "\n"
             + "Funcionario responsavel: ";
            saida += this.funcionario.getNome();
            saida += "    (id: ";
            saida += this.funcionario.getID();
            saida += " )\nSituacao: ";
            if(this.estocado){
                saida += "Estocado\n";
            }else{
                saida += "Retirado\n";
            }
            return saida;
    }
    
    @Override
    public void alterar(){
        Scanner l = new Scanner(System.in);
        String nomeAtual = "Nome atual: ";
        nomeAtual += this.getNome();
        System.out.println(nomeAtual);
        System.out.print("Digite o novo nome deste produto: ");
        String n = l.next();
        this.setNome(n);
    }
    
    @Override
    public String estocar(){
        if(!this.estocado){
            this.setEstocado(true);
            this.funcionario.estocaMercadoria();
            return "\nProduto estocado com sucesso.\n";
        }else{
            return "\nEsse produto ja esta estocado.\n";
        }
    }
    
    @Override
    public String retirar(){
        if((!this.retirado)&&(this.estocado)){
            this.setEstocado(false);
            this.setRetirado(true);
            this.funcionario.retiraMercadoria();
            return "\nProduto retirado com sucesso.\n";
        }else if(!this.estocado){
            return "\nEsse produto nao esta estocado.\n";
        }else{
            return "\nEsse produto ja foi retirado";
        }
    }
    
}
