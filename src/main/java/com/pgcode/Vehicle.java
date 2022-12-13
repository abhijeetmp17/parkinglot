package com.pgcode;

public abstract class Vehicle {

	
	private String vehicle_No;
	private String vehicle_Type;
	private ParkingTicket parkingTicket;
	
	public Vehicle(String vehicle_No, String vehicle_Type) {
		
		this.vehicle_No = vehicle_No;
		this.vehicle_Type = vehicle_Type;
	}
	
	
	public abstract ParkingTicket park_Vehicle(ParkingTicket parkingTicket);

	
	
	

	public String getVehicle_No() {
		return vehicle_No;
	}


	public void setVehicle_No(String vehicle_No) {
		this.vehicle_No = vehicle_No;
	}


	public String getVehicle_Type() {
		return vehicle_Type;
	}


	public void setVehicle_Type(String vehicle_Type) {
		this.vehicle_Type = vehicle_Type;
	}


	public ParkingTicket getParkingTicket() {
		return parkingTicket;
	}


	public void setParkingTicket(ParkingTicket parkingTicket) {
		this.parkingTicket = parkingTicket;
	}


	@Override
	public String toString() {
		return "Vehicle [vehicle_No=" + vehicle_No + ", vehicle_Type=" + vehicle_Type + ", parkingTicket="
				+ parkingTicket + "]";
	}
	
	
	
	
	
	
	
}
