/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamentocomissão;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class PagamentoComissão {

   
    public static void main(String[] args) {
        //Var
        
        double preco,quant,total,total2;
        
        //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        
        //Entrada
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Qual o preço unitário da peça?: ");
        preco=entrada.nextDouble();
        
        System.out.println("Qual sua quantidade vendida?: ");
        quant=entrada.nextDouble();
        
        //Processamento
        total=(quant*preco);
        total2=total*0.05;
        
        //Saída
        
         System.out.println("O valor da sua venda é:R$"+total);
         System.out.println("A comissão do vendedor é de:R$"+total2);
         
         
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------Obrigado por escolher ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");




    }  
    
}
