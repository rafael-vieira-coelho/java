package poo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraEscrita {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Informe um texto: ");
        String texto = br.readLine();
        System.out.println("Informe um número inteiro: ");
        int inteiro = Integer.parseInt(br.readLine());
        System.out.println("Informe um número inteiro de dupla precisão: ");
        long inteiro_duplo = Long.parseLong(br.readLine());
        System.out.println("Informe um número em ponto flutuante: ");
        float real = Float.parseFloat(br.readLine());
        System.out.println("Informe um número em ponto flutuante de dupla precisão: ");
        double real_duplo = Double.parseDouble(br.readLine());
        System.out.println("Informe um caractere:");
        char caractere = br.readLine().charAt(0);

        System.out.println(" Int: " + valorInteiro 
                        + " Long: " + valorLong
                        + " Float: " + valorReal
                        + " Double: " + valorDouble
                        + " Frase: " + frase
                        + " Palavra: " + palavra
                        + " Caractere: " + caractere);
    }
}
