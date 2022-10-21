package com.senai.ex2;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        var numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        var numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        var operador = JOptionPane.showInputDialog("Digite o operador");
        switch (operador) {
            case "-" -> System.out.println(numero1 - numero2);
            case "+" -> System.out.println(numero1 + numero2);
            case "/" -> System.out.println(numero1 / numero2);
            case "*" -> System.out.println(numero1 * numero2);
            default -> System.out.println("Operador incorreto");
        }
    }

}
