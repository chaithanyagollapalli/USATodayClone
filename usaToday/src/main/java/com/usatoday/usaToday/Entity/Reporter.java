package com.usatoday.usaToday.Entity;

import javax.persistence.*;

@Entity
@Table(name = "reporter")
public class Reporter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public Reporter() {
    }

    public Reporter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
