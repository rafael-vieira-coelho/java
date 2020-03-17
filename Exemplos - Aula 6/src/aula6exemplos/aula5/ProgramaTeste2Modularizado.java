/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exemplos.aula5;

/**
 *
 * @author coelho
 */
public class ProgramaTeste2Modularizado {

    public static void main(String[] args) {
        Professor coelho = criaProfessor("Rafael Vieira Coelho",
                1804250,
                3);

        coelho.novaArea("Programação de Computadores");
        coelho.novaArea("Redes de Computadores");
        coelho.novaArea("Segurança de Sistemas");
    }

    public static Professor criaProfessor(String nome, long siape, int numeroAreas) {
        Professor p = new Professor();
        p.nome = nome;
        p.siape = siape;
        p.areas = new String[numeroAreas];
        return p;
    }
}
