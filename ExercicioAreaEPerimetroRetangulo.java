
package exercicio.area.e.perimetro.retangulo;

import java.util.Scanner;


public class ExercicioAreaEPerimetroRetangulo {

    
    public static void main(String[] args) {
        //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        //Var
      double base,alt,area,per;  
      
      //Entrada
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Digite a base de seu retângulo: ");
      base=entrada.nextDouble();
      
      System.out.println("Digite a altura de seu retângulo: ");
      alt=entrada.nextDouble();
      
      //Processamento
      
       area = base*alt;
      per = base+base+alt+alt ;        
              
      //Saída
             
       System.out.println("A área de seu retângulo é: "+area);
       System.out.println("O perímetro de seu retângulo é: "+per);  
       
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------Obrigado por escolher ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
              
    }
    
}
