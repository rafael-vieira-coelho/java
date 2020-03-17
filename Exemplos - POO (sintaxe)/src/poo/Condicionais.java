package poo;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um valor: ");
        int x = sc.nextInt();

        //Exemplo de SE-ENTÃO
        if (x >= 10) {
            System.out.println("O valor " + x + " é maior ou igual a dez.");
        } else {
            System.out.println("Valor menor que dez.");
        }
        
        //Exemplo de ESCOLHA-CASO
        switch (x) {
            case 10: {
                System.out.println("valor igual a dez");                 
                break;
            }
            case 11: System.out.println("valor igual a onze"); break;
            case 13: System.out.println("valor igual a treze"); break;
            default: System.out.println("outro valor");
        }
    }
}
