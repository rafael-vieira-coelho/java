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
public class ProgramaTeste1Modularizado {

    public static void main(String[] args) {
        Aluno maria = criaAluno("Maria da Graça Souza",
                "Análise e Desenvolvimento de Sistemas (ADS)",
                2013,
                154090,
                true);
    }

    public static Aluno criaAluno(String nome, String curso, int ano, long matricula, boolean formado) {
        Aluno a = new Aluno();
        a.nome = nome;
        a.curso = new Curso();
        a.curso.nome = curso;
        a.anoIngresso = ano;
        a.ehFormado = formado;
        a.matricula = matricula;
        return a;
    }
}
