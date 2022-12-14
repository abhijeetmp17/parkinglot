package com.pgcode;

import com.pgcode.allocateLot.Car_Parking;
import com.pgcode.allocateLot.Parking;
import com.pgcode.allocateLot.ParkingLot;
import com.pgcode.vehicles.Car;
import com.pgcode.vehicles.FactoryClass;
import com.pgcode.vehicles.Vehicle;

import java.util.Date;
import java.util.Scanner;

/**
 * Parking Lot Problem statement:
 * <p>
 * For now kindly consider only single floor parking lot.
 * <p>
 * 1. When a car enters a parking lot a Parking Ticket is generated. 2. Vehicle
 * registration number, colour and type is recorded. (bike, car, bus or truck)
 * 3. Vehicle is parked in a specific parking slot. 4. When vehicle is about to
 * leave the charges are calculated for the time vehicle was parked. 5. Parking
 * Ticket is submitted which is used to calculate the charges and then Parking
 * Reciept is generated which is equivalent to invoice. 6. Default parking
 * charges for bike, car is 30 Rs for 2 hrs and later it is charged as 10 per
 * hour. 7. Default parking charges for bus and truck is 100 Rs for 2 hrs and
 * later it is charged as Rs 30 per hour.
 */
public class App {
    public static void main(String[] args) {

//		/*
//		car generated information taken
//		 */
//        Car v1 = new Car("MH 12 CJ 20220", "Red");
//	/*
//		Allocation of parking lot
//	 */
//        ParkingLot p = new ParkingLot();
//        String lot_Name = p.getLotName(v1);
//
//		/*
//		creation of parking ticket
//		 */
//
//        ParkingTicket ticket = new ParkingTicket(100, v1, new Date(), lot_Name);
//        Car_Parking cp = new Car_Parking();
//
//
//        Integer slot_no = cp.allocate_parking_no(ticket);
//        System.err.println(slot_no);
//
//        ticket.setSlot_no(slot_no);
//
////		Boolean b = cp.de_allocate_parking_no(ticket);
////		ticket.setExit(b);
//        System.out.println(ticket);
//
//		/*
//		New Car Added
//		 */
//
//        Car c2 = new Car("MH 14 CJ 2020", "golden");
//
//        String lot_Name1 = p.getLotName(c2);
//        ParkingTicket ticket1 = new ParkingTicket(200, c2, new Date(), lot_Name1);
//
//
//        Integer slot_no1 = cp.allocate_parking_no(ticket1);
//        ticket1.setSlot_no(slot_no1);
//        System.err.println(slot_no1);
//
//        System.out.println(ticket1);
//

        //=============================================================

        while(true) {
            //1
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Vehicle Type");
            String type = sc.nextLine();
            //2
            Vehicle v = FactoryClass.getInstance(type);
            System.out.println(v);
            //3
            ParkingLot p = new ParkingLot();
            String lot_Name = p.getLotName(type);
            System.out.println(lot_Name);
            //4
            System.out.println("Enter Registration no :");
           Integer reg_no =  sc.nextInt();
            ParkingTicket ticket = new ParkingTicket(reg_no, v, new Date());

            Parking cp = Parking.getInstance(lot_Name);


            Integer slot_no = cp.allocate_parking_no(ticket);
            System.err.println("Slot Allocated :"+slot_no);


            ticket.setSlot_no(slot_no);
            try
            {
                Thread.sleep(1000);

            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println("==============================");

        }

    }
}
