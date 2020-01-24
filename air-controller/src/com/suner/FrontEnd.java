package com.suner;

public class FrontEnd {
    public void Sleep(int seconds) {
        try {
            Thread.sleep (seconds * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public final static void Clear() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}
