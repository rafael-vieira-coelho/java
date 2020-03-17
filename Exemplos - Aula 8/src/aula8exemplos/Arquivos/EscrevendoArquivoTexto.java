/*
 * Exemplo de como gravar texto em arquivo.
 */
package aula8exemplos.Arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author coelho
 */
public class EscrevendoArquivoTexto {

    public static void main(String[] args) {
        Pessoa ze = new Pessoa("Zé", 29, "Masculino");
        Pessoa maria = new Pessoa("Maria", 34, "Feminino");

        try {
            File f = new File("arquivo.txt");
            if (!f.exists()) {
                f.createNewFile();
            }
            try (FileWriter fw = new FileWriter(f);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw)) {
                pw.println(maria.toString());
                pw.println(ze.toString());
            }
            System.out.println("Dados salvos com sucesso: ");
            System.out.println(maria.toString());
            System.out.println(ze.toString());
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo arquivo.txt.");
        }
    }
}
