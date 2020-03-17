/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exemplos.aula6;

/**
 *
 * @author coelho
 */
public class Curso {

    private String nome;
    private String ppc;
    private Disciplina disciplinas[];

    public boolean novaDisciplina(String nome, int ano, String professor) {
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] != null) {
                disciplinas[i] = new Disciplina(professor, nome, ano);
                return true;
            }
        }
        return false;
    }

    public boolean removerDisciplina(String nome) {
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] != null && disciplinas[i].getNome().equals(nome)) {
                disciplinas[i] = null;
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPpc() {
        return ppc;
    }

    public void setPpc(String ppc) {
        this.ppc = ppc;
    }

    public aula6exemplos.aula6.Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(aula6exemplos.aula6.Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Curso(String nome, String ppc, aula6exemplos.aula6.Disciplina[] disciplinas) {
        this.nome = nome;
        this.ppc = ppc;
        this.disciplinas = disciplinas;
    }

    public Curso(String nome, String ppc) {
        this.nome = nome;
        this.ppc = ppc;
    }
    
}
