package org.example;
@FunctionalInterface
interface Square{
    int calculate(int x);
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        int n=5;
        Square square=x -> x*x;
        int ans= square.calculate(n);
        System.out.println(ans);
    }
}
