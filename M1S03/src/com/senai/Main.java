package com.senai;

import java.util.ArrayList;

public class Main {
    public class Cliente {
        Integer idade;
        float altura;
        float peso;

        public void calculaImc() {

            float imc = (this.peso / (this.altura * this.altura));

            if (imc < 18.5) {
                System.out.println("Muito Magro");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Normal");
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println("Sobrepeso");
            } else if (imc >= 30 && imc <= 34.9) {
                System.out.println("Obeso grau I");
            } else if (imc >= 35 && imc <= 39.9) {
                System.out.println("Obeso grau II");
            } else {
                System.out.println("IMC: " + imc + "\nObeso grau III ou Mórbido");
            }
        }
    }

    public class Clinica {
        Cliente cliente = new Cliente();
        ArrayList<String> clientes = new ArrayList<>();
        String nomeDono;


        public void CategorizarClientes() {
            clientes.forEach(s -> cliente.calculaImc());
        }
    }

}
