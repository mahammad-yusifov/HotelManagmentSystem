package com.dev.hoteldb.Dao.Entity;

import javax.persistence.*;

@Entity
@Table(name = "supper_price")
public class SupperPrice {
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

    @Column(name = "levengi")
    private Integer levengi;

    @Column(name = "dolma_leaf")
    private Integer dolmaLeaf;

    @Column(name = "dolma_cabbage")
    private Integer dolmaCabbage;
    @Id
    private Integer id;

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

    public Integer getLevengi() {
        return this.levengi;
    }

    public void setLevengi(Integer levengi) {
        this.levengi = levengi;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
