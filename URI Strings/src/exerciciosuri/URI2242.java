package exerciciosuri;// 2242 - Huaauhahhuahau (https://www.urionlinejudge.com.br/judge/pt/problems/view/2242)

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI2242 {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine().toLowerCase();
		char []nova = removeConsoantes(s);

		System.out.println(ehPalindromo(nova) ? "S" : "N");
	}

    private static boolean ehPalindromo(char[] nova) {
        boolean ok = true;

        for(int i = 0, j = nova.length - 1; i < j; i++, j--) {
            if(nova[i] != nova[j]) {
                ok = false;
                break;
            }
        }
        return ok;
    }

    private static char[] removeConsoantes(String s) {
        char []nova = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            
            if(ehVogal(charAt)) {
                nova[i] = charAt;
            }
        }
        return nova;
    }

    private static boolean ehVogal(char charAt) {
        return charAt == 'a' 
                || charAt == 'e' 
                || charAt == 'i' 
                || charAt == 'o' 
                || charAt == 'u';
    }

}