package com.example.UserManagementApp.model;


import javax.persistence.*;


@Entity
public class User {
    //no args constructor
    public User() {
    }

    public User(int id, String firstName, String lastName, String gender, String name, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.name = name;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "FIRSTNAME")
    private String firstName;


    @Column(name = "LASTNAME")
    private String lastName;



    @Column(name = "M/F")
    private String gender;




    @Column(name = "FULL NAME")
    private String name;


    @Column(name = "ADDRESS")
    private String address;

//    public User(int  id, String name, String address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int  id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
