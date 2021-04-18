package com.usatoday.usaToday.Entity;

import javax.persistence.*;

@Entity
@Table(name = "videos")
public class Videos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "vid_url")
    private String vidUrl;

    @Column(name = "vid_title")
    private String vidTitle;

    @Column(name = "vid_id")
    private String vidId;

    public Videos() {
    }

    public Videos(int id, String vidUrl, String vidTitle, String vidId) {
        this.id = id;
        this.vidUrl = vidUrl;
        this.vidTitle = vidTitle;
        this.vidId = vidId;
    }

    @Override
    public String toString() {
        return "Videos{" +
                "id=" + id +
                ", vidUrl='" + vidUrl + '\'' +
                ", vidTitle='" + vidTitle + '\'' +
                ", vidId='" + vidId + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVidUrl() {
        return vidUrl;
    }

    public void setVidUrl(String vidUrl) {
        this.vidUrl = vidUrl;
    }

    public String getVidTitle() {
        return vidTitle;
    }

    public void setVidTitle(String vidTitle) {
        this.vidTitle = vidTitle;
    }

    public String getVidId() {
        return vidId;
    }

    public void setVidId(String vidId) {
        this.vidId = vidId;
    }
}
