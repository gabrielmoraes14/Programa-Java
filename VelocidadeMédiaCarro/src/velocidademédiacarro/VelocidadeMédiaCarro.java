
package velocidademédiacarro;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class VelocidadeMédiaCarro {

    
    public static void main(String[] args) {
       //Var
       double hora,minuto,total,percurso,result;
       
       //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        
         //Entrada
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Qual percurso percorrido: ");
        percurso=entrada.nextDouble();
        
        System.out.println("Digite somente a hora: ");
        hora=entrada.nextDouble();
        
        System.out.println("Digite somente os minutos: ");
        minuto=entrada.nextDouble();
        
        //Processamento
        result=(minuto/60) + hora;
        total = percurso/result;
        
        //Saída
        System.out.println("A velocidade média percorrida pelo seu carro foi de:"+total+ "Km/h");
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------Obrigado por escolher ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");


        

    }
    
}
