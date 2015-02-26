package com.fanhl.test.t2015.t02.t20150226;

/**
 * Created by fanhl on 15/2/26.
 */
public class ComplicatingJavaDemo {
    public static void main(String[] args) throws Exception {
        int i = aMethod();
        System.out.println("结果:" + i);
    }

    private static int aMethod() throws InterruptedException {
        int a = 1;//step 1
        int b = 一段执行10秒的方法();//step 2
        int c = 一段执行15秒的方法();//step 3
        int d = b + c;//step 4
        return d;//step 5
    }

    private static int 一段执行10秒的方法() throws InterruptedException {
        loop(10);
        return 2;
    }

    private static int 一段执行15秒的方法() throws InterruptedException {
        loop(15);
        return 3;
    }

    private static void loop(int times) throws InterruptedException {
        for (int i = 0; i < times; i++) {
            System.out.println("loop " + i);
            Thread.sleep(1000);
        }
    }
}
