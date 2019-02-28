package com.jack.jvm;

import java.nio.ByteBuffer;

/**
 * @description: 测试直接内存溢出
 * VM options : -verbose:gc  -XX:MaxDirectMemorySize=10M -Xss128k  -XX:-PrintGCDetails
 * @author: JackWu
 **/
public class DirectMemoryOutOfMemory {
    private static final int ONE_GB = 1024 * 1024 * 1024;
    public static void main(String[] args){
        System.out.println("---------DirectMemoryOutOfMemory---------");
        while (true){
            ByteBuffer buffer = ByteBuffer.allocateDirect(ONE_GB);
        }
    }
}
