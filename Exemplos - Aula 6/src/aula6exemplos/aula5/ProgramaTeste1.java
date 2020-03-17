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
public class ProgramaTeste1 {

    public static void main(String[] args) {
        Aluno maria;

        maria = new Aluno();
        maria.nome = "Maria da Graça Souza";
        maria.curso = new Curso();
        maria.curso.nome = "Análise e Desenvolvimento de Sistemas (ADS)";
        maria.anoIngresso = 2013;
        maria.ehFormado = true;
        maria.matricula = 154090;
    }
}
