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
public class SaldoBancarioCondicional {

    
    public static void main(String[] args) {
        //Var
        double saque, saldoatual, saldofinal, limite;
        
        //Entrada
        saque= Double.parseDouble(JOptionPane.showInputDialog("Quanto você deseja sacar:"));
        saldoatual=1000;
        limite=2000;
        
        //Processamento
        saldofinal= saldoatual - saque;
        
        if (saldofinal>=0){
        JOptionPane.showMessageDialog(null, "Seu saldo final é positivo com: R$"+saldofinal);
        }
        
        if ((saldofinal<0) && (saldofinal>=(-limite))){
        JOptionPane.showMessageDialog(null, "Seu saldo final é negativo com: R$"+saldofinal);
        
        }else{
          JOptionPane.showMessageDialog(null, "Você não possui limite suficiente. Seu limite é de: "+limite);  
        }
        
       
    }
    
}
