/*
 * Exemplo de como ler objetos de arquivos binários.
 */
package aula8exemplos.Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author coelho
 */
public class LendoArquivoBinario {

    public static void main(String[] args) {
        Pessoa maria, ze;

        try {
            File f = new File("arquivo.bin");
            if (f.exists()) {

                try (FileInputStream fis = new FileInputStream(f);
                        ObjectInputStream ois = new ObjectInputStream(fis)) {
                    maria = (Pessoa) ois.readObject();
                    ze = (Pessoa) ois.readObject();
                    System.out.println("Dados lidos: ");
                    System.out.println(maria.toString());
                    System.out.println(ze.toString());
                } catch (ClassNotFoundException ex) {
                    System.err.println("Erro ao ler objeto de arquivo.bin.");
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao abrir o arquivo arquivo.bin.");
        }
    }
}
