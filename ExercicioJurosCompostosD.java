/*
 
 */
package exercicio.juros.compostos.d;

import java.util.Scanner;


 
public class ExercicioJurosCompostosD {

    
    public static void main(String[] args) {
        //Var
        int meses;
        double emprest, taxa, resp;
        
        //Central de Dados ETEC
         System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        
        //Entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor de quanto você quer emprestado:");
        emprest=entrada.nextDouble();
        
        System.out.println("Digite em quantos meses você vai pagar:");
        meses=entrada.nextInt();
        
        taxa=0.02;
        
        //Processamento
        
        resp=emprest*(Math.pow((1+taxa),meses));
        
        //Saída
        
        System.out.println("Após a aplicação do juros ao mês de 2% você irá pagar: R$"+resp);
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------Obrigado por escolher ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

               
    }
    
}
