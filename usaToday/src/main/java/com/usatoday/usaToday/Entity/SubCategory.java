package com.usatoday.usaToday.Entity;

import javax.persistence.*;

@Entity
@Table(name = "sub_category")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cat_id")
    private int catId;

    @Column(name = "name")
    private String name;

    public SubCategory() {
    }

    public SubCategory(int id, int catId, String name) {
        this.id = id;
        this.catId = catId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SubCategory{" +
                "id=" + id +
                ", catId=" + catId +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
