package com.lirugo.collection.list;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private E[] elements;

    public ArrayList() {
        this.size = 0;
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(E e) {
        this.elements[size] = e;
        size++;
        return false;
    }

    @Override
    public boolean remove(int index) {
        size--;
        return false;
    }

    @Override
    public E get(int index) {
        return this.elements[index];
    }
}
