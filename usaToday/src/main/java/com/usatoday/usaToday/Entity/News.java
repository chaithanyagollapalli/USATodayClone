package com.usatoday.usaToday.Entity;

import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "sub_cat_id")
    private int subCatId;

    @Column(name = "reporter_id")
    private int reporterId;

    @Column(name = "ranking")
    private int ranking;

    @Column(name = "heading")
    private String heading;

    @Column(name = "img")
    private String img;

    @Column(name = "vid")
    private String vid;

    @Column(name = "description")
    private String desc;

    @Column(name = "time")
    private String time;

    public News() {
    }

    public News(int subCatId, int reporterId, int ranking, String heading, String img,
                String vid, String desc, String time) {
        this.subCatId = subCatId;
        this.reporterId = reporterId;
        this.ranking = ranking;
        this.heading = heading;
        this.img = img;
        this.vid = vid;
        this.desc = desc;
        this.time = time;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", subCatId=" + subCatId +
                ", reporterId=" + reporterId +
                ", ranking=" + ranking +
                ", heading='" + heading + '\'' +
                ", img='" + img + '\'' +
                ", vid='" + vid + '\'' +
                ", desc='" + desc + '\'' +
                ", time='" + time + '\'' +
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

    public int getReporterId() {
        return reporterId;
    }

    public void setReporterId(int reporterId) {
        this.reporterId = reporterId;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
