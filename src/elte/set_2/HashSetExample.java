package elte.set_2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void hashSetAdd() {
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        //Does not have get since it requires ordering. I.E. Cannot get 0th element of there is no order.
    }

    public static void hashSetUniqueness() {
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(1);
        int size = hashSet.size();

        assert size == 1;
    }

}
