/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preçogasolina;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class PreçoGasolina {

    
    public static void main(String[] args) {
        //Var
        double kilo, consome, preco,total,total2,total3;
        
        //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

         //Entrada
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Quantos kilômetros você irá percorrer?: ");
        kilo=entrada.nextDouble();
        
        System.out.println("Quanto seu carro consome de gasolina?: ");
        consome=entrada.nextDouble();
        
        System.out.println("Quanto está o preço médio da gasolina?: ");
        preco=entrada.nextDouble();
        
        //Processamento
        total=(kilo/consome);
        total2=(total*preco);
        total3=(total2*2);
        
        //Saída
         System.out.println("Você gastará em média: "+total2+" R$ para ida ou "+total3+" R$ para ida e volta!");
         
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------Obrigado por escolher ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");



    }
    
}
