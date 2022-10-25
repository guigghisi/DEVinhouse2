package com.senai.domain;

public class Mentor extends Pessoa {
    private String linguagemDeProgramacao;

    public Mentor() {
        super();
    }

    public Mentor(String nome, Integer idade, String linguagemDeProgramacao) {
        super(nome, idade);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }


    public String getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }

    public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }
}
