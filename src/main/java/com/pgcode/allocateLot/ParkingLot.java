package com.pgcode.allocateLot;

import com.pgcode.vehicles.Car;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {


    private final int lot_no = 1;

    static Map<String, String> lot = new HashMap<String, String>();

   static {
        lot.put("Car", "Car_Parking");
        lot.put("Truck", "Truck_Parking");
        lot.put("Bicycle", "Bicycle_Parking");
        lot.put("Bus", "Bus_Parking");
    }


    public String getLotName(String str) {
        if(str.equals("Car"))
        {
            return lot.get(str);
        }
        return null;
    }


}
