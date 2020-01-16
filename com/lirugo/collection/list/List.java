package com.lirugo.collection.list;

import com.lirugo.collection.Collection;

public interface List<E> extends Collection<E> {

    @Override
    int size();

    @Override
    boolean isEmpty();

    @Override
    boolean add(E o);

    @Override
    boolean remove(int index);

    @Override
    E get(int index);

}