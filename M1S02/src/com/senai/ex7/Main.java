package com.senai.ex7;

public class Main {
    public static void main(String[] args) {
        try {
            int b = 1 / 0;

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}