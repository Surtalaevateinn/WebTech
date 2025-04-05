package com.example.demo.entity;

public class Video {
    Integer id;
    String url;
    String viewCount;

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", viewCount='" + viewCount + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }
}
