package com.company;

public class Car {

    public String color =  "Red";
    public String model = "Nissan";
    public Wheel wheel;
    private Integer mileage = 0;

    Car(Wheel wheelType){

        wheel = wheelType;
    }

    public void changeColor(String color){
        this.color = color;
    }



}








