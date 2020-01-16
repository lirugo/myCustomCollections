package com.lirugo.collection.list;

import com.lirugo.collection.Collection;

public interface List<E> extends Collection<E> {

    @Override
    default int size() { return 0; }

    @Override
    default boolean isEmpty() { return false; }

    @Override
    default boolean add(E o) { return false; }

    @Override
    default boolean remove(int index) { return false; }

    @Override
    default boolean get(int index) { return false; }

}