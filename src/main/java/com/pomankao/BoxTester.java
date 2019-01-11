package com.pomankao;

import java.util.*;

public class BoxTester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter object's length: ");
        float length = (float)scanner.nextInt();
        System.out.print(" Please enter object's width: ");
        float width = (float)scanner.nextInt();
        System.out.print(" Please enter object's height: ");
        int height = scanner.nextInt();

        if (new Box3().validate(length,width,height)) {
            new Box3().printBoxInfo();
        } else if (new Box5().validate(length,width,height)) {
            new Box5().printBoxInfo();
        } else {
            System.out.println("Sorry! There is no available box for your requirement.");
        }
    }
}
