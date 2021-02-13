package com.dev.hoteldb.Dao.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "check_in")
    private java.sql.Timestamp checkIn;

    @Column(name = "check_out")
    private java.sql.Timestamp checkOut;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "bed")
    private String bed;

    @Column(name = "room_no")
    private Integer roomNo;

    @Column(name = "meal")
    private String meal;

    public Reservation() {
    }

    public Reservation(Integer id, Integer clientId,  Integer roomNo) {
        this.id = id;
        this.clientId = clientId;
        this.roomNo = roomNo;
    }

    public Reservation(Integer clientId, Timestamp checkIn, Timestamp checkOut, String roomType, String bed, Integer roomNo, String meal) {
        this.id = id;
        this.clientId = clientId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomType = roomType;
        this.bed = bed;
        this.roomNo = roomNo;
        this.meal = meal;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public java.sql.Timestamp getCheckIn() {
        return this.checkIn;
    }

    public void setCheckIn(java.sql.Timestamp checkIn) {
        this.checkIn = checkIn;
    }

    public java.sql.Timestamp getCheckOut() {
        return this.checkOut;
    }

    public void setCheckOut(java.sql.Timestamp checkOut) {
        this.checkOut = checkOut;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBed() {
        return this.bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public Integer getRoomNo() {
        return this.roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    public String getMeal() {
        return this.meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }
}
