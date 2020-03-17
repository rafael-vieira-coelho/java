/*
 * É possível unir duas listas, gerando uma terceira lista.
 */
package testecollections;

import java.util.ArrayList;
import java.util.List;

public class Unindo_Listas {

    public static void main(String[] args) {
        //Following ways can be used for joining lists without modifying source list(s).
        List<String> listOne = new ArrayList();
        List<String> listTwo = new ArrayList();
                
        //First approach. Has more lines but easy to understand
        List<String> newList = new ArrayList();

        newList.addAll(listOne);
        newList.addAll(listTwo);

        //Second approach. Has one less line but less readable.
        List<String> newList2 = new ArrayList(listOne);

        newList.addAll(listTwo);
    }
}
