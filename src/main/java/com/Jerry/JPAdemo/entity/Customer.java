package com.Jerry.JPAdemo.entity;

import javax.persistence.*;

/**
 * 顾客
 * Created by Jerry on 2017/11/6 0006.
 */
@Entity
@Access(value = AccessType.FIELD)
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

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
}
