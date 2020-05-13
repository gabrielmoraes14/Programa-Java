/*
 
 */
package cotaçãodólar;

import java.util.Scanner;


 
public class CotaçãoDólar {

   
    public static void main(String[] args) {
        //Var
        double dolar, valor, total;
        
         //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        
        //Entrada
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Qual o valor da cotação do dólar hoje?: ");
        dolar=entrada.nextDouble();
        
        System.out.println("Qual o valor que você quer converter?: ");
        valor=entrada.nextDouble(); 
        
        //Processamento
        total= valor/dolar;
        
         //Saída
        System.out.println("O seu valor em reais é igual à:$"+total);
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------Obrigado por escolher ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");




        
        

        

        

        
    }
    
}
