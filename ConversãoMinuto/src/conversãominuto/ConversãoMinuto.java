/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversãominuto;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class ConversãoMinuto {

    
     
    public static void main(String[] args) {
         //Var
        double minuto, hora, total;
        
         //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        
        //Entrada
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Digite somente a hora: ");
        hora=entrada.nextDouble();
        
        System.out.println("Digite somente os minutos: ");
        minuto=entrada.nextDouble();
        
        //Processamento
        total = (minuto/60)+ hora;
        
        //Saída
        
        System.out.println("Seus minutos foram convertidos em:"+total+"décimos");
        


        

        
    }
    
}
