package org.gawa.owner.model;

import java.io.Serializable;

public class Owner implements Serializable{

    private Integer id;
    private String name;
    private String houseNumber;
    private String phone;

    public Owner(){}

    public Owner(Integer id, String name, String houseNumber, String phone) {
        this.id = id;
        this.name = name;
        this.houseNumber = houseNumber;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
