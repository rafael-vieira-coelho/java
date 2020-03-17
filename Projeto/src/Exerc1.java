/*
1) Calcular a soma dos valores inteiros contidos em um vetor qualquer.

 */
public class Exerc1 {

    public static int somar(int []v) {
        int s = 0;

        for (int i = 0; i < v.length; i++) {
            s += v[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int []v = {12, 34, 5, 2};

        System.out.println("Soma: " + somar(v));
    }
}
