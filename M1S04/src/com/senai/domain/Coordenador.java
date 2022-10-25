package com.senai.domain;

public class Coordenador extends Pessoa {
    private Integer quantidadeCursosCoord;

    public Coordenador() {
        super();
    }

    public Coordenador(String nome, Integer idade, Integer quantidadeCursosCoord) {
        super(nome, idade);
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }

    public Integer getQuantidadeCursosCoord() {
        return quantidadeCursosCoord;
    }

    public void setQuantidadeCursosCoord(Integer quantidadeCursosCoord) {
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }
}
