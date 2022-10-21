package com.senai.ex3;

import javax.swing.*;

public class CalculadoraLoop {
    public static void main(String[] args) {
        var numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        var numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        int resultado = 1;
        var operador = JOptionPane.showInputDialog("Digite o operador");

        switch (operador) {
            case "-" -> resultado = (numero1 - numero2);
            case "+" -> resultado = (numero1 + numero2);
            case "/" -> resultado = (numero1 / numero2);
            case "*" -> resultado = (numero1 * numero2);
            default -> System.out.println("Operador incorreto");
        }
        while (!operador.equalsIgnoreCase("fim")) {
            operador = JOptionPane.showInputDialog("Digite o operador");

            switch (operador) {
                case "-" -> {
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
                    resultado = (resultado - numero2);
                }
                case "+" -> {
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
                    resultado = (resultado + numero2);
                }
                case "/" -> {
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
                    resultado = (resultado / numero2);
                }
                case "*" -> {
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
                    resultado = (resultado * numero2);
                }
                case "fim" -> System.out.println("Resultado:" + resultado);
                default -> System.out.println("Operador incorreto");
            }
        }
    }
}
