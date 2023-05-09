package com.maksym.familybudget;

public class Distribution {
    private int eat;
    private int hygiene;
    private int study;
    private int fuel;
    private int safetyPillow;

    public Distribution(int eat, int hygiene, int study, int fuel, int safetyPillow) {
        this.eat = eat;
        this.hygiene = hygiene;
        this.study = study;
        this.fuel = fuel;
        this.safetyPillow = safetyPillow;
    }

    public void setEat(int eat) {
        this.eat = eat;
    }

    public void setHygiene(int hygiene) {
        this.hygiene = hygiene;
    }

    public void setStudy(int study) {
        this.study = study;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setSafetyPillow(int safetyPillow) {
        this.safetyPillow = safetyPillow;
    }

    public int getEat() {
        return eat;
    }

    public int getHygiene() {
        return hygiene;
    }

    public int getStudy() {
        return study;
    }

    public int getFuel() {
        return fuel;
    }

    public int getSafetyPillow() {
        return safetyPillow;
    }

}
