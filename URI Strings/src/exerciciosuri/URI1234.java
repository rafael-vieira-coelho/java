/**
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1234
 * 
 * Dancing Sentence
 * */
package exerciciosuri;

/**
 *
 * @author coelho
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class URI1234 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String l;

        while ((l = lerFrase()) != null) {
            traduzFrase(l);
        }
    }

    private static void traduzFrase(String l) {
        String[] letters = l.split("");
        int count = 0;

        for (String letter : letters) {
            mostraLetraCorrigida(count, letter);
            count++;
        }
        System.out.println("");
    }

    private static void mostraLetraCorrigida(int count, String letter) {
        if (count % 2 == 0) {
            System.out.print(letter.toUpperCase());
        } else {
            System.out.print(letter.toLowerCase());
        }
    }

    private static String lerFrase() throws IOException {
        return in.readLine();
    }
}
