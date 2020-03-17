/*
 * 02 - Escreva um código que leia 3 números e depois imprima-os em ordem crescente.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class Ex2 {

    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        
        a = Integer.parseInt(s.readLine());
        b = Integer.parseInt(s.readLine());
        c = Integer.parseInt(s.readLine());
        if (a < b && a < c) {
            System.out.print(a + " ");
            if (b < c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(c + " " + b);
            }
        } else if (b < a && b < c) {
            System.out.print(b + " ");
            if (a < c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(c + " " + a);
            }
        } else {
            System.out.print(c + " ");
            if (a < b) { 
                System.out.println(a + " " + b);
            } else {
                System.out.println(b + " " + a);
            }
        }
    }
}
