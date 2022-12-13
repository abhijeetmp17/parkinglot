package com.pgcode;

import java.util.Arrays;

public class ParkingLot {
	
	
	private Vehicle vehicle;
	
	private final String[] parking_No = new String[10];

	public ParkingLot(Vehicle vehicle) {
		this.vehicle = vehicle;
		
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String[] getParking_No() {
		return parking_No;
	}

	@Override
	public String toString() {
		return "ParkingLot [vehicle=" + vehicle.getVehicle_No()+","+vehicle.getVehicle_Type()+"," + " parking_No=" + Arrays.toString(parking_No) + "]";
	}
	
	

	

	

	
	
	
	

	
	
	
	
	
	
	

}
