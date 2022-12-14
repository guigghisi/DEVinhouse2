package com.senai.ex8;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            String nome;
            ArrayList<String> nomes = new ArrayList<>();
            do {
                nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
                nomes.add(nome);
            } while (!nome.equals("fim"));
            Collections.sort(nomes);
            nomes.forEach(e -> JOptionPane.showMessageDialog(null, e));
        } catch (NullPointerException exception) {
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
