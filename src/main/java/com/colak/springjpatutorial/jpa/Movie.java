package com.colak.springjpatutorial.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movies")

@Getter
@Setter
public class Movie extends Item {
    private String director;
    private int duration;

}
