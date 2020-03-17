package Conjuntos;

import java.util.*;

public class ExemploDeSet {
  public static void main(String[] args) {
    Set<String> conjunto = new HashSet();
    
    conjunto.add("um");
    conjunto.add("dois");
    conjunto.add("três");
    conjunto.add("um");
    conjunto.add("um");
    Iterator iteConjunto = conjunto.iterator();
    
    while (iteConjunto.hasNext()) {
      System.out.println(iteConjunto.next());
    }
  }
}

