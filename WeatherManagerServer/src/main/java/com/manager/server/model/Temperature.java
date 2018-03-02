package com.manager.server.model;

public class Temperature {
    private int temp00;
    private int temp02;
    private int temp04;
    private int temp06;
    private int temp08;
    private int temp10;
    private int temp12;
    private int temp14;
    private int temp16;
    private int temp18;
    private int temp20;
    private int temp22;

    public Temperature (){
        temp00 = 0;
        temp02 = 0;
        temp04 = 0;
        temp06 = 0;
        temp08 = 0;
        temp10 = 0;
        temp12 = 0;
        temp14 = 0;
        temp16 = 0;
        temp18 = 0;
        temp20 = 0;
        temp22 = 0;
    }

    public Temperature (int [] temp) {
        temp00 = temp[0];
        temp02 = temp[1];
        temp04 = temp[2];
        temp06 = temp[3];
        temp08 = temp[4];
        temp10 = temp[5];
        temp12 = temp[6];
        temp14 = temp[7];
        temp16 = temp[8];
        temp18 = temp[9];
        temp20 = temp[10];
        temp22 = temp[11];
    }

    public void setTemperature (int [] temp){
        temp00 = temp[0];
        temp02 = temp[1];
        temp04 = temp[2];
        temp06 = temp[3];
        temp08 = temp[4];
        temp10 = temp[5];
        temp12 = temp[6];
        temp14 = temp[7];
        temp16 = temp[8];
        temp18 = temp[9];
        temp20 = temp[10];
        temp22 = temp[11];
    }

    public int[] getTemperature(){
        int [] temp = new int[12];
        temp[0] = temp00;
        temp[1] = temp02;
        temp[2] = temp04;
        temp[3] = temp06;
        temp[4] = temp08;
        temp[5] = temp10;
        temp[6] = temp12;
        temp[7] = temp14;
        temp[8] = temp16;
        temp[9] = temp18;
        temp[10] = temp20;
        temp[11] = temp22;
        return temp;
    }

    @Override
    public String toString() {
        String str = "";
        int[] array = this.getTemperature();
        for (int i = 0; i < array.length; i++) {
            str += String.format("%03d",array[i]);
        }
        return str;
    }

    public int getTemp00() {
        return temp00;
    }

    public void setTemp00(int temp00) {
        this.temp00 = temp00;
    }

    public int getTemp02() {
        return temp02;
    }

    public void setTemp02(int temp02) {
        this.temp02 = temp02;
    }

    public int getTemp04() {
        return temp04;
    }

    public void setTemp04(int temp04) {
        this.temp04 = temp04;
    }

    public int getTemp06() {
        return temp06;
    }

    public void setTemp06(int temp06) {
        this.temp06 = temp06;
    }

    public int getTemp08() {
        return temp08;
    }

    public void setTemp08(int temp08) {
        this.temp08 = temp08;
    }

    public int getTemp10() {
        return temp10;
    }

    public void setTemp10(int temp10) {
        this.temp10 = temp10;
    }

    public int getTemp12() {
        return temp12;
    }

    public void setTemp12(int temp12) {
        this.temp12 = temp12;
    }

    public int getTemp14() {
        return temp14;
    }

    public void setTemp14(int temp14) {
        this.temp14 = temp14;
    }

    public int getTemp16() {
        return temp16;
    }

    public void setTemp16(int temp16) {
        this.temp16 = temp16;
    }

    public int getTemp18() {
        return temp18;
    }

    public void setTemp18(int temp18) {
        this.temp18 = temp18;
    }

    public int getTemp20() {
        return temp20;
    }

    public void setTemp20(int temp20) {
        this.temp20 = temp20;
    }

    public int getTemp22() {
        return temp22;
    }

    public void setTemp22(int temp22) {
        this.temp22 = temp22;
    }
}
