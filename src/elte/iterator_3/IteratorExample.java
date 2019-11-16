package elte.iterator_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorExample {

    public static void elteIteratorWhile() {
        ElteIterator<Integer> elteIterator = new ElteIterator<>(new ArrayList<>(Arrays.asList(1, 2, 3)));

        while (elteIterator.hasNext()) {
            System.out.println(elteIterator.next());
            elteIterator.remove();
        }
    }

    public static void iteratorExample() {
        List<Integer> exampleList = Arrays.asList(1, 2, 3);

        for (Integer number : exampleList) {
            System.out.println(number);
        }
    }

}
