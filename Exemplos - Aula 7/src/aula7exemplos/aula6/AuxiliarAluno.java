package aula7exemplos.aula6;

import aula7exemplos.aula6.Aluno;
import aula7exemplos.aula6.Curso;
import aula7exemplos.aula6.Disciplina;
import aula7exemplos.aula6.SetorEnsino;

import java.io.BufferedReader;
import java.io.IOException;

public class AuxiliarAluno {
    public static void menu_alunos(String opcoes, SetorEnsino ensino, Aluno alunos[], BufferedReader br) throws IOException {
        int opcao = Auxiliar.menu(opcoes, br);

        switch (opcao) {
            case 1:
                AuxiliarEnsino.ver_cursos(ensino);
                break;
            case 2:
                System.out.println("Qual a sua matrícula, caro discente?");
                long matricula = Long.parseLong(br.readLine());

                ver_notas(ensino, alunos, matricula);
                break;
        }
    }

    public static void novo_aluno(SetorEnsino ensino, Aluno[] alunos, BufferedReader br) throws IOException {
        Aluno a = cadastra_aluno(ensino, br, alunos);

        AuxiliarEnsino.cadastra_disciplinas_aluno(br, ensino, a);
    }

    public static void ver_notas(SetorEnsino ensino, Aluno alunos[], long matricula) {
        boolean aluno_nao_encontrado = true;

        if (alunos != null) {
            for (Aluno aluno : alunos) {
                if (aluno != null && aluno.getMatricula() == matricula) {//aluno matriculado
                    aluno_nao_encontrado = false;
                    Curso cursos[] = ensino.getCursos();

                    for (Curso curso : cursos) {
                        Disciplina disciplinas[] = curso.getDisciplinas();

                        for (Disciplina disciplina : disciplinas) {
                            Aluno a[] = disciplina.getAlunos();
                            int i = 0;

                            while (i != a.length && a[i].getMatricula() != matricula) {
                                i++;
                            }
                            float nota = disciplina.getNotas()[i];

                            System.out.println("A nota do aluno " + a[i].getNome() + " é de " + nota + " na disciplina " + disciplina.getNome());
                            break;
                        }
                    }
                }
            }
            if (aluno_nao_encontrado) {
                System.err.println("Aluno não matriculado no sistema.");
            }
        } else {
            System.err.println("Ainda não existem alunos no sistema.");
        }
    }

    public static Aluno cadastra_aluno(SetorEnsino ensino, BufferedReader br, Aluno[] alunos) throws IOException {
        Aluno a = cria_aluno(ensino, br);

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = alunos[i];

            if (aluno == null) {
                alunos[i] = a;
            }
        }
        return a;
    }

    public static Aluno cria_aluno(SetorEnsino ensino, BufferedReader br) throws IOException {
        Aluno a = new Aluno();

        System.out.println("Nome:");
        a.setNome(br.readLine());
        System.out.println("Curso:");
        String nome_curso = br.readLine();
        Curso c = AuxiliarEnsino.encontra_curso(ensino, nome_curso);

        a.setCurso(c);
        System.out.println("Matricula:");
        a.setMatricula(Long.parseLong(br.readLine()));
        System.out.println("Ingresso:");
        a.setAnoIngresso(Integer.parseInt(br.readLine()));
        a.setEhFormado(false);
        return a;
    }

}
