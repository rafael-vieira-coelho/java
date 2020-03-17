/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author coelho
 */
public class Colecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LISTAS
        //ArrayList
        ArrayList<Integer> lista_numeros = new ArrayList();

        lista_numeros.add(6);
        lista_numeros.add(8);
        lista_numeros.add(3);

        for (int i = 0; i < lista_numeros.size(); i++) {
            System.out.println(lista_numeros.get(i));

        }

        System.out.println("=============");
        Iterator<Integer> it = lista_numeros.iterator();

        while (it.hasNext()) {
            int atual = it.next();

            if (atual == 8) {
                it.remove();
            }
        }
        Collections.sort(lista_numeros);

        for (Integer variavel : lista_numeros) {
            System.out.println(variavel);
        }
        //LinkedList
        LinkedList<Integer> lista2 = new LinkedList();

        //CONJUNTOS
        HashSet<String> conjunto = new HashSet();

        conjunto.add("verme");
        conjunto.add("verme");
        conjunto.add("Lumbriga");

        for (String string : conjunto) {
            System.out.println(string);
        }

        //MAPAS
    }

}
