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
public class AumentoSalárioCondicional {

    
    public static void main(String[] args) {
        //Var
        double salario,total;
        
        //Entrada
        salario= Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário:"));
        
        //Processamento
        if (salario<=1500){
            total= salario * 1.2;
        }
        
        else if ((salario>1500) && (salario<=3000)){
            total= salario * 1.15;
        }
        
        else{
            total= salario * 1.1;
        }
        
        JOptionPane.showMessageDialog(null, "De acordo com seu salário, seu aumento irá para: R$"+total);
        
        
        
  
       
    }
    
}
