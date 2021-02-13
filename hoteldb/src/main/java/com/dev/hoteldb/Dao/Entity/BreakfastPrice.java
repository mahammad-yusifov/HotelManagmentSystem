package com.dev.hoteldb.Dao.Entity;

import javax.persistence.*;

@Entity
@Table(name = "breakfast_price")
public class BreakfastPrice {
    @Column(name = "bacon")
    private Integer bacon;

    @Column(name = "cheese")
    private Integer cheese;

    @Column(name = "pancake")
    private Integer pancake;

    @Column(name = "bread")
    private Integer bread;

    @Column(name = "egg")
    private Integer egg;

    @Column(name = "fired_bread")
    private Integer firedBread;

    @Column(name = "muffin")
    private Integer muffin;
    @Id
    private Integer id;

    public Integer getBacon() {
        return this.bacon;
    }

    public void setBacon(Integer bacon) {
        this.bacon = bacon;
    }

    public Integer getCheese() {
        return this.cheese;
    }

    public void setCheese(Integer cheese) {
        this.cheese = cheese;
    }

    public Integer getPancake() {
        return this.pancake;
    }

    public void setPancake(Integer pancake) {
        this.pancake = pancake;
    }

    public Integer getBread() {
        return this.bread;
    }

    public void setBread(Integer bread) {
        this.bread = bread;
    }

    public Integer getEgg() {
        return this.egg;
    }

    public void setEgg(Integer egg) {
        this.egg = egg;
    }

    public Integer getFiredBread() {
        return this.firedBread;
    }

    public void setFiredBread(Integer firedBread) {
        this.firedBread = firedBread;
    }

    public Integer getMuffin() {
        return this.muffin;
    }

    public void setMuffin(Integer muffin) {
        this.muffin = muffin;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
