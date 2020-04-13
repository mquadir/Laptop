package com.company;

public class GoodYearWheel implements Wheel {

    public Integer rim = 14;
    public String tread = "Rubber";
    public String rimColor = "Silver";

     public Integer getSize(){
         return rim;
    }

    public void changeSize(Integer newSize){
         rim = newSize;
    }

    public String getWheelType(){
         return "GoodYear";
    }



}
