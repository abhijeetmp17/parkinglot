package com.pgcode;

import java.util.Date;

public class ParkingTicket {
	
	private String ticket_No;
	private Date ticket_Date;
	private ParkingLot parkingLot;
	private Vehicle vehicle;
	
	
	
	//NoArg Constructor
	public ParkingTicket() {
		
	}


	//Constructor
	public ParkingTicket(String ticket_No, Date ticket_Date, ParkingLot parkingLot) {
		this.ticket_No = ticket_No;
		this.ticket_Date = ticket_Date;
		this.parkingLot = parkingLot;
	}


	
	
	
	
	
	public String getTicket_No() {
		return ticket_No;
	}


	public void setTicket_No(String ticket_No) {
		this.ticket_No = ticket_No;
	}


	public Date getTicket_Date() {
		return ticket_Date;
	}


	public void setTicket_Date(Date ticket_Date) {
		this.ticket_Date = ticket_Date;
	}


	public ParkingLot getParkingLot() {
		return parkingLot;
	}


	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	
	
	public Vehicle getVehicle() {
		return vehicle;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	@Override
	public String toString() {
		return "ParkingTicket [ticket_No=" + ticket_No + ", ticket_Date=" + ticket_Date + ", parkingLot=" + parkingLot
				+ ", vehicle=" + vehicle + "]";
	}


	
	
	
	
	
	

}
