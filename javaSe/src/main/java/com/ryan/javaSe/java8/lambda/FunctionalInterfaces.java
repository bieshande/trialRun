package com.ryan.javaSe.java8.lambda;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @Auther:biexiande@hisense.com
 * @date:2018/2/23 16:04
 * @des
 */
public class FunctionalInterfaces {

    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }

    public static void main(String[] args) {

        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);   // 123













        Predicate<String> predicate = (s) -> s.length() > 0;

        System.out.println(predicate.test("foo"));              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}