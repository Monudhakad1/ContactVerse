package com.contactverse.contactverse.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
@Table(name = "users")
public class User {

    @Id

    private String userId;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Column(columnDefinition = "TEXT")
    private String about;

    @Column(columnDefinition = "TEXT")
    private String profilePic;
    private String PhoneNumber;
    // info
    private Boolean enabled = false;
    private Boolean emailVerified = false;
    private String phoneVerified;

    private Providers provider = Providers.SELF;
    private String providerId;

    @OneToMany(mappedBy  = "user")
    private List<Contact> contacts = new ArrayList<>() ;


}
