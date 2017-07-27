package com.docswebapps.spring5guru.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dave Collier on 27/07/2017.
 */
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "publisher")
    List<Book> books;

    public Publisher() { }

    public Publisher(String name) {
        this.name = name;
    }

}
