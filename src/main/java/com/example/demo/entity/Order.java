package com.example.demo.entity;

public class Order {
    Integer id;
    String num;
    String title;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    String username;
    String address;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
