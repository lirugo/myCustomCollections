package com.lirugo.collection.set;

public interface Set<E> {
    int size();

    boolean isEmpty();

    void remove(int removeIndex);

    void add(E e);
}
