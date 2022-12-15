package trabalhobazilio3;

import java.util.Scanner;

public class Mobilia extends Produto {
    private String material;
    private String cor;
    private float peso;
    
    public Mobilia(Funcionario f){
        this.setFuncionario(f);
    }
    
    public Mobilia(String n, Funcionario f ,String m, String c, float p){
        super(n,"Mobilia",f);
        this.material = m;
        this.cor = c;
        this.peso = p;
    }
    
    public void setMaterial(){
        Scanner l = new Scanner(System.in);
        System.out.print("Material do produto: ");
        String m = l.next();
        this.material = m;
    }
    
    public void setMaterial(String m){
        this.material = m;
    }
    
    public void setCor(){
        Scanner l = new Scanner(System.in);
        System.out.print("Cor do produto: ");
        String c = l.next();
        this.cor = c;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public void setPeso(){
        Scanner l = new Scanner(System.in);
        System.out.print("Peso do produto: ");
        float p = l.nextFloat();
        this.peso = p;
    }
    
    public void setPeso(float p){
        this.peso = p;
    }
    
    public void CriaMobilia(){
        System.out.print("\n..Criando Mobilia..\n");
        this.setNome();
        this.setTipo("Mobilia");
        this.setMaterial();
        this.setCor();
        this.setPeso();
        this.setEstocado(false);
        this.setRetirado(false);      
    }
    
    public void AlterarMobiliaMaterial(){
        Scanner l = new Scanner(System.in);
        String materialAtual = "Material atual: ";
        materialAtual += this.material;
        System.out.println(materialAtual);
        System.out.print("Digite o novo material deste produto: ");
        String m = l.next();
        this.setMaterial(m);
    }
    
    public void AlterarMobiliaCor(){
        Scanner l = new Scanner(System.in);
        String corAtual = "Cor atual: ";
        corAtual += this.cor;
        System.out.println(corAtual);
        System.out.print("Digite a nova cor deste produto: ");
        String c = l.next();
        this.setCor(c);
    }
    
    public void AlterarMobiliaPeso(){
        Scanner l = new Scanner(System.in);
        String pesoAtual = "Peso atual: ";
        pesoAtual += this.peso;
        System.out.println(pesoAtual);
        System.out.print("Digite o novo peso deste produto: ");
        float p = l.nextFloat();
        this.setPeso(p);
    }
    
    @Override
    public void alterar(){
        super.alterar();
        this.AlterarMobiliaMaterial();
        this.AlterarMobiliaCor();
        this.AlterarMobiliaPeso();
    }
    
    @Override
    public String toString(){
        String saida = super.toString();
        saida += "Material: " + this.material + "\n"
               + "Peso: " + this.peso + " kg\n"
               + "Cor: " + this.cor + "\n";
        return saida;
    }
}
