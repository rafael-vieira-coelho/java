/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5exemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class ProgramaTeste3 {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Escolha [1] para professor e [2] para aluno:");
        int opcao = Integer.parseInt(br.readLine());

        if (opcao == 1) {
            Professor p = new Professor();
            System.out.println("Nome:");
            p.nome = br.readLine();
            System.out.println("SIAPE:");
            p.siape = Long.parseLong(br.readLine());
            System.out.println("Quantas áreas?");
            int quantAreas = Integer.parseInt(br.readLine());
            
            p.areas = new String[quantAreas];
            System.out.println("Informe as áreas:");
            for (int i = 0; i < quantAreas; i++) {
                p.areas[i] = br.readLine();
            }
        } else {
            Aluno a = new Aluno();
            System.out.println("Nome:");
            a.nome = br.readLine();
            System.out.println("Curso:");
            a.curso = br.readLine();
            System.out.println("Matricula:");
            a.matricula = Long.parseLong(br.readLine());
            System.out.println("Ingresso:");
            a.anoIngresso = Integer.parseInt(br.readLine());
            a.ehFormado = false;
        }
    }
}
