package com.colak.springjpainheritancetutorial.jpa;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "books")

@Getter
@Setter
public class Book extends Item {
    private String author;
    private String isbn;
}
