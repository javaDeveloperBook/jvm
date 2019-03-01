package com.jack.jvm;

/**
 * @description:
 * @author: JackWu
 * @create: 2019-03-01 14:46
 **/
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GC {
    public static void main(String args[]) {
        List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
        for(GarbageCollectorMXBean b : l) {
            System.out.println(b.getName());
        }
    }
}