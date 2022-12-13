package com.pgcode;

import java.util.Date;
import java.util.Iterator;

/**
 * Parking Lot Problem statement:
 * 
 * For now kindly consider only single floor parking lot.
 * 
 * 1. When a car enters a parking lot a Parking Ticket is generated. 2. Vehicle
 * registration number, colour and type is recorded. (bike, car, bus or truck)
 * 3. Vehicle is parked in a specific parking slot. 4. When vehicle is about to
 * leave the charges are calculated for the time vehicle was parked. 5. Parking
 * Ticket is submitted which is used to calculate the charges and then Parking
 * Reciept is generated which is equivalent to invoice. 6. Default parking
 * charges for bike, car is 30 Rs for 2 hrs and later it is charged as 10 per
 * hour. 7. Default parking charges for bus and truck is 100 Rs for 2 hrs and
 * later it is charged as Rs 30 per hour.
 *
 */
public class App {
	public static void main(String[] args) {

		Vehicle car = new Car("MH-13 BZ 1765", "Maruti_Car");
		Vehicle car2 = new Car("MH-14 HG 156", "Baleno");
		ParkingLot lot = new ParkingLot(car);
		ParkingLot lot2 = new ParkingLot(car2);
		Date date = new Date();
		ParkingTicket parkingTicket = new ParkingTicket("101", date, lot);
		ParkingTicket parkingTicket2 = new ParkingTicket("102", date, lot2);

		System.out.println(car.park_Vehicle(parkingTicket));
		System.out.println(car2.park_Vehicle(parkingTicket2));

	}
}
