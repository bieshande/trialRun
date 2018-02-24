package com.ryan.javaSe.java8.lambda;

import java.util.Optional;

/**
 * @Auther:biexiande@hisense.com
 * @date:2018/2/24 9:58
 * @des
 */
public class Optionals {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        System.out.println(optional.orElse("fallback"));    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }
}