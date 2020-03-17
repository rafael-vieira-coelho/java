package poo;

public class LaçosRepetição {
    public static void main(String[] args) {
        //Exemplo de For
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " x 10 = " + (i*10));
        }

        //Exemplo de While
        int i = 0;
        
        while (i < 10) {
            System.out.println(i + " x 10 = " + (i*10));
             i++;
        }
        
        //Exemplo de Do-While
        i = 0;
        
        do {
            System.out.println(i + " x 10 = " + (i*10));
            i++;
        } while (i < 10);        
    }
}
