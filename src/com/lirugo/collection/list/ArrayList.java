package com.lirugo.collection.list;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private E[] array;

    public ArrayList() {
        this.size = 0;
        this.array = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean add(E e) {
        this.array = this.array.length-1 == this.size ? this.grow() : this.array;

        this.array[size] = e;
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
        return this.array[index];
    }

    private E[] grow() {
        E[] newArray = (E[]) new Object[this.array.length + DEFAULT_CAPACITY];

        for(int i=0; i<this.array.length; i++)
            newArray[i] = this.array[i];

        return newArray;
    }
}
