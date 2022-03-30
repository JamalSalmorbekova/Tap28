package com.company;
import  java.util.function.UnaryOperator;
public class Main {

    public static void main(String[] args) {
        System.out.println(sqrt().apply(73.6));


    }
    public static UnaryOperator sqrt() {
        UnaryOperator sqrtRoot = (x) -> (Math.sqrt((Double) x));
        return sqrtRoot;
    }

}
