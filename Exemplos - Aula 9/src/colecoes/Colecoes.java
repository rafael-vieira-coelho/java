/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class Colecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Turma, String> campus = new HashMap();
        int op = 0;
        Scanner s = new Scanner(System.in);
        
        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastra Turma");
            System.out.println("2 - Mostra Turmas do Curso");
            System.out.println("Opção?");
            op = s.nextInt();
            switch (op) {
                case 1:
                    try {
                        cadastra_turma(campus, s);
                    } catch (NotaInvalidaException e) {
                        System.out.println("ERRO: " + e.getMessage());
                    }
                    break;
                case 2:
                    mostra_turmas(campus, s);
            }
        } while (op != 0);
    }

    private static void cadastra_turma(HashMap<Turma, String> campus, Scanner s) throws NotaInvalidaException {
        System.out.println("Qual o curso?");
        String curso = s.next();
        System.out.println("Qual o ano?");
        int ano = s.nextInt();
        HashSet<Aluno> lista_alunos = new HashSet();
 
        System.out.println("Informa a lista de alunos (não para parar):");
        String nome = "não";
        
        do {
            System.out.println("Qual o nome?");
            nome = s.next();
            if (!nome.equals("não")) {
                Aluno aluno = new Aluno(nome);
                System.out.println("Qual a nota 1?");
                float nota1 = s.nextFloat();
                System.out.println("Qual a nota 2?");
                float nota2 = s.nextFloat();
                
                if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10)) {
                    throw new NotaInvalidaException();
                }
            
                aluno.adiciona_nota(nota1);
                aluno.adiciona_nota(nota2);
                lista_alunos.add(aluno);
            }
            
        } while (!nome.equals("não"));
        
        Turma turma = new Turma(lista_alunos, ano);
        campus.put(turma, curso);
    }

    private static void mostra_turmas(HashMap<Turma, String> campus, Scanner s) {
        System.out.println("Qual o nome do curso?");
        String nome = s.next();
        
        for (Map.Entry<Turma, String> entry : campus.entrySet()) {
            Turma key = entry.getKey();
            String value = entry.getValue();

            if (nome.equals(value)) {
                key.mostra_dados();
            }
        }
    }
    
}
