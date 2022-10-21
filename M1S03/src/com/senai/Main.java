package com.senai;

public class Main {
    public class Cliente {
        Integer idade;
        float altura;
        float peso;
        
        public String calculaImc() {

            float imc = (this.peso / (this.altura * this.altura));

            if (imc < 18.5) {
                return ("Muito Magro");
            } else if (imc >= 18.5 && imc <= 24.9) {
                return ("Normal");
            } else if (imc >= 25 && imc <= 29.9) {
                return ("Sobrepeso");
            } else if (imc >= 30 && imc <= 34.9) {
                return ("Obeso grau I");
            } else if (imc >= 35 && imc <= 39.9) {
                return ("Obeso grau II");
            } else {
                return ("IMC: " + imc + "\nObseo grau III ou Mórbido");
            }
        }
    }


}
