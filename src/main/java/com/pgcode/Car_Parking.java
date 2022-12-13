package com.pgcode;

import java.util.ArrayList;
import java.util.List;

public class Car_Parking {
    Integer[] parking_no = new Integer[10];

    public int allocate_parking_no(ParkingTicket pt) {
        for (int i = 0; i < parking_no.length; i++) {
            if (parking_no[i] == null) {
                parking_no[i] = pt.getReg_no();
                return i;
            }
        }
        return 0;
    }

    public boolean de_allocate_parking_no(ParkingTicket pt) {
        for (int i = 0; i < parking_no.length; i++) {
            if (parking_no[i] == pt.getReg_no()) {
                parking_no[i] = null;
                return true;
            } else {
                return false;
            }

        }
        return false;
    }


}
