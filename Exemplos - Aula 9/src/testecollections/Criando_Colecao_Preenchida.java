/*
 * Existem momentos em que sabemos qual o conteúdo de uma coleção.
 */
package testecollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author coelho
 */
public class Criando_Colecao_Preenchida {

    public static void main(String[] args) {
        //A simple way to construct a List from individual data values is to use
        //java.utils.Arrays method Arrays.asList:
        List<String> data = Arrays.asList("ab", "bc", "cd", "ab", "bc", "cd");

        //All standard collection implementations provide constructors that take
        //another collection as an argument adding all elements to the new 
        //collection at the time of construction:
        
        // will add data as is
        List<String> list = new ArrayList(data); 
        // will add data keeping only unique values
        Set<String> set1 = new HashSet(data); 
        // will add data keeping unique values and sorting
        SortedSet<String> set2 = new TreeSet(data); 
        // will add data keeping only unique values 
        // and preserving the original order
        Set<String> set3 = new LinkedHashSet(data); 

        //Similarly for maps, given a Map<String, Object> map a new map can be 
        //constructed with all elements as follows:
        Map<String, Object> map = new HashMap();
        Map<String, Object> map1 = new HashMap(map);
        SortedMap<String, Object> map2 = new TreeMap(map);
    }
}
