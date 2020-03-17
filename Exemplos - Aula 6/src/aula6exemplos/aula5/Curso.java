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
public class Curso {

    String nome;
    String ppc;
    Disciplina disciplinas[];

    boolean novaDisciplina(String nome, int ano, String professor) {
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] != null) {
                disciplinas[i] = new Disciplina();
                disciplinas[i].nome = nome;
                disciplinas[i].ano = ano;
                disciplinas[i].professor = new Professor();
                disciplinas[i].professor.nome = professor;
                return true;
            }
        }
        return false;
    }

    boolean removerDisciplina(String nome) {
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i].nome.equals(nome)) {
                disciplinas[i] = null;
                return true;
            }
        }
        return false;
    }

    void alterarPPC(String ppc) {
        this.ppc = ppc;
    }
}
