package exerciciosuri;

// 2242 - Cryptotext (https://www.urionlinejudge.com.br/judge/en/problems/view/2866)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI2866 {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(r.readLine());

        for (int i = 0; i < C; i++) {
            char letras[] = r.readLine().toCharArray();
            char novas[] = new char[letras.length];
            int quantidade_minusculas = removeMaiusculas(letras, novas);
            
            mostraPalavra(quantidade_minusculas, novas);
        }

        char letra = 'A';

        if (Character.isLowerCase(letra)) {
            System.out.println("É minúscula");
        } else if (Character.isUpperCase(letra)) {
            System.out.println("É maiúscula");
        }
    }

    private static int removeMaiusculas(char[] letras, char[] novas) {
        int k = 0;
        for (int j = 0; j < letras.length; j++) {
            char letra = letras[j];
            
            if (Character.isLowerCase(letra)) {
                novas[k] = letra;
                k++;
            }
        }
        return k;
    }

    private static void mostraPalavra(int k, char[] novas) {
        for (int j = k - 1; j >= 0; j--) {
            System.out.print(novas[j]);
        }
        System.out.println("");
    }
}
