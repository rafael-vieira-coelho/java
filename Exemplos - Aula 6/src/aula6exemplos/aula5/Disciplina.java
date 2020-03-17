/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exemplos.aula5;

/**
 *
 * @author coelho
 */
public class Disciplina {

    Aluno alunos[];
    Professor professor;
    String nome;
    int ano;
    float notas[];

    boolean registrarNota(float nota, String nome) {
        for (int i = 0; i < notas.length; i++) {
            if (alunos[i].nome.equals(nome)) {
                notas[i] = nota;
                return true;
            }
        }
        return false;
    }

    boolean novoAluno(String nome, String curso, int anoIngresso, long matricula) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                alunos[i] = new Aluno();
                alunos[i].nome = nome;
                return true;
            }
        }
        return false;
    }

    boolean alterarNota(float nota, String nome) {
        return registrarNota(nota, nome);
    }

    boolean removerAluno(String nome) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].nome.equals(nome)) {
                alunos[i] = null;
                return true;
            }
        }
        return false;
    }

}
