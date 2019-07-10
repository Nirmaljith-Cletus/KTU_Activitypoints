package com.example.asus.ktu_activitypoints;


public class List {
    private int id;
    private String name;
    private String points;
    private byte[] image;

    public List(String name, String points, byte[] image, int id) {
        this.name = name;
        this.points = points;
        this.image = image;
        this.id = id;
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

    public String getPoints() {
        return points;
    }

    public void setPrice(String points) {
        this.points = points;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
