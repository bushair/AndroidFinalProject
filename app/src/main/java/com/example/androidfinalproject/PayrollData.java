package com.example.androidfinalproject;

public class PayrollData {
    private String name;
    private String plate;
    private String job;

    public PayrollData() {
    }

    public PayrollData(String name, String plate, String job) {
        this.name = name;
        this.plate = plate;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
