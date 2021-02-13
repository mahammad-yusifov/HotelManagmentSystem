package com.dev.hoteldb.Dao.Entity;

import javax.persistence.*;

@Entity
@Table(name = "room_price")
public class RoomPrice {
    @Column(name = "air_conditioner")
    private Integer airConditioner;

    @Column(name = "smart_tv")
    private Integer smartTv;

    @Column(name = "jacuzzi")
    private Integer jacuzzi;

    @Column(name = "bed_single")
    private Integer bedSingle;

    @Column(name = "bed_double")
    private Integer bedDouble;
    @Id
    private Integer id;

    public RoomPrice() {
    }

    public RoomPrice(Integer airConditioner, Integer smartTv, Integer jacuzzi, Integer bedSingle, Integer bedDouble, Integer id) {
        this.airConditioner = airConditioner;
        this.smartTv = smartTv;
        this.jacuzzi = jacuzzi;
        this.bedSingle = bedSingle;
        this.bedDouble = bedDouble;
        this.id = id;
    }

    public Integer getAirConditioner() {
        return this.airConditioner;
    }

    public void setAirConditioner(Integer airConditioner) {
        this.airConditioner = airConditioner;
    }

    public Integer getSmartTv() {
        return this.smartTv;
    }

    public void setSmartTv(Integer smartTv) {
        this.smartTv = smartTv;
    }

    public Integer getJacuzzi() {
        return this.jacuzzi;
    }

    public void setJacuzzi(Integer jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public Integer getBedSingle() {
        return this.bedSingle;
    }

    public void setBedSingle(Integer bedSingle) {
        this.bedSingle = bedSingle;
    }

    public Integer getBedDouble() {
        return this.bedDouble;
    }

    public void setBedDouble(Integer bedDouble) {
        this.bedDouble = bedDouble;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
