/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exemplos.aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class ProgramaTeste3Modularizado {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Escolha [1] para professor e [2] para aluno:");
        int opcao = Integer.parseInt(br.readLine());

        if (opcao == 1) {
            System.out.println("Nome:");
            String nome = br.readLine();
            System.out.println("SIAPE:");
            long siape = Long.parseLong(br.readLine());
            System.out.println("Quantas áreas?");
            int quantAreas = Integer.parseInt(br.readLine());
            Professor p = ProgramaTeste2Modularizado.criaProfessor(nome, siape, quantAreas);
            System.out.println("Informe as áreas:");
            for (int i = 0; i < quantAreas; i++) {
                p.novaArea(br.readLine());
            }
        } else {
            System.out.println("Nome:");
            String nome = br.readLine();
            System.out.println("Curso:");
            String curso = br.readLine();
            System.out.println("Matricula:");
            long matricula = Long.parseLong(br.readLine());
            System.out.println("Ingresso:");
            int anoIngresso = Integer.parseInt(br.readLine());
            boolean formado = false;
            Aluno a = ProgramaTeste1Modularizado.criaAluno(nome, curso, anoIngresso, matricula, formado);
        }
    }
}
