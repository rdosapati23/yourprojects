package com.rakesh.prime;

public class LaptopInfo {

    public static void main(String[] args) {
        Laptop l1 = new Laptop("lenovo", 80000, "i7", 16);
        System.out.println(l1);
        Laptop l2 = new Laptop("dell", 60000, "i5", 8);
        System.out.println(l2);
    }
}