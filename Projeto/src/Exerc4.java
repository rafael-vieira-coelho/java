/*
   4) Determinar a quantidade de vogais e de consoantes em um vetor de valores
   do tipo char. (solução)

 */

public class Exerc4 {

    public static void main(String[] args) {
        String texto = "Eu sou feliz";
        int v[] = contaLetras(texto);
        int vogais = v[0];
        int consoantes = v[1];

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }

    private static int [] contaLetras(String texto) {
        char[] palavra = texto.toLowerCase().toCharArray();
        int contaVogais = 0,
                contaConsoantes = 0;
        
        for (int i = 0; i < palavra.length; i++) {
            char c = palavra[i];
            
            if (ehVogal(c)) {
                contaVogais++;
            } else if (Character.isLetter(c)) {
                contaConsoantes++;
            }
        }
        return new int[]{contaVogais, contaConsoantes};
    }

    public static boolean ehVogal(char c) {
        return c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


}
