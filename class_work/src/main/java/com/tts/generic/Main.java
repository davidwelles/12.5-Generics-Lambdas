package com.tts.generic;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // this is acting as a regular method
    // but the return type is set up as a generic
    // meaning we can pass in the return type depending on the list argument
    public static <W> void printList(List<W> list) {
        for (W element: list) {
            System.out.println(element);
        }
    }

    public static <T> T returnValue(T myValue) {
        return myValue;
    }

    public static <T extends Comparable<T>> int greaterThan(T[] numArray, T elem) {
        int count = 0;
        for (T e : numArray) {
            if (e.compareTo(elem) > 0)
                ++count;
        }
            return count;

    }

    public static void main(String[] args) {

        // this is how we instantiate an arraylist
        // take note of the generic in the diamond <>
        // we use this generic to define a type in the interface List
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(45);
        integerList.add(3);
        integerList.add(645);

        printList(integerList);

        System.out.println(returnValue("Hello"));
        System.out.println(returnValue(4000));


    }
}
