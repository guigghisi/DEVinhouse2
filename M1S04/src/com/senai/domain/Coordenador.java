package com.senai.domain;

public class Coordenador extends Pessoa {
    private Integer quantidadeCursosCoord;

    public Coordenador() {
        super();
    }

    public Coordenador(String nome, String idade, Integer quantidadeCursosCoord) {
        super(nome, idade);
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }

    public Integer getQuantidadeCursosCoord() {
        return quantidadeCursosCoord;
    }

    public void setQuantidadeCursosCoord(Integer quantidadeCursosCoord) {
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }

    @Override
    public void obterinformacoes() {
        super.obterinformacoes();
        System.out.println("Quantidade de cursos: " + quantidadeCursosCoord);
    }
}
