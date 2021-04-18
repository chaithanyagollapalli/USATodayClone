package com.usatoday.usaToday.Entity;

import javax.persistence.*;

@Entity
@Table(name = "my_topics")
public class MyTopics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "sub_cat_id")
    private int subCatId;

    public MyTopics() {
    }

    public MyTopics(int id, int subCatId) {
        this.id = id;
        this.subCatId = subCatId;
    }

    @Override
    public String toString() {
        return "MyTopics{" +
                "id=" + id +
                ", subCatId=" + subCatId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubCatId() {
        return subCatId;
    }

    public void setSubCatId(int subCatId) {
        this.subCatId = subCatId;
    }
}
