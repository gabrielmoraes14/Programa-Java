/*
 
 */
package exercicioareadoquadrado;

import java.util.Scanner;


 
public class ExercicioAreadoQuadrado {

    
    public static void main(String[] args) {
        //Var
        double lado,total;
        
         //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        

        
        //Entrada
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Digite o valor do lado de seu quadrado: ");
        lado=entrada.nextDouble(); 
        
        //Processamento
        total=lado*lado;
        
        //Saída
        System.out.println("A área de seu quadrado é: "+total);
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------Obrigado por escolher ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

       

    }
    
}
