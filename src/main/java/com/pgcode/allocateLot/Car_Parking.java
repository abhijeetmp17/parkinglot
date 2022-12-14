package com.pgcode.allocateLot;

import com.pgcode.ParkingTicket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car_Parking extends Parking {

   static Integer[] Car_parking_no = new Integer[10];

    public Integer allocate_parking_no(ParkingTicket pt) {
        for (int j = 0; j < Car_parking_no.length; j++) {
            if (Car_parking_no[j] == null) {
                Car_parking_no[j] = pt.getReg_no();
                System.out.println(Arrays.toString(Car_parking_no));
                return j;
            }
            else {
                continue;
            }
        }
        return null;
    }

    public boolean de_allocate_parking_no(ParkingTicket pt) {
        for (int i = 0; i < Car_parking_no.length; i++) {
            if (Car_parking_no[i] == pt.getReg_no()) {
                Car_parking_no[i] = null;
                return true;
            } else {
                return false;
            }

        }
        return false;
    }


}
