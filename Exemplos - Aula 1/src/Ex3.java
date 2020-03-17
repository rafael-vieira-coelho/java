/*
 * 03 - Escreva um código que some os valores de 1 a 10 em um laço e mostre. 
Faça o mesmo de 1 a 100 e de 1 a 1000.
 */

/**
 *
 * @author coelho
 */
public class Ex3 {
    public static void main(String[] args) {
        int soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 10: " + soma);
        soma = 0;
        for (int i = 1; i < 100; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 100: " + soma);
        soma = 0;
        for (int i = 1; i < 1000; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 1000: " + soma);
    }
}
