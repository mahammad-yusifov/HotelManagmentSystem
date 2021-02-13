package com.dev.hoteldb.Dao.Entity;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "total_cost")
    private Integer totalCost;

    @Column(name = "payment_method")
    private String paymentMethod;

    public Payment() {
    }

    public Payment(Integer clientId, String firstName, String lastName, Integer totalCost) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalCost = totalCost;
    }

    public Payment(Integer clientId, String firstName, String lastName, String paymentMethod, Double cost, Integer discount) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.paymentMethod = paymentMethod;
        this.cost = cost;
        Discount = discount;
    }

    private Double cost;

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    private Integer Discount;

    public Integer getDiscount() {
        return Discount;
    }

    public void setDiscount(Integer discount) {
        Discount = discount;
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

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getTotalCost() {
        return this.totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }


    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
