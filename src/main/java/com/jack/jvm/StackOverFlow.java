package com.jack.jvm;

/**
 * @description: 测试栈溢出
 * VM options：-verbose:gc -Xms1M -Xmx1M -Xss128k -XX:-PrintGCDetails
 * @author: JackWu
 **/
public class StackOverFlow {
    private int count;
    public static void main(String[] args){
        System.out.println("---------StackOverFlow---------");
        StackOverFlow stack = new StackOverFlow();
        stack.count();
    }
    public void count(){
        System.out.println("counter : " + (++count));
        count();
    }
}
