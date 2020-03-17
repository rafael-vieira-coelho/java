/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7exemplos.aula6;

/**
 *
 * @author coelho
 */
public class SetorEnsino {

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
            if (professores[i] == null) {
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
        this.professores = new Professor[60];
    }

    public SetorEnsino(String diretor, String coordenador) {
        this.diretor = diretor;
        this.coordenador = coordenador;
        this.professores = new Professor[60];
        this.cursos = new Curso[12];
    }

    public boolean matricularAluno(Aluno a) {
        for (Curso curso : cursos) {
            if (curso != null && curso.getNome().equals(a.getCurso().getNome())) {
                for (Disciplina disciplina : curso.getDisciplinas()) {
                    a.setCurso(curso);
                    disciplina.registrarAluno(a);
                    return true;
                }
            }
        }
        return false;
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

}
