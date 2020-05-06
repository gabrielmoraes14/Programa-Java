/*
 
 */
package exerciciopreçodevendadoproduto;

import java.util.Scanner;


public class ExercicioPreçodevendadoproduto {

    
    public static void main(String[] args) {
        //Var
        double preco,resp,porcent;
        String nome;
        
        //Central de Dados ETEC
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------Central de Dados ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        
        //Entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome do seu produto: ");
        nome=entrada.next(); 
        
         System.out.println("Digite o preço do seu produto: ");
        preco=entrada.nextDouble();
        
        //Processamento
        porcent=preco*0.65;
        resp=preco+porcent;
        
        //Saída
        System.out.println("Seu preço de venda adicionado com 65% é de:R$"+resp);
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------Obrigado por escolher ETEC--------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        
    }
    
}
