package com.pgcode;

import com.pgcode.vehicles.Car;
import com.pgcode.vehicles.Vehicle;

import java.util.Date;

public class ParkingTicket {

    private Integer Reg_no;
    private Vehicle v;


    private Date date;

    private String lot_name;

    private int slot_no;

    public void setSlot_no(int slot_no) {
        this.slot_no = slot_no;
    }

    public void setExit(boolean exit) {
        isExit = exit;
    }

    public int getSlot_no() {
        return slot_no;
    }

    public boolean isExit() {
        return isExit;
    }

    private boolean isExit = false;

    public void setReg_no(Integer reg_no) {
        Reg_no = reg_no;
    }

    public void setVehicle(Vehicle v) {
        this.v = v;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLot_name(String lot_name) {
        this.lot_name = lot_name;
    }

    public Integer getReg_no() {
        return Reg_no;
    }

    public ParkingTicket(Integer reg_no, Vehicle v, Date date) {
        Reg_no = reg_no;
        this.v = v;
        this.date = date;

    }

    public Vehicle getV() {
        return v;
    }

    public Date getDate() {
        return date;
    }

    public String getLot_name() {
        return lot_name;
    }

    public ParkingTicket(Integer reg_no, Vehicle v, Date date, String lot_name, int slot_no, boolean isExit) {
        Reg_no = reg_no;
        this.v = v;
        this.date = date;
        this.lot_name = lot_name;
        this.slot_no = slot_no;
        this.isExit = isExit;
    }

    @Override
    public String toString() {
        return "ParkingTicket{" +
                "Reg_no=" + Reg_no +
                ", Vehicle=" + v +
                ", date=" + date +
                ", lot_name='" + lot_name + '\'' +
                ", slot_no=" + slot_no +
                ", isExit=" + isExit +
                '}';
    }
}
