/*
 * Exemplo de como ler texto de arquivo.
 */
package aula8exemplos.Arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author coelho
 */
public class LendoArquivoTexto {
  
    public static void main(String[] args) {
        Pessoa maria, ze;

        try {
            File f = new File("arquivo.txt");
            if (f.exists()) {

                try (FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr)) {
                    String texto_lido = "", 
                            linha_lida = "";
                    
                    do {
                        linha_lida = br.readLine();
                        if (linha_lida != null) {
                            texto_lido += linha_lida + System.lineSeparator();
                        }
                    } while (linha_lida != null);
                    System.out.println("Dados lidos: ");
                    System.out.println(texto_lido);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao abrir o arquivo arquivo.bin.");
        }
    }
}

