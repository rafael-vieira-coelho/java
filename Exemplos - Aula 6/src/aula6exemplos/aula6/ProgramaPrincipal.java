package aula6exemplos.aula6;

import aula6exemplos.aula5.Aluno;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author coelho
 */
public class ProgramaPrincipal {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Aluno []alunos = new Aluno[1000];
        SetorEnsino ensino = new SetorEnsino("Pâmela Perini", "Vitor Valente");
        int opcao = 4;
        
        do {
            opcao = menu("MENU 1: \n [1] Aluno \n [2] Professor \n [3] Setor de Ensino \n [4] Sair");
            switch (opcao) {
                case 1:
                    menu_alunos("MENU 2: \n [1] Ver Cursos [2] Ver notas");
                    break;
                case 2:
                    menu_professor("MENU 2: \n [1] Dar Notas de uma disciplina [2] Alterar uma nota [3] Adicionar Área [4] Remover Área");
                    break;
                case 3:
                    menu_ensino("MENU 2: \n [1] Cadastrar Aluno [2] Cadastrar Curso [3] Adicionar Disciplina ao Curso [4] Cadastrar Professor");
            }
        } while (opcao != 4);
    }

    private static int menu(String opcoes) throws IOException {
        System.out.println(opcoes);
        String texto = br.readLine();
        int opcao = Integer.parseInt(texto);
        return opcao;
    }

    private static void menu_alunos(String opcoes) throws IOException {
        int opcao = menu(opcoes);
    }

    private static void menu_professor(String opcoes) throws IOException {
        int opcao = menu(opcoes);

    }

    private static void menu_ensino(String opcoes) throws IOException {
        int opcao = menu(opcoes);

    }
}
