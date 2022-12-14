package principalestoque2;

public class Mobilia extends Produto {
    String material;
    String cor;
    float peso;
    boolean envernisado;
    
    public Mobilia(String n, Funcionario f ,String m, String c, float p, boolean e){
        super(n,"Mobilia",f);
        this.material = m;
        this.cor = c;
        this.peso = p;
        this.envernisado = e;
    }
    
    @Override
    public String toString(){
        String saida = super.toString();
        saida += "Material: " + this.material + "\n"
               + "Peso: " + this.peso + " kg\n"
               + "Cor: " + this.cor + "\n"
               + "Enversinado: " + (this.envernisado ? "sim" : "nao") + "\n";
        return saida;
    }

}
