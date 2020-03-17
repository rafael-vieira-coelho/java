package aula7exemplos.aula6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author coelho
 */
public class ProgramaPrincipal {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Aluno[] alunos = new Aluno[1000];
        SetorEnsino ensino = new SetorEnsino("Pâmela Perini", "Vitor Valente");
        int opcao = 4;

        do {
            opcao = Auxiliar.menu("MENU 1: \n [1] Aluno \n [2] Professor \n [3] Setor de Ensino \n [4] Sair", br);
            switch (opcao) {
                case 1:
                    AuxiliarAluno.menu_alunos("MENU 2: \n [1] Ver Cursos [2] Ver notas",
                            ensino,
                            alunos,
                            br);
                    break;
                case 2:
                    System.out.println("Qual o seu número de siape, professor?");
                    int siape = Integer.parseInt(br.readLine());
                    int posicao_professor = AuxiliarProfessor.login_professor(siape, ensino, br);

                    if (posicao_professor != -1) {
                        AuxiliarProfessor.menu_professor("MENU 2: \n [1] Dar Notas de uma disciplina [2] Alterar uma nota [3] Adicionar Área [4] Remover Área",
                                posicao_professor,
                                ensino,
                                br);
                    } else {
                        System.err.println("SIAPE inválido.");
                    }
                    break;
                case 3:
                    AuxiliarEnsino.menu_ensino("MENU 2: \n [1] Adicionar Disciplina ao Curso [2] Cadastrar Aluno [3] Cadastrar Curso [4] Cadastrar Professor",
                            ensino,
                            alunos,
                            br);
            }
        } while (opcao != 4);
    }

}
