package aula7exemplos.aula6;

import java.util.Objects;

/**
 *
 * @author coelho
 */
public class Disciplina {

    public static final int MAX_ALUNOS = 30;

    private Aluno alunos[];
    private Professor professor;
    private String nome;
    private int ano;
    private float notas[];

    public Disciplina() {
        alunos = new Aluno[MAX_ALUNOS];
        notas = new float[MAX_ALUNOS];
    }

    public boolean registrarNota(float nota, String nome) {
        for (int i = 0; i < notas.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equals(nome)) {
                notas[i] = nota;
                return true;
            }
        }
        return false;
    }

    public boolean registrarAluno(String nome, Curso curso, int anoIngresso, long matricula) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                alunos[i] = new Aluno(nome, curso, anoIngresso, matricula);
                return true;
            }
        }
        return false;
    }

    public boolean alterarNota(float nota, String nome) {
        return registrarNota(nota, nome);
    }

    public boolean removerAluno(String nome) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getNome().equals(nome)) {
                alunos[i] = null;
                return true;
            }
        }
        return false;
    }

    public void registrarAluno(Aluno a) {
        registrarAluno(a.getNome(), a.getCurso(), a.getAnoIngresso(), a.getMatricula());
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public Disciplina(Professor professor, String nome, int ano) {
        this.professor = professor;
        this.nome = nome;
        this.ano = ano;
        this.alunos = new Aluno[MAX_ALUNOS];
        this.notas = new float[MAX_ALUNOS];
    }

    public Disciplina(int quantAlunos, Professor professor, String nome, int ano) {
        this.alunos = new Aluno[quantAlunos];
        this.notas = new float[quantAlunos];
        this.professor = professor;
        this.nome = nome;
        this.ano = ano;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null
                && getClass() == obj.getClass()) {
            final Disciplina other = (Disciplina) obj;

            if (this.professor.equals(other.professor)
                    && this.nome.equals(other.nome)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.professor);
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public String toString() {
        String notas_alunos = "";

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = alunos[i];
            float nota = notas[i];

            notas_alunos += aluno.toString() + " Nota: " + nota + "\n";
        }
        return "professor=" + professor
                + ", nome=" + nome
                + ", ano=" + ano
                + "Notas: \n" + notas_alunos;
    }
}
