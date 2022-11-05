package com.senai.domain;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int opt = 1;
        List<Aluno> alunos = new ArrayList<>();
        List<Coordenador> coordenadores = new ArrayList<>();
        List<Mentor> mentores = new ArrayList<>();
        do {
            try {

                opt = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que deseja cadastrar:\n 1 - Aluno\n 2 - Coordenador\n 3 - Mentor\n 0 - Sair"));
                switch (opt) {
                    case 1:
                        var nomeAluno = JOptionPane.showInputDialog("Digite o nome:");
                        var idadeAluno = JOptionPane.showInputDialog("Digite a idade");
                        var curso = JOptionPane.showInputDialog("Digite o curso");
                        var matricula = JOptionPane.showInputDialog("Digete a matricula");

                        Aluno aluno = new Aluno(nomeAluno, idadeAluno, curso, matricula);
                        alunos.add(aluno);
                        break;
                    case 2:
                        var nomeCoordenador = JOptionPane.showInputDialog("Digite o nome:");
                        var idadeCoordenador = JOptionPane.showInputDialog("Digite a idade");
                        var quantidadeCurso = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cursos"));

                        Coordenador coordenador = new Coordenador(nomeCoordenador, idadeCoordenador, quantidadeCurso);
                        coordenadores.add(coordenador);
                        break;
                    case 3:
                        var nomeMentor = JOptionPane.showInputDialog("Digite o nome:");
                        var idadeMentor = JOptionPane.showInputDialog("Digite a idade");
                        var linguagem = JOptionPane.showInputDialog("Digite a linguagem");
                        Mentor mentor = new Mentor(nomeMentor, idadeMentor, linguagem);
                        mentores.add(mentor);
                        break;
                    case 0:
                        System.out.println("Sair");
                        break;
                    default:
                        System.out.println("Digite uma opção válida");
                        break;
                }
            } catch (IndexOutOfBoundsException e) {
                System.err.println("IndexOutOfBoundsException: " + e.getMessage());
            }
        } while (opt != 0);


    }
}
