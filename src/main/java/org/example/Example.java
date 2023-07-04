package org.example;
interface Printing{
    void print();
}
public class Example {
    public static void main(String[] args) {
        Printing printer= MethodReference1::printAnything;
        printer.print();
    }
}
