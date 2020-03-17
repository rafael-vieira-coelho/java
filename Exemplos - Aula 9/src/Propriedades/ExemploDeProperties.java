package Propriedades;

import java.util.*;

public class ExemploDeProperties {
  public static void main(String[] args) {
    Properties p = System.getProperties();
    System.out.println("Todas as propriedades do sistema operacional:");
    System.out.println(p);
    System.out.println("Imprimindo propriedades isoladas:");
    System.out.println("Nome do SO: " + p.get("os.name"));
    System.out.println("Nome do Runtime: " + p.get("java.runtime.name"));
    System.out.println("País do usuário: " + p.get("user.country"));

  }
}
