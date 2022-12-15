package trabalhobazilio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class PrincipalEstoque {
    
    static List <Produto> estoque = new ArrayList();
    static Scanner l = new Scanner(System.in);
    
    public static int Menu(){
        System.out.print("\n[1] Adicionar produto ao estoque\n[2] Retirar produto do estoque\n[3] Alterar produto no estoque\n[4] Remover produto do estoque\n[5] Imprimir estoque\n[6] Sair\nDigite: ");
        return l.nextInt();
    }
    
    public static int Menu2(){
        System.out.print("\n\n..Produto..\n[1] Eletronico\n[2] Mobilia\n[3] Voltar\n\nDigite: ");
        return l.nextInt();
    }
    
    public static String ImprimeEstoque(){
        String saida = "..Lista de produtos..\n";
        for(int i = 0; i < estoque.size(); i++){
            saida += ( "\n..Produto [ " + i + " ]..\n" ); 
            saida += estoque.get(i).toString();
        }
        return saida;
    }
    
    public static void main(String[] args) throws IOException {
        
        String nomeF;
        int IdF, resp, ctr;
        System.out.print("Digite o nome do funcionario: ");
        nomeF = l.next();
        System.out.print("Digite o ID do funcionario: ");
        IdF = l.nextInt();
        Funcionario f = new Funcionario(nomeF,IdF,0,0);
        ctr = 1;
        while(ctr == 1){
            switch(Menu()){
                
                case 1:
                    System.out.println("\nFuncionario: " + f.getNome() + "\n\n" );
                    switch(Menu2()){
                        case 1:
                            Eletronico e = new Eletronico(f);
                            e.CriaEletronico();
                            System.out.println(e.estocar());
                            estoque.add(e);
                            break;
                        case 2:
                            Mobilia m = new Mobilia(f);
                            m.CriaMobilia();
                            System.out.println(m.estocar());
                            estoque.add(m);
                            break;
                        }
                    System.in.read();
                    break;
                    
                case 2:
                    System.out.println(ImprimeEstoque());
                    System.out.print("Escolha o indice do produto a ser retirado: ");
                    resp = l.nextInt();
                    System.out.println(estoque.get(resp).retirar());
                    System.in.read();
                    break;
                 
                case 3:
                    System.out.println(ImprimeEstoque());
                    System.out.print("Escolha o indice do produto a ser alterado: ");
                    resp = l.nextInt();
                    estoque.get(resp).alterar();
                    System.in.read();
                    break;
                
                case 4:
                    System.out.println(ImprimeEstoque());
                    System.out.print("Escolha o indice do produto a ser removido do estoque: ");
                    resp = l.nextInt();
                    if(estoque.get(resp).EstaEstocado()){
                        f.mercadorias_estocadas -= 1;
                    }else{
                        f.mercadorias_retiradas -= 1;
                    }
                    estoque.remove(resp);
                    System.in.read();
                    break;
                    
                case 5:
                    System.out.println(f.toString());
                    System.out.println(ImprimeEstoque());
                    System.in.read();
                    break;
                    
                case 6:
                    ctr = 0;
                    estoque.clear();
                    break;
            }
        } 
    }
}
