package com.pgcode.allocateLot;

import com.pgcode.ParkingTicket;
import com.pgcode.vehicles.Bicycle;
import com.pgcode.vehicles.Bus;
import com.pgcode.vehicles.Car;

public abstract class Parking {





    public abstract Integer allocate_parking_no(ParkingTicket pt) ;

    public abstract boolean de_allocate_parking_no(ParkingTicket pt) ;

    public static Parking getInstance(String str) {

        if (str.equals("Car_Parking")) {
            return new Car_Parking();


        } else if (str.equals("Bus_Parking")) {

            return null;
        } else if (str.equals("Bicycle_Parking")) {
            return null;
        } else {
            return null;
        }
    }
}


