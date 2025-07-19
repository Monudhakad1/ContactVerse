package com.contactverse.contactverse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name="contact")
public class Contact {
//    the user connected to user table with OneToMany relationship

    @Id
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
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Socials> links = new ArrayList<>();


}
