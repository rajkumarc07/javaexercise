package com.demo;

public class Arithmatic {

    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;

    }
    public static void main(String[] args){
    Arithmatic art = new Arithmatic();
    System.out.println("Addition of two number:"+art.add(5,7));
    System.out.println("Subtraction of two number:"+art.sub( 10, 2));
    System.out.println("Multiplication of two number:"+art.mul( 1, 7 ));
    System.out.println("Division of two nymbers:"+art.div( 5, 5));



    }
}