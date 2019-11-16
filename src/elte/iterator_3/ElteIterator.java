package elte.iterator_3;

import java.util.List;

public class ElteIterator<T> {

    private final List<T> elements;

    public ElteIterator(List<T> elements) {

        this.elements = elements;
    }

    public boolean hasNext() {
        return elements.size() != 0;
    }

    public T next() {
        return elements.get(0);
    }

    public void remove() {
        elements.remove(0);
    }


}
