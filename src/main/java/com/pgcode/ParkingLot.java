package com.pgcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {


    private final int lot_no = 1;

    static Map<String, String> lot = new HashMap<String, String>();

    ParkingLot() {
        lot.put("car", "Car_Parking");
        lot.put("truck", "truck_parking");
        lot.put("motorcycle", "motorcycle_parking");
        lot.put("cycle", "cycle_parking");

    }


    public String getLotName(Car v) {
        if (v != null) {
            System.out.println(lot);
            String type = v.getType();
            String allocated_lot = lot.get(type);
            return allocated_lot;


        } else return null;
    }


}
