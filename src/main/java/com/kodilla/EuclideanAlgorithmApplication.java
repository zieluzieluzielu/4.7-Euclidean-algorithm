package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EuclideanAlgorithmApplication {

    public static void main(String[] args) {

        int a = 20;
        int b = 4;

        while(a!=b) {
            if (a>b) {
                a-=b;
            }
            else if (a<b) {
                b-=a;
            }
        }
        System.out.println("The greatest common divisor is: "+a);
    }

}
