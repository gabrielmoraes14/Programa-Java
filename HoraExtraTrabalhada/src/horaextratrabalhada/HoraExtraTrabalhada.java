/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horaextratrabalhada;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class HoraExtraTrabalhada {

    
    public static void main(String[] args) {
        //Var
        double minutos,hora,reais,tempo,ganho,result,total;
        
        //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        
        //Entrada
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Digite somente as horas que você trabalhou neste mês: ");
        hora=entrada.nextDouble();
        
        System.out.println("Digite somente os minutos que você trabalhou neste mês: ");
        minutos=entrada.nextDouble();
        
        System.out.println("Quanto você ganha por hora?: ");
        reais=entrada.nextDouble();
        
        //Processamento
        tempo=(minutos/60)+ hora;
        ganho=(tempo*reais);
        result=(ganho*0.7);
        total=(ganho+result);
        
        //Saída
        System.out.println("Você ganhou com os 70%: "+ total+ "R$ a mais pela suas horas trabalhadas");
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------Obrigado por escolher ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");



 
    }
    
}
