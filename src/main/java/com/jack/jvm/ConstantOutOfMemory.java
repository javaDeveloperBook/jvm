package com.jack.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 测试常量溢出
 * @author: JackWu
 **/
public class ConstantOutOfMemory {
    public static void main(String[] args){
        System.out.println("---------ConstantOutOfMemory---------");
        while (true){
            List<String> list = new ArrayList<>();
            double item = Math.random() ;
            list.add(String.valueOf(item).intern());
        }
    }
}
