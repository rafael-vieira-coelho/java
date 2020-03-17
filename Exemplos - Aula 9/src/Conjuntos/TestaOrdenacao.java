/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

import java.util.*;

public class TestaOrdenacao {

    public static void main(String[] args) {
        List<String> listaDesordenada = new ArrayList();

        listaDesordenada.add("Jose");
        listaDesordenada.add("Maria");
        listaDesordenada.add("Joao");
        listaDesordenada.add("Airton");
        listaDesordenada.add("Zulima");

        System.out.println("Desordenada: ");
        for (String object : listaDesordenada) {
            System.out.println(object);
        }
        Collections.sort(listaDesordenada);
        System.out.println("\nOrdenada: ");
        for (String object : listaDesordenada) {
            System.out.println(object);
        }

    }
}
