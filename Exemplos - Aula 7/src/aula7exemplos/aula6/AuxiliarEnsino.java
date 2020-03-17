package aula7exemplos.aula6;

import java.io.BufferedReader;
import java.io.IOException;

public class AuxiliarEnsino {
    public static void menu_ensino(String opcoes, SetorEnsino ensino, Aluno[] alunos, BufferedReader br) throws IOException {
        int opcao = Auxiliar.menu(opcoes, br);

        switch (opcao) {
            case 1:
                System.out.println("Qual o curso?");
                String nome_curso = br.readLine();
                Curso c = encontra_curso(ensino, nome_curso);

                if (c == null) {
                    System.err.println("Curso não encontrado. Cadastre-o.");
                    c = cadastra_curso(ensino, br);
                }
                System.out.println("Qual o professor?");
                String nome_professor = br.readLine();
                Professor p = AuxiliarProfessor.encontra_professor(ensino, nome_professor);

                if (p == null) {
                    System.err.println("Professor não encontrado. Cadastre-o.");
                    p = AuxiliarProfessor.cadastra_professor(br, ensino);
                }
                if (cadastra_disciplina(ensino, c, p, br)) {
                    System.out.println("Disciplina cadastrada com sucesso.");
                } else {
                    System.err.println("O limite de disciplinas foi excedido.");
                }
                break;
            case 2:
                AuxiliarAluno.novo_aluno(ensino, alunos, br);
                break;
            case 3:
                cadastra_curso(ensino, br);
                break;
            case 4:
                AuxiliarProfessor.cadastra_professor(br, ensino);
                break;
        }
    }

    public static boolean cadastra_disciplina(SetorEnsino ensino, Curso c, Professor p, BufferedReader br) throws IOException {
        Disciplina d = cria_disciplina(br, p);

        return ensino.novaDisciplina(d, c);
    }

    public static Disciplina cria_disciplina(BufferedReader br, Professor p) throws IOException, NumberFormatException {
        System.out.println("Quantos alunos tem na turma?");
        int quantAlunos = Integer.parseInt(br.readLine());

        System.out.println("Qual o nome da disciplina?");
        String nome_disciplina = br.readLine();
        System.out.println("Qual o ano/semestre da disciplina?");
        int ano = Integer.parseInt(br.readLine());
        Disciplina d = new Disciplina(quantAlunos, p, nome_disciplina, ano);

        return d;
    }

    public static Disciplina[] recebe_disciplinas(SetorEnsino ensino, BufferedReader br) throws IOException {
        Disciplina[] disciplinas = new Disciplina[40];

        System.out.println("Digite [1] para terminar e [2] para cadastrar disciplina");
        int op = Integer.parseInt(br.readLine());

        for (int i = 0; op != 1 && i < disciplinas.length; i++) {
            System.out.println("Qual o nome do professor da disciplina?");
            String nome_professor = br.readLine();
            Professor professor = AuxiliarProfessor.encontra_professor(ensino, nome_professor);

            if (professor == null) {
                System.err.println("O professor ainda não foi cadastrado. Informe seus dados.");
                professor = AuxiliarProfessor.cria_professor(br);
                ensino.novoProfessor(professor);
            }
            disciplinas[i] = cria_disciplina(br, professor);
            System.out.println("\n Digite [1] para terminar e [2] para cadastrar disciplina");
            op = Integer.parseInt(br.readLine());
        }
        return disciplinas;
    }

    public static void cadastra_disciplinas_aluno(BufferedReader br, SetorEnsino ensino, Aluno a) throws IOException {
        if (ensino.matricularAluno(a)) {
            System.out.println("Aluno matriculado nas disciplinas do curso.");
        } else {
            System.err.println("Curso não encontrado. Cadastre-o.");
            Curso c = cadastra_curso(ensino, br);

            a.setCurso(c);
        }
    }

    public static Disciplina encontra_disciplina(Curso curso, String disciplina) throws IOException {
        if (curso != null && curso.getDisciplinas() != null) {
            for (Disciplina c : curso.getDisciplinas()) {
                if (c != null && c.getNome().equals(disciplina)) {
                    return c;
                }
            }
        }
        return null;
    }

    /////////////////////////// Curso //////////////////////////////////////////
    public static Curso cadastra_curso(SetorEnsino ensino, BufferedReader br) throws IOException {
        Curso c;

        c = cria_curso(ensino, br);
        if (ensino.novoCurso(c)) {
            System.out.println("Curso " + c.getNome());
        } else {
            System.out.println("O limite de cursos foi alcançado.");
        }
        return c;
    }

    public static Curso cria_curso(SetorEnsino ensino, BufferedReader br) throws IOException {
        Curso a = new Curso();

        System.out.println("Nome:");
        a.setNome(br.readLine());
        System.out.println("PPC:");
        a.setPpc(br.readLine());
        Disciplina[] disciplinas = recebe_disciplinas(ensino, br);

        a.setDisciplinas(disciplinas);
        return a;
    }

    public static Curso encontra_curso(SetorEnsino ensino, String nome) throws IOException {
        if (ensino.getCursos() != null) {
            for (Curso curso : ensino.getCursos()) {
                if (curso != null && curso.getNome().equals(nome)) {
                    return curso;
                }
            }
        }
        return null;
    }

    public static void ver_cursos(SetorEnsino ensino) {
        Curso cursos[] = ensino.getCursos();

        if (cursos != null) {
            for (Curso curso : cursos) {
                if (curso != null) {
                    System.out.println("Curso " + curso.getNome());
                    System.out.println("PPC: " + curso.getPpc());
                    System.out.println("Disciplinas: ");
                    if (curso.getDisciplinas() != null) {
                        for (Disciplina d : curso.getDisciplinas()) {
                            if (d != null) {
                                System.out.println(d.getNome());
                            }
                        }
                    }
                }
            }
        } else {
            System.err.println("Não existem cursos cadastrados.");
        }
    }
}
