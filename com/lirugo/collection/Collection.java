package com.lirugo.collection;

public interface Collection<E> {
    int size();
    boolean isEmpty();
    boolean add(E e);
    boolean remove(int index);
    E get(int index);
}