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
public class CampeonatoVolêiCondicional {

   
    public static void main(String[] args) {
        //Var
        double altura;
        int idade;
        
        //Entrada
        altura= Double.parseDouble( JOptionPane.showInputDialog("Qual é a sua altura:"));
        
        idade= Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade:"));
        
        //Processamento
        if ((altura>=1.75) && (idade>=18)){

            JOptionPane.showMessageDialog(null, "Você poderá participar do campeonato de vôlei!");
            
        }else{
          
            JOptionPane.showMessageDialog(null, "Você não poderá participar do campeonato de vôlei!");
        }
       
       
    }
    
}
