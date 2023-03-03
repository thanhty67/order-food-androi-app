package com.example.orderfoodapplication.models;

public class Category {
    private String Name;
    private String Image;

    public void setName(String name) {
        this.Name = name;
    }

    public void setImage(String image) {
        this.Image = image;
    }

    public Category() {
    }

    public String getName() {
        return Name;
    }

    public String getImage() {
        return Image;
    }
}
