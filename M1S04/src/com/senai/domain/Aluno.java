package com.senai.domain;

public class Aluno extends Pessoa {
    private String curso;
    private String matricula;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String idade, String curso, String matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void obterinformacoes() {
        super.obterinformacoes();
        System.out.println("Curso: " + curso + "\nMatricula: " + matricula);

    }
}
