package com.dev.hoteldb.Dao.Entity;

import javax.persistence.*;

@Entity
@Table(name = "launch_price")
public class LaunchPrice {
    @Column(name = "rice")
    private Integer rice;

    @Column(name = "chicken")
    private Integer chicken;

    @Column(name = "burger")
    private Integer burger;

    @Column(name = "lobster_rolls")
    private Integer lobsterRolls;

    @Column(name = "pizza")
    private Integer pizza;

    @Column(name = "poutine")
    private Integer poutine;

    @Column(name = "fried_potato")
    private Integer friedPotato;

    @Column(name = "sloppy_joes")
    private Integer sloppyJoes;

    @Column(name = "utz")
    private Integer utz;

    @Column(name = "macaroni")
    private Integer macaroni;
    @Id
    private Integer id;

    public Integer getRice() {
        return this.rice;
    }

    public void setRice(Integer rice) {
        this.rice = rice;
    }

    public Integer getChicken() {
        return this.chicken;
    }

    public void setChicken(Integer chicken) {
        this.chicken = chicken;
    }

    public Integer getBurger() {
        return this.burger;
    }

    public void setBurger(Integer burger) {
        this.burger = burger;
    }

    public Integer getLobsterRolls() {
        return this.lobsterRolls;
    }

    public void setLobsterRolls(Integer lobsterRolls) {
        this.lobsterRolls = lobsterRolls;
    }

    public Integer getPizza() {
        return this.pizza;
    }

    public void setPizza(Integer pizza) {
        this.pizza = pizza;
    }

    public Integer getPoutine() {
        return this.poutine;
    }

    public void setPoutine(Integer poutine) {
        this.poutine = poutine;
    }

    public Integer getFriedPotato() {
        return this.friedPotato;
    }

    public void setFriedPotato(Integer friedPotato) {
        this.friedPotato = friedPotato;
    }

    public Integer getSloppyJoes() {
        return this.sloppyJoes;
    }

    public void setSloppyJoes(Integer sloppyJoes) {
        this.sloppyJoes = sloppyJoes;
    }

    public Integer getUtz() {
        return this.utz;
    }

    public void setUtz(Integer utz) {
        this.utz = utz;
    }

    public Integer getMacaroni() {
        return this.macaroni;
    }

    public void setMacaroni(Integer macaroni) {
        this.macaroni = macaroni;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
