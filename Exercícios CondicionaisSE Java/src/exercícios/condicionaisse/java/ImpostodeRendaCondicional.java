/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios.condicionaisse.java;

import javax.swing.JOptionPane;

/**
 *
 * @author PICHAU
 */
public class ImpostodeRendaCondicional {

    
    public static void main(String[] args) {
        //Var
        double salario, total;
        
        //Entrada
        salario= Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário:"));
        
        //Processamento
        if (salario<=1903.98){
        total = 0;
        }
        
        else if((salario>=1903.99) && (salario<=2826.65)){
        total = salario * 0.075;
        }
        
        else if ((salario>=2826.66) && (salario<=3751.05)){
        total = salario * 0.15;
        }
        
        else if ((salario>=3751.06) && (salario<=4664.68)){
        total = salario * 0.225;
        
        }else{   
        total = salario * 0.275;
        }
        
        JOptionPane.showMessageDialog(null, "Você irá pagar de imposto de renda: R$"+total);
        
    }
    
}
