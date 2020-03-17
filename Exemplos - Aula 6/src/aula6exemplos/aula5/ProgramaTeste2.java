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
public class ProgramaTeste2 {

    public static void main(String[] args) {
        Professor coelho;

        coelho = new Professor();
        coelho.nome = "Rafael Vieira Coelho";
        coelho.siape = 1804250;
        coelho.areas = new String[3];
        coelho.areas[0] = "Programação de Computadores";
        coelho.areas[1] = "Redes de Computadores";
        coelho.areas[2] = "Segurança de Sistemas";
    }
}
