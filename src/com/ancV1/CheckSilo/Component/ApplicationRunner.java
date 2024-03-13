package com.ancV1.CheckSilo.Component;

public class ApplicationRunner {
    public static void run() {
        if(Authenticator.auth()){
            System.out.println("ok");
        }
    }
}
