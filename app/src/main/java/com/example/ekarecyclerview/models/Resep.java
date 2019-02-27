package com.example.ekarecyclerview.models;

public class Resep {

    private String id;
    private String title;

    private String img;
    private int img_local;

    public Resep(String id, String title, String desc, String img) {
        this.id = id;
        this.title = title;

        this.img = img;
    }

    public Resep(String id, String title, String desc, int img_local) {
        this.id = id;
        this.title = title;

        this.img_local = img_local;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getImg() {

        return img;
    }

    public void setImg(String img) {

        this.img = img;
    }

    public int getImg_local() {

        return img_local;
    }

    public void setImg_local(int img_local) {

        this.img_local = img_local;
    }


}
