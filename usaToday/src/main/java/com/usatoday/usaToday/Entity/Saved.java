package com.usatoday.usaToday.Entity;

import javax.persistence.*;

@Entity
@Table(name = "saved")
public class Saved {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "news_id")
    private int newsId;

    public Saved() {
    }

    public Saved(int id, int newsId) {
        this.id = id;
        this.newsId = newsId;
    }

    @Override
    public String toString() {
        return "Saved{" +
                "id=" + id +
                ", newsId=" + newsId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }
}
