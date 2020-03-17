/*
 * Exemplo de como gravar objetos em arquivos binários.
 */
package aula8exemplos.Arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author coelho
 */
public class EscrevendoArquivoBinario {

    public static void main(String[] args) {
        Pessoa ze = new Pessoa("Zé", 29, "Masculino");
        Pessoa maria = new Pessoa("Maria", 34, "Feminino");

        try {
            File f = new File("arquivo.bin");
            if (!f.exists()) {
                f.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(maria);
                oos.writeObject(ze);
            }
            System.out.println("Dados salvos com sucesso: ");
            System.out.println(maria.toString());
            System.out.println(ze.toString());
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo arquivo.bin.");
        }
    }
}
