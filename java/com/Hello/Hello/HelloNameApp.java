package com.Hello.Hello;

import java.util.Scanner;

public class HelloNameApp {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("id");
        String id = scanner.next();
        System.out.println("pw");
        String pw = scanner.next();
        System.out.println("name");
        String name = scanner.next();
        System.out.println("welcome" + " id " + id + "pw" + pw + "name" + name);
    }
    }


