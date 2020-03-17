package aula7exemplos.aula6;

import java.io.BufferedReader;
import java.io.IOException;

public class Auxiliar {

    public static int menu(String opcoes, BufferedReader br) throws IOException {
        System.out.println(opcoes);
        String texto = br.readLine();

        int opcao = Integer.parseInt(texto);
        return opcao;
    }

}
