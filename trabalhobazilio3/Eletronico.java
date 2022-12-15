package trabalhobazilio3;

import java.util.Scanner;

public class Eletronico extends Produto{
    private String versao;
    private int potencia;
    private int frequencia;
    
    public Eletronico(Funcionario f){
        this.setFuncionario(f);
    }
    
    public Eletronico(String n, Funcionario f, String v, int p, int fr) {
        super(n,"Eletronico",f);
        this.versao = v;
        this.potencia = p;
        this.frequencia = fr;
    }
    
    public void setVersao(){
        Scanner l = new Scanner(System.in);
        System.out.print("Versao do produto: ");
        String v = l.next();
        this.versao = v;
    }
    
    public void setVersao(String v){
        this.versao = v;
    }
    
    public void setPotencia(){
        Scanner l = new Scanner(System.in);
        System.out.print("Potencia do produto: ");
        int p = l.nextInt();
        this.potencia = p;
    }
    
    public void setPotencia(int p){
        this.potencia = p;
    }
    
    public void setFrequencia(){
        Scanner l = new Scanner(System.in);
        System.out.print("Frequencia do produto: ");
        int fr = l.nextInt();
        this.frequencia = fr;
    }
    
    public void setFrequencia(int fr){
        this.frequencia = fr;
    }
    
    public void CriaEletronico(){
        this.setNome();
        this.setTipo("Eletronico");
        this.setVersao();
        this.setPotencia();
        this.setFrequencia();
        this.setEstocado(false);
        this.setRetirado(false);
    }
    
    public void AlterarEletronicoVersao(){
        Scanner l = new Scanner(System.in);
        String versaoAtual = "Versao atual: ";
        versaoAtual += this.versao;
        System.out.println(versaoAtual);
        System.out.print("Digite a nova versao deste produto: ");
        String v = l.next();
        this.setVersao(v);
    }
    
    public void AlterarEletronicoPotencia(){
        Scanner l = new Scanner(System.in);
        String potAtual = "Potencia atual: ";
        potAtual += this.potencia;
        System.out.println(potAtual);
        System.out.print("Digite a nova potencia deste produto: ");
        int p = l.nextInt();
        this.setPotencia(p);
    }
    
    public void AlterarEletronicoFrequencia(){
        Scanner l = new Scanner(System.in);
        String freqAtual = "Frequencia atual: ";
        freqAtual += this.frequencia;
        System.out.println(freqAtual);
        System.out.print("Digite a nova frequencia deste produto: ");
        int fr = l.nextInt();
        this.setFrequencia(fr);
    }
    
    @Override
    public void alterar(){
        super.alterar();
        this.AlterarEletronicoVersao();
        this.AlterarEletronicoFrequencia();
        this.AlterarEletronicoPotencia();
    }
    
    @Override
    public String toString(){
        String saida = super.toString();
        saida += "Versao: " + this.versao + "\n"
              +  "Potencia: " + this.potencia + "watts\n"
              +  "Frequencia: " + this.frequencia + "Hz\n";
        return saida;
    }
    
}
