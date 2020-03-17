/*
 * 01 - Escreva um código que leia 5 números inteiros do teclado e informe 
        ao final qual o maior, o menor, a média deles e a soma.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author coelho
 */
public class Ex1 {

    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int numero, i = 1, maior, menor, media = 0, soma = 0;
        
        numero = Integer.parseInt(s.readLine());
        maior = numero;
        menor = numero;
        soma = numero;
        do {
            numero = Integer.parseInt(s.readLine());
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            soma += numero;
            i++;
        } while (i < 5);
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
        media = soma / 5;
        System.out.println("Média: " + (float) media);
    }
    
}
