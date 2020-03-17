/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;

import java.util.*;

public class ExemploDeMap {

    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap();        
        mapa.put("um", "Primeiro valor");
        mapa.put("dois", "Segundo valor");
        mapa.put("tres", "Terceiro valor");
        System.out.println("Valor recuperado: " + mapa.get("dois"));
        
        Set<String> chaves = mapa.keySet();
        Collection<String> valores = mapa.values();        
        System.out.println(chaves);
        System.out.println(valores);
    }
}
