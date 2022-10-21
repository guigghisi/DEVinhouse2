package com.senai;

import java.util.ArrayList;

public class Main {
    public class Cliente {
        private Integer idade;
        private final float altura;
        private float peso;

        public Cliente(float altura, float peso) {
            this.altura = altura;
            this.peso = peso;
        }

        public Cliente(Integer idade, float altura, float peso) {
            this.idade = idade;
            this.altura = altura;
            this.peso = peso;
        }

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

        public void tratamento(Cliente cliente) {
            cliente.peso += -5;
            System.out.println("Peso: " + this.peso);
        }
    }

    public class Clinica {
        Cliente cliente = new Cliente(2, 2, 2);
        ArrayList<String> clientes = new ArrayList<>();
        private final String nomeDono;

        public Clinica(String nomeDono) {
            this.nomeDono = nomeDono;
        }

        public Clinica(Cliente cliente, ArrayList<String> clientes, String nomeDono) {
            this.cliente = cliente;
            this.clientes = clientes;
            this.nomeDono = nomeDono;
        }


        public void CategorizarClientes() {
            clientes.forEach(s -> cliente.calculaImc());
        }
    }

}
