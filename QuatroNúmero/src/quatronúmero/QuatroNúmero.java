/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quatronúmero;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class QuatroNúmero {

    
    public static void main(String[] args) {
        //Var
        double n1,n2,n3,n4,total,quad;
        
        //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        
         //Entrada
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Digite o primeiro número: ");
        n1=entrada.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        n2=entrada.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        n3=entrada.nextDouble();
        
        System.out.println("Digite o quarto número: ");
        n4=entrada.nextDouble();
        quad=2;
        
        //Processamento
         total=Math.pow(n1,quad)+(Math.pow(n2,quad))+(Math.pow(n3,quad))+(Math.pow(n4,quad));
         
        //Saída
        
        System.out.println("A soma do quadrado dos seus quatro números é:"+total);
         

    }   
    
}
