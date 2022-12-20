package com.example.projectspringboot.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_product")
public class Category {
    // Basic attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Construtores
    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category category)) return false;
        return getId().equals(category.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
