package com.jack.jvm;

import java.util.ArrayList;
import java.util.List;

class Person{
    private String name;
    private int age;
}
/**
 * 测试堆溢出
 * VM options：-verbose:gc -Xms1M -Xmx1M -Xss128k -XX:-PrintGCDetails
 * @author jackwu
 */
public class HeapOutOfMemory {
    public static void main( String[] args ) {
        System.out.println("---------HeapOutOfMemory---------");
        List<Person> persons = new ArrayList<>();
        int counter = 0 ;
        while (true){
            persons.add(new Person());
            System.out.println("Instance:" + (++counter));
        }
    }
}
