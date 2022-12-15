package trabalhobazilio3;

import java.util.Scanner;

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
    
    public void criaFuncionario(){
        Scanner l = new Scanner(System.in);
        System.out.print("\nCriando Funcionario\n\nNome: ");
        String n = l.next();
        this.AlteraNome(n);
        System.out.print("Id: ");
        int i = l.nextInt();
        this.AlteraID(i);
        this.mercadorias_estocadas = 0;
        this.mercadorias_retiradas = 0;
    }
    
    public void estocaMercadoria(){
        this.mercadorias_estocadas += 1;
    }
    
    public void retiraMercadoria(){
        this.mercadorias_estocadas -= 1;
        this.mercadorias_retiradas += 1;
    }
    
    @Override
    public String toString(){
        String saida = "\n....Funcionario...\nNome: ";
            saida += this.getNome();
            saida += "\nId: ";
            saida += this.getID();
            saida += "\n..Mercadorias..\n"
             + "Estocadas: " + this.mercadorias_estocadas + "\n"
             + "Retiradas: " + this.mercadorias_retiradas +"\n";
            return saida;
    }
}
