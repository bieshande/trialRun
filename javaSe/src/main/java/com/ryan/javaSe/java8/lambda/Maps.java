package com.ryan.javaSe.java8.lambda;

import java.util.HashMap;

/**
 * @Auther:biexiande@hisense.com
 * @date:2018/2/23 16:12
 * @des
 */
public class Maps {

    public static void main(String[] args) {
        java.util.Map map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((id, val) -> System.out.println(val)) ;
    }
}