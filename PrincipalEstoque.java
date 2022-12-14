package principalestoque2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;


public class PrincipalEstoque {
    
    public static int Menu(){
        System.out.println("\n[1] Estoque\n[2] Empresa\n[3] Sair\n\nDigite: ");
        Scanner l = new Scanner(System.in);
        return l.nextInt();
    }
    
    public static void main(String[] args) throws IOException {
        List <Mercadoria> estoque = new ArrayList();
        List <Funcionario> empresa = new ArrayList();
        
        int ctr = 1;
        int resp;
        while(ctr == 1){
            resp = Menu();
            switch(resp){
                case 1:
                    System.out.println("num1");
                    System.in.read();
                    break;
                
                case 2:
                    System.out.println("num2");
                    
                    System.in.read();
                    break;
                 
                case 3:
                    ctr = 0;
                    break;
                
            }
        }
    }
    
}
