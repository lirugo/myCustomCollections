package com.lirugo;

import com.lirugo.collection.list.ArrayList;
import com.lirugo.collection.list.List;

class Main {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        System.out.println(l.size());
        l.add("String 1");
        System.out.println(l.size());

        System.out.println(l.get(0));
    }
}