package com.lirugo;

import com.lirugo.collection.list.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();

        l.add("String 1");
        l.add("String 2");
        l.add("String 3");
        l.add("String 4");
        l.add("String 5");
        l.add("String 6");
        l.add("String 7");
        l.add("String 8");
        l.add("String 9");
        l.add("String 10");

        System.out.println(l.size());
        l.remove(5);
        System.out.println(l.size());

        System.out.println("______________________________");
        for(int i=0; i< l.size(); i++)
            System.out.println(l.get(i));
    }
}