package com.mycompany.aula1;

import javax.swing.JOptionPane;

public class Aula1{
    public static void main (String[] args){
        //ENTRADAS
        
        String firstNumber = JOptionPane.showInputDialog("Digite o primeiro número: ");
        
        String secondNumber = JOptionPane.showInputDialog("Digite o segundo número: ");
        
        //Conversão
        int number1 = Integer.parseInt( firstNumber );
        int number2 = Integer.parseInt( secondNumber );
        
        //Cálculo
        int soma = number1 + number2;   
        
        //Saída
        JOptionPane.showMessageDialog(null, "A soma é: " + soma, " Soma de dois Inteiros ", JOptionPane.PLAIN_MESSAGE);
    }
}