package com.contactverse.contactverse.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Socials {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private String link;
    private String title;

    @ManyToOne
    private Contact contact;

}
