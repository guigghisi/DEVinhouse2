package com.senai.domain;

public class Pessoa {
    private String nome;
    private String idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void obterinformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
