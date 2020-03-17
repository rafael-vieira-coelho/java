/*
 Exercícios Complementares

1) Um jogador de futebol tem nome, posição e salário, sendo que os salários 
são tabelados (fixos) conforme a tabela abaixo.

Goleiro: R$50.000,00
Lateral: R$20.000,00
Zagueiro: R$30.000,00
Volante: R$10.000,00
Armador: R$30.000,00
Atacante: R$30.000,00

Crie uma classe que representa o jogador de futebol e utilize um HashMap para 
associar o tipo de jogador com o valor que ele recebe como salário.

 */
package mapas.Exerc1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class Exerc1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Jogador> time = new ArrayList();
        
        for (int i = 0; i < 11; i++) {
            System.out.println("Qual o nome?");
            String nome = s.next();
            System.out.println("Qual a posição?");
            String posicao = s.next();
            time.add(new Jogador(nome, posicao));
        }
        
        for (Jogador jogador : time) {
            System.out.println(jogador);
        }
    }
}
