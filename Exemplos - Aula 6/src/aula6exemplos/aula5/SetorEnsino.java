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
public class SetorEnsino {

    Curso cursos[];
    Professor professores[];
    String diretor;
    String coordenador;

    boolean novoProfessor(String nome, long siape) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] != null) {
                professores[i] = new Professor();
                professores[i].nome = nome;
                professores[i].siape = siape;
                return true;
            }
        }
        return false;
    }

    boolean demitirProfessor(long siape) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i].siape == siape) {
                professores[i] = null;
                return true;
            }
        }
        return false;
    }

    boolean novoCurso(String nome, String ppc) {
        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i] != null) {
                cursos[i] = new Curso();
                cursos[i].nome = nome;
                cursos[i].ppc = ppc;
                return true;
            }
        }
        return false;
    }

    boolean removerCurso(String nome) {
        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i].nome.equals(nome)) {
                cursos[i] = null;
                return true;
            }
        }
        return false;
    }
}
