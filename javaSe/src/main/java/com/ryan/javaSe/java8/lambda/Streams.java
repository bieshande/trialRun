package com.ryan.javaSe.java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:biexiande@hisense.com
 * @date:2018/2/23 16:07
 * @des
 */
public class Streams {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        //filter
        stringCollection
                .stream()
                .filter((s) -> !s.startsWith("a"))
                .forEach(System.out::println);
        //sorted
        System.out.println("**********************************");
        stringCollection
                .stream()
                .sorted()
                //.filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        System.out.println(stringCollection);  //不改变原来的顺序

        //map
        System.out.println("**********************************");
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        //match
        System.out.println("**********************************");
        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA);      // true

        boolean allStartsWithA =
                stringCollection
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA);      // false

        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ);      // true

        //count
        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();

        System.out.println(startsWithB);    // 3
    }
}