package elte.list_1;

import java.util.*;

public class ArrayListExample {

    public static void arrayListAddAndGet() {
        List<Integer> arrayList = new ArrayList<>();
        Integer number = 1;

        arrayList.add(number);
        //Index of 0 means first element
        Integer retrievedNumber = arrayList.get(0);

        assert retrievedNumber.equals(number);
    }


    public static void arrayListAddAll() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayListToAdd = Arrays.asList(1, 2, 3);

        arrayList.addAll(arrayListToAdd);
        Integer retrievedNumber = arrayList.get(0);

        assert retrievedNumber.equals(1);
    }

    public static void arrayListRemove() {
        List<Integer> arrayList = Arrays.asList(1);

        Integer removedNumber = arrayList.remove(1);

        assert new Integer(1).equals(removedNumber);
    }

    public static void arrayListSize() {
        List<Integer> arrayList = new ArrayList<>();

        int size = arrayList.size();

        assert size == 0;
    }

    public static void arrayListIsEmpty() {
        List<Integer> arrayList = new ArrayList<>();

        boolean empty = arrayList.isEmpty();

        assert empty;
    }


    public static void arrayListContains() {
        List<Integer> arrayList = Arrays.asList(1);

        boolean contains = arrayList.contains(1);

        assert contains;
    }

    public static void arrayListClear() {
        List<Integer> arrayList = Arrays.asList(1);

        arrayList.clear();
        boolean contains = arrayList.contains(1);

        assert !contains;
    }


    public static void arrayListIndexOf() {
        List<Integer> arrayList = Arrays.asList(1);

        int indexOfOne = arrayList.indexOf(1);

        assert indexOfOne == 0;
    }

    public static void arrayListLastIndexOf() {
        List<Integer> arrayList = Arrays.asList(1, 1);

        int indexOfOne = arrayList.lastIndexOf(1);

        assert indexOfOne == 1;
    }


    public static void arrayListToArray() {
        List<Integer> arrayList = Arrays.asList(1);

        Object[] array = arrayList.toArray();

        Integer[] integers = arrayList.toArray(new Integer[0]);
    }


}
