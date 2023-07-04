package org.example;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        new Thread(()->System.out.println("Thread is started: using Lambda Expressions")).start();
        // old way
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is started: using old method");
            }
        }).start();
    }
}
