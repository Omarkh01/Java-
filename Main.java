package com.Omarkhh;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] things = {"apples ", "noobs ", "bacon ", "pwnge ", "goAts "};
        List<String> list1 = new LinkedList<>();
        Collections.addAll(list1, things);

        String[] things2 = {"sausage ", "harrypotter ", "bacon ", "goats "};
        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2, things2);

        list1.addAll(list2);

        printMe(list1);
        removeStuff(list1, 2, 5);
        printMe(list1);
        reverseMe(list1);
    }
    public static void printMe(List<String> l) {
        for (String b : l)
            System.out.printf("%s", b);
        System.out.println();
    }
     public static void removeStuff(List<String> l, int from,int to){
        l.subList(from,to).clear();
    }
    private static void reverseMe(List<String> l){
        ListIterator<String> bobby = l.listIterator(l.size());
        while (bobby.hasPrevious())
            System.out.printf("%s",bobby.previous());
    }

}
