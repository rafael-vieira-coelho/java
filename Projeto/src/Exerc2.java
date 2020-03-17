/*
2) Localizar, em um vetor qualquer de valores inteiros,
um certo elemento deste, dado o seu valor.

 */
public class Exerc2 {

    public static boolean localizar(int []array, int valor) {
        for (int x: array) {
            if (x == valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v[] = {10, 20, 30, 40};

        if (localizar(v, 21)) {
            System.out.println("Valor encontrado!");
        } else {
            System.out.println("Não foi dessa vez, caro colega.");
        }
    }
}
