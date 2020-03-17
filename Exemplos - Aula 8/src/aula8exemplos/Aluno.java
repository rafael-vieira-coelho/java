/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8exemplos;

import java.util.Objects;

/**
 * @author coelho
 */
public class Aluno {

    private String nome;
    private Curso curso;
    private int anoIngresso;
    private boolean ehFormado;
    private long matricula;

    public Aluno() {

    }

    Aluno(String nome) {
        this.nome = nome;
    }

    public String verificaStatus() {
        if (ehFormado) {
            return "O aluno ainda não completou os créditos";
        }
        return "O aluno entrou no ano" + anoIngresso + "e se formou";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public boolean isEhFormado() {
        return ehFormado;
    }

    public void setEhFormado(boolean ehFormado) {
        this.ehFormado = ehFormado;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, Curso curso, int anoIngresso, long matricula) {
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.matricula = matricula;
        this.ehFormado = false;
    }

    public Aluno(String nome, Curso curso, int anoIngresso, boolean ehFormado,
                 long matricula) {
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.ehFormado = ehFormado;
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null
                && getClass() == obj.getClass()) {
            final Aluno other = (Aluno) obj;

            if (this.matricula == other.matricula
                    && this.nome.equals(other.nome)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + (int) (this.matricula ^ (this.matricula >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        String formado = "está formado.";

        if (!ehFormado) {
            formado = "não " + formado;
        }
        return "\n nome: " + nome
                + "\n curso: " + curso
                + "\n anoIngresso: " + anoIngresso
                + "\n matricula: " + matricula
                + formado;
    }
}
