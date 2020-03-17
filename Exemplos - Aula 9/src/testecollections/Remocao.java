package testecollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remocao {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        // ERRADO: modifica o índice após a remoção
        // Pode gerar a exceção java.util.ConcurrentModificationException
        /*
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
            }
        }
         */
        Iterator<String> fruitIterator = fruits.iterator();

        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println(fruit);
            if ("Apple".equals(fruit)) {
                fruitIterator.remove();
            }
        }
        // Cuidado!! Não adicione elementos após obter o Iterator
        // Gera a exceção java.util.ConcurrentModificationException
        Iterator<String> fruitIterator2 = fruits.iterator();
        fruits.add("Watermelon");
        while (fruitIterator2.hasNext()) {
            System.out.println(fruitIterator2.next());//ConcurrentModificationException here
        }

        //Removendo e atualizando o índice para não dar erro
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
                i--;
            }
        }

        //Percorrendo de traz pra frente
        for (int i = (fruits.size() - 1); i >= 0; i--) {
            System.out.println(fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
            }
        }

        //Removendo, usando uma lista auxiliar
        ArrayList<String> shouldBeRemoved = new ArrayList();
        for (String str : fruits) {
            if ("Apple".equals(str)) {
                shouldBeRemoved.add(str);
            }
        }
        fruits.removeAll(shouldBeRemoved);
    }
}
