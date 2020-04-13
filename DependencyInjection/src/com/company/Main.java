package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Car car = new Car(new GoodYearWheel());

       System.out.println(car.wheel.getWheelType());


    }

}


