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
public class ParImparCondicional {

    public static void main(String[] args) {
        //Var
        int numero;
        
        //Entrada
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite qualquer número"));
 
        //Processamento
        if ((numero % 2)==0){
            
            JOptionPane.showMessageDialog(null, "Seu número é par!");
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Seu número é ímpar!");
            
        }
    
    }
}
