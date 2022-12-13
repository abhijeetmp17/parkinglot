package com.pgcode;

public class Car extends Vehicle {
	
	

	public Car(String car_No , String type) {
		super(car_No,type);
		
	}

	@Override
	public ParkingTicket park_Vehicle(ParkingTicket parkingTicket) {
		
		String[] parking_No = parkingTicket.getParkingLot().getParking_No();
		
		for (int i = 0; i < parking_No.length; i++) {
			
			if (parking_No[i]==null) {
				
				parking_No[i]="reserved";
				break;
			}
			
		}
		
		
		
		return parkingTicket;
	}
	

	@Override
	public String toString() {
		return "Car []";
	}

	
	
	

	

	
	
	
}
