package com.ryan.javaSe.nio;

import java.nio.IntBuffer;

/**
 * @Auther:biexiande@hisense.com
 * @date:2017/12/27 16:25
 * @des
 */
public class TestIntBuffer {

    public static void main(String[] args) {
        // 分配新的int缓冲区，参数为缓冲区容量
        // 新缓冲区的当前位置将为零，其limit(限制位置)将为其容量capacity。
        //它将具有一个底层实现数组，其数组偏移量将为零。
        IntBuffer buffer = IntBuffer.allocate(8);

        for (int i = 0; i < buffer.capacity(); i++) {
            int j = 2 * i;
            // 将给定整数写入此缓冲区的当前位置，当前位置递增
            buffer.put(j);
        }

        // 重设此缓冲区，将limit设置为当前位置position，然后将当前位置position设置为0
        buffer.flip();

        // 查看在当前位置position和limit位置之间是否有元素
        while (buffer.hasRemaining()) {
            // 读取此缓冲区当前位置的整数，然后当前位置递增
            int j = buffer.get();
            System.out.print(j + "  ");
        }
    }
}