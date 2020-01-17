package com.lirugo.collection.set;

public class ArraySet<E> implements Set<E>{
    private final static int DEFAULT_CAPACITY = 10;
    private E[] array;
    private int size = 0;

    public ArraySet() {
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
    public void remove(int removeIndex) {
        if(this.size > removeIndex) {
            E[] newArray = (E[]) new Object[this.size - 1];
            for (int i = 0, j = 0; i < this.size; i++)
                if (i != removeIndex) {
                    newArray[j] = this.array[i];
                    j++;
                }

            this.size--;
            this.array = newArray;
        }
    }

    @Override
    public void add(E e) {
        boolean contains = false;

        for(int i=0; i<this.size; i++)
            if(this.array[i].equals(e))
                contains = true;

        if(!contains) {
            this.array = this.array.length-1 == this.size ? this.grow() : this.array;
            this.array[size] = e;
            this.size++;
        }

    }

    @Override
    public String toString() {
        if(this.size == 0)
            return "[]";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");

            for(int i=0; i<this.size; i++)
                    sb.append(this.array[i].toString() + ", ");

            sb.replace(sb.length()-2, sb.length(), "");
            sb.append("]");
            return sb.toString();
        }

    }

    private E[] grow() {
        E[] newArray = (E[]) new Object[this.array.length + DEFAULT_CAPACITY];

        for(int i=0; i<this.array.length; i++)
            newArray[i] = this.array[i];

        return newArray;
    }
}
