/*
 *04 - Escreva um código que imprima a tabuada de 1 a 9. 
Faça a impressão de maneira organizada 1x1=1 [enter]
1x2=2 e assim por diante até 9x10 = 90. (utilize dois laços FOR)
 */

/**
 *
 * @author coelho
 */
public class Ex4 {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("");
        }
    }
}
