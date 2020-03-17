/*
 * É possível obter um intervalo de objetos da lista
 */
package testecollections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author coelho
 */
public class Recortando_Lista {

    public static void main(String[] args) {
        //List subList(int fromIndex, int toIndex)

        //If the list doesn't exist in the give range, it throws IndexOutofBoundException.
        //What ever changes made on the list1 will impact the same changes in the list.This is called backed collections.
        //If the fromnIndex is greater than the toIndex (fromIndex > toIndex) it throws IllegalArgumentException.
        //Example:
        List<String> list = new ArrayList();
        
        list.add("Hello1");
        list.add("Hello2");
        list.add("Hello3");
        list.add("Hello4");
        System.out.println("List1 " + list);
        List<String> list2 = list.subList(1, 2);

        list2.add("Hello3");
        System.out.println("List2: " + list2);
        
        //Existem os métodos subSet e subMap que são similares para conjuntos e mapas        
    }
}