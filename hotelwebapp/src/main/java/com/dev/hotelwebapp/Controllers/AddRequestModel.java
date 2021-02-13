package com.dev.hotelwebapp.Controllers;

import java.sql.Date;

public class AddRequestModel {
    public AddRequestModel() {
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

//    public String getMeal() {
//        return meal;
//    }
//
//    public void setMeal(String meal) {
//        this.meal = meal;
//    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }


    private Integer clientId;

    private Date checkIn;

    private Date checkOut;

    private String roomType;

    private String bed;

    private Integer roomNo;

    private boolean isBacon;

    private boolean isMuffin;

    private boolean isEgg;

    private boolean isCheese;

    private boolean isBread;

    private boolean isFiredBread;

    private boolean isPancake;

    private boolean isRice;

    private boolean isChicken;

    private boolean isBurgers;
    private boolean isLobsterRolls;
    private boolean isMacaroni;
    private boolean isSloppyJoes;
    private boolean isFishForLunch;
    private boolean isFriedPotatos;
    private boolean isPizza;

    public boolean isKabab() {
        return isKabab;
    }

    public void setKabab(boolean kabab) {
        isKabab = kabab;
    }

    private boolean isKabab;
    private boolean isLule;
    private boolean isBigMac;
    private boolean isSpaghettiWithMeat;
    private boolean isDoner;
    private boolean isDolmaWithLeaf;
    private boolean isSushi;
    private boolean isFishForSupper;
    private boolean isDolmaWithCabbage;
    private boolean isLevengi;

    public boolean isBacon() {
        return isBacon;
    }

    public void setBacon(boolean bacon) {
        isBacon = bacon;
    }

    public boolean isMuffin() {
        return isMuffin;
    }

    public void setMuffin(boolean muffin) {
        isMuffin = muffin;
    }

    public boolean isEgg() {
        return isEgg;
    }

    public void setEgg(boolean egg) {
        isEgg = egg;
    }

    public boolean isCheese() {
        return isCheese;
    }

    public void setCheese(boolean cheese) {
        isCheese = cheese;
    }

    public boolean isBread() {
        return isBread;
    }

    public void setBread(boolean bread) {
        isBread = bread;
    }

    public boolean isFiredBread() {
        return isFiredBread;
    }

    public void setFiredBread(boolean firedBread) {
        isFiredBread = firedBread;
    }

    public boolean isPancake() {
        return isPancake;
    }

    public void setPancake(boolean pancake) {
        isPancake = pancake;
    }

    public boolean isRice() {
        return isRice;
    }

    public void setRice(boolean rice) {
        isRice = rice;
    }

    public boolean isChicken() {
        return isChicken;
    }

    public void setChicken(boolean chicken) {
        isChicken = chicken;
    }

    public boolean isBurgers() {
        return isBurgers;
    }

    public void setBurgers(boolean burgers) {
        isBurgers = burgers;
    }

    public boolean isLobsterRolls() {
        return isLobsterRolls;
    }

    public void setLobsterRolls(boolean lobsterRolls) {
        isLobsterRolls = lobsterRolls;
    }

    public boolean isMacaroni() {
        return isMacaroni;
    }

    public void setMacaroni(boolean macaroni) {
        isMacaroni = macaroni;
    }

    public boolean isSloppyJoes() {
        return isSloppyJoes;
    }

    public void setSloppyJoes(boolean sloppyJoes) {
        isSloppyJoes = sloppyJoes;
    }

    public boolean isFishForLunch() {
        return isFishForLunch;
    }

    public void setFishForLunch(boolean fishForLunch) {
        isFishForLunch = fishForLunch;
    }

    public boolean isFriedPotatos() {
        return isFriedPotatos;
    }

    public void setFriedPotatos(boolean friedPotatos) {
        isFriedPotatos = friedPotatos;
    }

    public boolean isPizza() {
        return isPizza;
    }

    public void setPizza(boolean pizza) {
        isPizza = pizza;
    }

    public boolean isLule() {
        return isLule;
    }

    public void setLule(boolean lule) {
        isLule = lule;
    }

    public boolean isBigMac() {
        return isBigMac;
    }

    public void setBigMac(boolean bigMac) {
        isBigMac = bigMac;
    }

    public boolean isSpaghettiWithMeat() {
        return isSpaghettiWithMeat;
    }

    public void setSpaghettiWithMeat(boolean spaghettiWithMeat) {
        isSpaghettiWithMeat = spaghettiWithMeat;
    }

    public boolean isDoner() {
        return isDoner;
    }

    public void setDoner(boolean doner) {
        isDoner = doner;
    }

    public boolean isDolmaWithLeaf() {
        return isDolmaWithLeaf;
    }

    public void setDolmaWithLeaf(boolean dolmaWithLeaf) {
        isDolmaWithLeaf = dolmaWithLeaf;
    }

    public boolean isSushi() {
        return isSushi;
    }

    public void setSushi(boolean sushi) {
        isSushi = sushi;
    }

    public boolean isFishForSupper() {
        return isFishForSupper;
    }

    public void setFishForSupper(boolean fishForSupper) {
        isFishForSupper = fishForSupper;
    }

    public boolean isDolmaWithCabbage() {
        return isDolmaWithCabbage;
    }

    public void setDolmaWithCabbage(boolean dolmaWithCabbage) {
        isDolmaWithCabbage = dolmaWithCabbage;
    }

    public boolean isLevengi() {
        return isLevengi;
    }

    public void setLevengi(boolean levengi) {
        isLevengi = levengi;
    }

    public boolean isMeatLoaf() {
        return isMeatLoaf;
    }

    public void setMeatLoaf(boolean meatLoaf) {
        isMeatLoaf = meatLoaf;
    }

    public boolean isPorkChops() {
        return isPorkChops;
    }

    public void setPorkChops(boolean porkChops) {
        isPorkChops = porkChops;
    }

    //    private boolean is;
    private boolean isMeatLoaf;
    private boolean isPorkChops;


//    private String meal;

}
