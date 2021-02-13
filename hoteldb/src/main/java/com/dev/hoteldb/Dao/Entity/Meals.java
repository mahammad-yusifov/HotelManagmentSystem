package com.dev.hoteldb.Dao.Entity;

import javax.persistence.*;

@Entity
@Table(name = "meals")
public class Meals {
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

    @Column(name = "rice")
    private Integer rice;

    @Column(name = "chicken")
    private Integer chicken;

    @Column(name = "burger")
    private Integer burger;

    @Column(name = "lobster_rools")
    private Integer lobsterRools;

    @Column(name = "pizza")
    private Integer pizza;

    @Column(name = "poutine")
    private Integer poutine;

    @Column(name = "fried_potato")
    private Integer friedPotato;

    @Column(name = "sloppy_joes")
    private Integer sloppyJoes;

    @Column(name = "macaroni")
    private Integer macaroni;

    @Column(name = "kabab")
    private Integer kabab;

    @Column(name = "lule")
    private Integer lule;

    @Column(name = "meat_loaf")
    private Integer meatLoaf;

    @Column(name = "spagetti_with_meat")
    private Integer spagettiWithMeat;

    @Column(name = "sushi")
    private Integer sushi;

    @Column(name = "fish")
    private Integer fish;

    @Column(name = "big_mac")
    private Integer bigMac;

    @Column(name = "doner")
    private Integer doner;

    @Column(name = "pork_chops")
    private Integer porkChops;

    @Column(name = "dolma_leaf")
    private Integer dolmaLeaf;

    @Column(name = "dolma_cabbage")
    private Integer dolmaCabbage;

    @Column(name = "levengi")
    private Integer levengi;
    @Id
    private String id;

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

    public Integer getLobsterRools() {
        return this.lobsterRools;
    }

    public void setLobsterRools(Integer lobsterRools) {
        this.lobsterRools = lobsterRools;
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

    public Integer getMacaroni() {
        return this.macaroni;
    }

    public void setMacaroni(Integer macaroni) {
        this.macaroni = macaroni;
    }

    public Integer getKabab() {
        return this.kabab;
    }

    public void setKabab(Integer kabab) {
        this.kabab = kabab;
    }

    public Integer getLule() {
        return this.lule;
    }

    public void setLule(Integer lule) {
        this.lule = lule;
    }

    public Integer getMeatLoaf() {
        return this.meatLoaf;
    }

    public void setMeatLoaf(Integer meatLoaf) {
        this.meatLoaf = meatLoaf;
    }

    public Integer getSpagettiWithMeat() {
        return this.spagettiWithMeat;
    }

    public void setSpagettiWithMeat(Integer spagettiWithMeat) {
        this.spagettiWithMeat = spagettiWithMeat;
    }

    public Integer getSushi() {
        return this.sushi;
    }

    public void setSushi(Integer sushi) {
        this.sushi = sushi;
    }

    public Integer getFish() {
        return this.fish;
    }

    public void setFish(Integer fish) {
        this.fish = fish;
    }

    public Integer getBigMac() {
        return this.bigMac;
    }

    public void setBigMac(Integer bigMac) {
        this.bigMac = bigMac;
    }

    public Integer getDoner() {
        return this.doner;
    }

    public void setDoner(Integer doner) {
        this.doner = doner;
    }

    public Integer getPorkChops() {
        return this.porkChops;
    }

    public void setPorkChops(Integer porkChops) {
        this.porkChops = porkChops;
    }

    public Integer getDolmaLeaf() {
        return this.dolmaLeaf;
    }

    public void setDolmaLeaf(Integer dolmaLeaf) {
        this.dolmaLeaf = dolmaLeaf;
    }

    public Integer getDolmaCabbage() {
        return this.dolmaCabbage;
    }

    public void setDolmaCabbage(Integer dolmaCabbage) {
        this.dolmaCabbage = dolmaCabbage;
    }

    public Integer getLevengi() {
        return this.levengi;
    }

    public void setLevengi(Integer levengi) {
        this.levengi = levengi;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
