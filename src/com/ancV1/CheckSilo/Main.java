package com.ancV1.CheckSilo;

import com.ancV1.CheckSilo.Component.ApplicationRunner;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to CheckSilo programm.");
        ApplicationRunner.run();
    }
}