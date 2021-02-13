package com.dev.hoteldb.Dao.Entity;

import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "clients")
public class Clients {
    public Clients() {
    }

    public Clients(String firstName, String lastName, Date birthDate, String mobile, String passportNo, String email, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.mobile = mobile;
        this.passportNo = passportNo;
        this.email = email;
        this.gender = gender;
    }

    public Clients(Integer clientId, String firstName, String lastName, Date birthDate, String mobile, String passportNo, String email, String gender) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.mobile = mobile;
        this.passportNo = passportNo;
        this.email = email;
        this.gender = gender;
    }

    @Id
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "passport_no")
    private String passportNo;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

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

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassportNo() {
        return this.passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
