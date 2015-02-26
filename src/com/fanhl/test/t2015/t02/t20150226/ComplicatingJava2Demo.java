package com.fanhl.test.t2015.t02.t20150226;

/**
 * Created by fanhl on 15/2/26.
 */
public class ComplicatingJava2Demo {
    public static void main(String[] args) throws InterruptedException {
        int i = aMethod();
        System.out.println("结果:" + i);
    }

    static int b;//step 2.1
    static int c;//step 3.1

    private static int aMethod() throws InterruptedException {
        int a = 1;//step 1


        Thread t1 = new Thread(() -> b = 一段执行10秒的方法());//step 2.2
        t1.start();//step 2.3
        
        Thread t2 = new Thread(() -> c = 一段执行15秒的方法());//step 3.2
        t2.start();//step 3.3

        t1.join();//step 2.4
        t2.join();//step 3.4

        int d = b + c;//step 4
        return d;//step 5
    }

    private static int 一段执行10秒的方法() {
        loop(10);
        return 2;
    }

    private static int 一段执行15秒的方法() {
        loop(15);
        return 3;
    }

    private static void loop(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("loop " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
