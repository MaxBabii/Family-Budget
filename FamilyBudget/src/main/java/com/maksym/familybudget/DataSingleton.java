package com.maksym.familybudget;

public class DataSingleton {
    private static final DataSingleton instance = new DataSingleton();
    private int enterField;

    private DataSingleton(){}

    public static DataSingleton getInstance(){
        return instance;
    }
    public void setEnterField(int enterField){
        this.enterField = enterField;
    }
    public int getEnterField(){
        return enterField;
    }
}
