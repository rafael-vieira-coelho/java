/*
    Existem várias formas de iteração em coleções
 */
package testecollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author coelho
 */
public class Iterando_Colecoes {

    public static void main(String[] args) {
        /////////////////////////////
        //INTERAGINDO EM UMA LISTA //
        /////////////////////////////
        List<String> names = new ArrayList(Arrays.asList("Clementine", "Duran", "Mike"));

        //Java 1.2
        Iterator<String> listIterator = names.iterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        //Java 5
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        //Java 5
        for (String name : names) {
            System.out.println(name);
        }
        //Java 8
        names.forEach(System.out::println);

        ///////////////////////////
        //INTERAGINDO EM UM MAPA //
        ///////////////////////////        
        Map<Integer, String> names2 = new HashMap();

        names2.put(1, "Clementine");
        names2.put(2, "Duran");
        names2.put(3, "Mike");

        //Java 5
        for (Map.Entry<Integer, String> entry : names2.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        for (Integer key : names2.keySet()) {
            System.out.println(key);
        }
        for (String value : names2.values()) {
            System.out.println(value);
        }
        //Java 5
        Iterator entries = names2.entrySet().iterator();
        
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //Java 8
        names2.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

    }
}
