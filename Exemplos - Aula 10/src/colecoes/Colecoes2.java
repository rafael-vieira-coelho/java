/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.Properties;

/**
 *
 * @author coelho
 */
public class Colecoes2 {
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
