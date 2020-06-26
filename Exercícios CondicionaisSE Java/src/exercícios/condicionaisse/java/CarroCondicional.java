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
public class CarroCondicional {

 
    public static void main(String[] args) {
        //Var
        int idade;
        string habilitado;
        
        //Entrada
        idade= Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade:"));
        
        //Processamento
        if (idade>=18){
        JOptionPane.showInputDialog(null, "Você possui habilitação?");
        
          if (habilitado="sim"){
           JOptionPane.showMessageDialog(null, "Pode seguir seu caminho!");
          }else{
              JOptionPane.showMessageDialog(null, "Carro Apreendido!");
          }
        }else{
              JOptionPane.showMessageDialog(null, "Não poderá seguir seu caminho!");
        }
        
    }
    
}
