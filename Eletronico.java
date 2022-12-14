package principalestoque2;

public class Eletronico extends Produto{
    String versao;
    int potencia;
    int frequencia;
    
    public Eletronico(String n, Funcionario f, String v, int p, int fr) {
        super(n,"Eletronico",f);
        this.versao = v;
        this.potencia = p;
        this.frequencia = fr;
    }
    
    @Override
    public String toString(){
        String saida = super.toString();
        saida += "Versao: " + this.versao + "\n"
              +  "Potencia" + this.potencia + "watts\n"
              +  "Frequencia: " + this.frequencia + "Hz\n";
        return saida;
    }
    
}
