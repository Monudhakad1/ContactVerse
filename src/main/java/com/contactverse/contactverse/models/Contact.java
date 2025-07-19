package com.contactverse.contactverse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity(name="contact")
public class Contact {
//    the user connected to user table with OneToMany relationship

    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String picture;

    @Column(columnDefinition = "TEXT")
    private String description;
    private Boolean favourite = false;

    @Column(columnDefinition = "TEXT")
    private String websiteLink;
    @Column(columnDefinition = "TEXT")
    private String linkedinLink;

    //  private List<String> socialLinks; // List of social links like Facebook, Twitter, LinkedIn, etc.
    @ManyToOne
    public User user;



}
