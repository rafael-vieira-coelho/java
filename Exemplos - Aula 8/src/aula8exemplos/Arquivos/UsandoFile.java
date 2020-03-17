/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8exemplos.Arquivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author coelho
 */
public class UsandoFile {

    public static void main(String[] args) throws IOException {
        // Representa um arquivo ou diretório
        File f = new File("log.txt");

        //criando um arquivo em um diretório específico
        //File folder = new File("C:/");
        //File fileInFolder = new File(folder, "io.txt");
        File fileInFolder = new File("io2.txt");

        //verificando se um arquivo existe
        if (fileInFolder.exists()) {
            //apagando um arquivo
            boolean deleted = fileInFolder.delete();

            if (deleted) {
                System.out.println("Arquivo apagado.");
            }
        } else {
            fileInFolder.createNewFile();
            System.out.println("Arquivo criado.");
        }
        /*
boolean canRead() -> retorna true se for possível ler o arquivo, falso o contrário
boolean canWrite() -> retorna true se for possível escrever no arquivo, falso o contrário
boolean exists() -> retorna true se o diretório ou arquivo se o objeto File existe, falso o contrário
boolean isFile() -> retorna true se é um arquivo, falso o contrário
boolean isDirectory() -> retorna true se é um diretório, falso o contrário
String getAbsolutePath() -> retorna uma String com o caminho absoluto do diretório ou arquivo
String getName() -> retorna uma String com o nome do arquivo ou do diretório
String getPath() -> retorna uma Sting com o caminho do arquivo ou diretório
String getParent() -> retorna uma String com o caminho do diretório pai (acima;anterior)
long length() -> retorna um tamanho, em bytes, do arquivo ou inexistente, caso seja diretório
long lastModified() -> retorna o tempo em que o arquivo/diretório foi modificado pela última vez
String[] list() -> retorna um array de Strings com o conteúdo do diretório, ou null se for arquivo
         */
    }
}
