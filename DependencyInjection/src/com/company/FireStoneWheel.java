package com.company;

public class FireStoneWheel implements Wheel{

    public Integer rim = 32;
    public String tread = "Rubber";
    public String rimColor = "Black";


    public Integer getSize(){
        return rim;
    }

    public void changeSize(Integer newSize){
        rim = newSize;
    }

    public String getWheelType(){
        return "FireStone";
    }

}
