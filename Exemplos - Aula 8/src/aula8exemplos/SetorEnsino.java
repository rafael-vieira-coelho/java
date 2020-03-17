/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8exemplos;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author coelho
 */
public class SetorEnsino {

    public static final int MAX_PROFESSORES = 60;
    public static final int MAX_CURSOS = 12;
    
    private Curso cursos[];
    private Professor professores[];
    private String diretor;
    private String coordenador;

    public boolean novoProfessor(String nome, long siape) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] != null) {
                professores[i] = new Professor(nome, siape);
                return true;
            }
        }
        return false;
    }

    public boolean novoProfessor(String nome, long siape, String areas[]) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] != null) {
                professores[i] = new Professor(nome, siape, areas);
                return true;
            }
        }
        return false;
    }

    public boolean novoProfessor(Professor p) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] != null) {
                professores[i] = p;
                return true;
            }
        }
        return false;
    }

    public boolean demitirProfessor(long siape) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] != null && professores[i].getSiape() == siape) {
                professores[i] = null;
                return true;
            }
        }
        return false;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public SetorEnsino(Curso[] cursos, Professor[] professores, String diretor, String coordenador) {
        this.cursos = cursos;
        this.professores = professores;
        this.diretor = diretor;
        this.coordenador = coordenador;
        this.professores = new Professor[MAX_PROFESSORES];

    }

    public SetorEnsino(String diretor, String coordenador) {
        this.diretor = diretor;
        this.coordenador = coordenador;
        this.professores = new Professor[MAX_PROFESSORES];
        this.cursos = new Curso[MAX_CURSOS];
    }

    public void matricularAluno(Aluno a) {
        for (Curso curso : cursos) {
            if (curso.getNome().equals(a.getCurso().getNome())) {
                for (Disciplina disciplina : curso.getDisciplinas()) {
                    a.setCurso(curso);
                    disciplina.registrarAluno(a);
                }
            }
        }
    }

    public boolean alterarNota(String nome_disciplina, String nome_curso, String nome_aluno, float nova_nota) {
        for (Curso curso : cursos) {
            if (curso.getNome().equals(nome_curso)) {
                for (Disciplina disciplina : curso.getDisciplinas()) {
                    if (disciplina.getNome().equals(nome_disciplina)) {
                        Aluno alunos[] = disciplina.getAlunos();

                        for (int i = 0; i < alunos.length; i++) {
                            if (alunos[i].getNome().equals(nome_aluno)) {
                                disciplina.getNotas()[i] = nova_nota;
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void salvaNotas(float[] notas,
            Curso curso,
            Disciplina disciplina) {
        for (Curso c : cursos) {
            if (c.equals(curso)) {
                for (Disciplina d : c.getDisciplinas()) {
                    if (d.equals(disciplina)) {
                        d.setNotas(notas);
                    }
                }
            }
        }
    }

    public boolean novaDisciplina(Disciplina disciplina, Curso curso) {
        for (Curso c : cursos) {
            if (c.equals(curso)) {
                for (int i = 0; i < c.getDisciplinas().length; i++) {
                    if (c.getDisciplinas()[i] == null) {
                        c.getDisciplinas()[i] = disciplina;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean novoCurso(Curso c) {
        for (int i = 0; i < getCursos().length; i++) {
            if (getCursos()[i] == null) {
                getCursos()[i] = c;
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Arrays.deepHashCode(this.cursos);
        hash = 61 * hash + Arrays.deepHashCode(this.professores);
        hash = 61 * hash + Objects.hashCode(this.diretor);
        hash = 61 * hash + Objects.hashCode(this.coordenador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SetorEnsino other = (SetorEnsino) obj;
        if (!Objects.equals(this.diretor, other.diretor)) {
            return false;
        }
        return (Objects.equals(this.coordenador, other.coordenador));
    }

    @Override
    public String toString() {
        String nomes_cursos = "";

        for (Curso d : cursos) {
            nomes_cursos += d.toString() + "\n";
        }
        String nomes_professores = "";

        for (Professor e : professores) {
            nomes_professores += e.toString() + "\n";
        }
        return "\n cursos: " 
                + nomes_cursos 
                + "\n professores: " 
                + nomes_professores 
                + "\n diretor: " 
                + diretor 
                + "\n coordenador: " + coordenador;
    }

    
    
}
