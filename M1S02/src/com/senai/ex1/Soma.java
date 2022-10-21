package com.senai.ex1;

import javax.swing.*;

public class Soma {
    public static void main(String[] args) {
        var numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        var numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        System.out.println("A some é igual a: " + (numero1 + numero2));
    }
}
