package com.lirugo.collection.list;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void remove(){
        List<Integer> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        List<Object> arrayList3 = new ArrayList<>();

        assertEquals(arrayList1.size(), 0);
        assertEquals(arrayList2.size(), 0);
        assertEquals(arrayList3.size(), 0);

        arrayList1.add(1);
        arrayList2.add("1");
        arrayList3.add(new Object());

        assertEquals(arrayList1.size(), 1);
        assertEquals(arrayList2.size(), 1);
        assertEquals(arrayList3.size(), 1);

        arrayList1.remove(0);
        arrayList2.remove(0);
        arrayList3.remove(0);

        assertEquals(arrayList1.size(), 0);
        assertEquals(arrayList2.size(), 0);
        assertEquals(arrayList3.size(), 0);
    }

    @Test
    public void size(){
        List<Integer> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        List<Object> arrayList3 = new ArrayList<>();

        assertEquals(arrayList1.size(), 0);
        assertEquals(arrayList2.size(), 0);
        assertEquals(arrayList3.size(), 0);

        arrayList1.add(1);
        arrayList2.add("1");
        arrayList3.add(new Object());

        assertEquals(arrayList1.size(), 1);
        assertEquals(arrayList2.size(), 1);
        assertEquals(arrayList3.size(), 1);
    }

    @Test
    public void addAndGet(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("0");
        arrayList.add("1");
        arrayList.add("2");

        assertEquals(arrayList.get(0), "0");
        assertEquals(arrayList.get(1), "1");
        assertEquals(arrayList.get(2), "2");
    }

    @Test
    public void isEmpty(){
        List<Integer> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        List<Double> arrayList3 = new ArrayList<>();

        assertTrue(arrayList1.isEmpty());
        assertTrue(arrayList2.isEmpty());
        assertTrue(arrayList3.isEmpty());

        arrayList1.add(1);
        arrayList2.add("1");
        arrayList3.add(1d);

        assertFalse(arrayList1.isEmpty());
        assertFalse(arrayList2.isEmpty());
        assertFalse(arrayList3.isEmpty());
    }

}
