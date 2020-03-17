/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.HashSet;

/**
 *
 * @author coelho
 */
public class Turma {
    private HashSet<Aluno> alunos;
    private int ano;

    public HashSet<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(HashSet<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Turma(HashSet<Aluno> alunos, int ano) {
        this.alunos = alunos;
        this.ano = ano;
    }
    
    public void mostra_dados() {
        System.out.println("Ano " + ano);
        for (Aluno aluno : alunos) {
            System.out.println("Nome " + aluno.getNome()
                    + " Nota 1: " + aluno.getNotas().get(0) 
                    + " Nota 2: " + aluno.getNotas().get(1));
        }
    }
    
}
