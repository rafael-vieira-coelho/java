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
public class ProgramaTesteModularizado {

    public static void main(String[] args) {
        Aluno jorge = ProgramaTeste1Modularizado.criaAluno(
                "Jorge Adão de Albuquerque",
                "Técnico em Informática Integrado ao Ensino Médio",
                2019,
                164090,
                false);

        long matricula = jorge.obtemMatricula();

        System.out.println("A matrícula do aluno "
                + jorge.nome
                + " é " 
                + matricula);
    }
}
