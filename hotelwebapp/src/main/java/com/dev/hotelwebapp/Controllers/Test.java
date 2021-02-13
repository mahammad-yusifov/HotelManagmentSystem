package com.dev.hotelwebapp.Controllers;

import java.sql.Timestamp;

public class Test {
    public Test(long clientId, Timestamp checkIn, Timestamp checkOut) {
        ClientId = clientId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private long ClientId;

    public Test(long clientId, boolean jaccuzi, boolean bacon, boolean cheese) {
        ClientId = clientId;
        this.jaccuzi = jaccuzi;
        this.bacon = bacon;
        this.cheese = cheese;
    }


    public boolean isJaccuzi() {
        return jaccuzi;
    }

    public void setJaccuzi(boolean jaccuzi) {
        this.jaccuzi = jaccuzi;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    private boolean jaccuzi;
    private boolean bacon;
    private boolean cheese;


    public Test() {
    }

    public long getClientId() {
        return ClientId;
    }

    public void setClientId(long clientId) {
        ClientId = clientId;
    }

    public Timestamp getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Timestamp checkIn) {
        this.checkIn = checkIn;
    }

    public Timestamp getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Timestamp checkOut) {
        this.checkOut = checkOut;
    }

    private java.sql.Timestamp checkIn;

    private java.sql.Timestamp checkOut;

}
