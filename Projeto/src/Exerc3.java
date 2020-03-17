/*
   3) Verificar se um vetor de valores do tipo char é um palíndromo. 
   Um palíndromo é uma frase ou palavra que se pode ler, indiferentemente, 
   da esquerda para a direita ou vice-versa e o resultado é o mesmo. Ex: "Radar".

 */

public class Exerc3 {

    public static void main(String[] args) {
        String palavra = "radar";

        if (ehPalindromo(palavra)) {
            System.out.println("Sim, palíndromo.");
        } else {
            System.out.println("Não foi dessa vez que o palíndromo apareceu.");
        }
    }

    private static boolean ehPalindromo(String texto) {
        char[] vetor = texto.toLowerCase().toCharArray();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != vetor[vetor.length - 1 - i] && i != vetor.length / 2) {
                return false;
            }
        }
        return true;
    }

}
