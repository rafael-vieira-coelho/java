/*
 Exercícios Complementares

2) Crie um programa principal no qual sejam armazenados em um mapa os itens 
que serão comprados e a quantidade dos mesmos (devem ser solicitados para o 
usuário). Por fim, mostre o conteúdo de sua lista de compras na tela.
 */
package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class Exerc2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> compras = new HashMap();
        boolean comprar_mais = false;
        
        do {
            System.out.println("Qual o produto?");
            String produto = s.next();
            System.out.println("Qual a quantidade?");
            int quantidade = s.nextInt();
            
            compras.put(produto, quantidade);
            System.out.println("Quer comprar mais[s/n]?");
            comprar_mais = s.next().toLowerCase().equals("s");
        } while (comprar_mais);
        
        for (Map.Entry<String, Integer> entry : compras.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            System.out.println(key + " - " + value);
        }
    }
}
