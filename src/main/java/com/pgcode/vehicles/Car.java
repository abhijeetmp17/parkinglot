package com.pgcode.vehicles;

public class Car implements Vehicle{

    private String car_no;

    private String car_colour;

    private final String type = "Car";


    public String getCar_colour() {
        return car_colour;
    }


    public String getCar_no() {
        return car_no;
    }

    public void setCar_no(String car_no) {
        this.car_no = car_no;
    }

    public void setCar_colour(String car_colour) {
        this.car_colour = car_colour;
    }


    @Override
    public String toString() {
        return "Car{" +
                "car_no='" + car_no + '\'' +
                ", car_colour='" + car_colour + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Car(String car_no, String car_colour) {
        this.car_no = car_no;
        this.car_colour = car_colour;
    }

    public String getType() {
        return type;
    }



}
