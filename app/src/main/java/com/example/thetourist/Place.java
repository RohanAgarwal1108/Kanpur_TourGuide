package com.example.thetourist;

public class Place {

    private String name;
    private String about;
    private int image;
    private boolean isExpanded;

    public Place(String name, String about, int image) {
        this.about = about;
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public int getImage() {
        return image;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }
}
