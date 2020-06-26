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
public class TrianguloCondicional {

    
    public static void main(String[] args) {
        //Var
        double a,b,c;
        
        //Entrada
        a= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado do triângulo:"));
        b= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado do triângulo:"));
        c= Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado do triângulo:"));
        
        //Processameno
        if (((a<(b+c)) && (a >(Math.abs(b-c)))) && ((b<(a+c)) && (b >(Math.abs(a-c)))) &&((c<(b+a)) && (c>(Math.abs(b-a))))){
            
            if (((a==b) && (b==c) && (a==c))){
            JOptionPane.showMessageDialog(null, "Seu triângulo é Equilatero!");
           }
            
             if((a!=b)&&(b!=c)&&(a!=c)){
            JOptionPane.showMessageDialog(null, "Seu triângulo é Escaleno!");
    
           } 
             
             if(((a==b)&&(b!=c))||((b==c)&&(c!=a))||(a==c)&&(c!=b)){
            JOptionPane.showMessageDialog(null, "Seu triângulo é Isóceles!");           
    
           }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Isso não é um triangulo");
            
           }
      
            
            
        }
    
    }
    

