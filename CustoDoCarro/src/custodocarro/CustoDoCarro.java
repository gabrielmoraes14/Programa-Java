/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custodocarro;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class CustoDoCarro {

   
    public static void main(String[] args) {
      //Var
      double custcar,total1,total2;
      
       //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        
      //Entrada
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Qual o valor do custo de fábrica de seu carro?: ");
        custcar=entrada.nextDouble();
        
      //Processamento
      
      total1=(custcar*1.45);
      total2=(total1*1.28);
      
      //Saída
      System.out.println("O valor total do seu carro com os impostos e a distribuição é de:R$"+total2);
      
      System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------Obrigado por escolher ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");



    }
    
}
