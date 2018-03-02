package com.example.demo.test;


public class BikeType {
    private int[] types;
    BikeType(){
        types=new int [12];
        for(int i=0;i<9;i++){
            types[i]=i;
        }
        for(int i=9;i<12;i++){
            types[i]=i-9;
        }
    }

    public int[] getTypes() {
        return types;
    }

    public void setTypes(int[] types) {
        this.types = types;
    }
}
