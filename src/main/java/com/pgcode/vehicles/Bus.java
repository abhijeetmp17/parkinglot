package com.pgcode.vehicles;

public class Bus implements Vehicle
{

    private String bus_no;

    private String bus_colour;

    private final String type = "Bus";
    Bus()
    {

    }

    public String getBus_no() {
        return bus_no;
    }

    public String getBus_colour() {
        return bus_colour;
    }

    public String getType() {
        return type;
    }

    public void setBus_no(String bus_no) {
        this.bus_no = bus_no;
    }

    public void setBus_colour(String bus_colour) {
        this.bus_colour = bus_colour;
    }

    public Bus(String bus_no, String bus_colour) {
        this.bus_no = bus_no;
        this.bus_colour = bus_colour;
    }
}
