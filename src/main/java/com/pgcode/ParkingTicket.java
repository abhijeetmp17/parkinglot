package com.pgcode;

import java.util.Date;

public class ParkingTicket {

    private Integer Reg_no;
    private Car car;


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

    public void setCar(Car car) {
        this.car = car;
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

    public Car getCar() {
        return car;
    }

    public Date getDate() {
        return date;
    }

    public String getLot_name() {
        return lot_name;
    }

    public ParkingTicket(Integer reg_no, Car car, Date date, String lot_name) {
        Reg_no = reg_no;
        this.car = car;
        this.date = date;
        this.lot_name = lot_name;
    }

    @Override
    public String toString() {
        return "ParkingTicket{" +
                "Reg_no=" + Reg_no +
                ", car=" + car +
                ", date=" + date +
                ", lot_name='" + lot_name + '\'' +
                ", slot_no=" + slot_no +
                ", isExit=" + isExit +
                '}';
    }
}
