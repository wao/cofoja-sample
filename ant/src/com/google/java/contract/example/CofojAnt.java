package com.google.java.contract.example;

import com.google.java.contract.Requires;


public class CofojAnt{

    @Requires("a<3")
    public int s(int a){
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.

        CofojAnt obj = new CofojAnt();
        obj.s(5);
    }
}
