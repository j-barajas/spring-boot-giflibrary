package com.barajas.giflib.model;

import java.time.LocalDate;

/**
 * Created by jbara on 4/22/2018.
 */
public class Gif {
    private String name;
    private int catagoryId;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;

    public Gif(String name, int categoryId, LocalDate dateUploaded, String username, boolean favorite) {
        this.name = name;
        this.catagoryId=categoryId;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }

    public int getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(int catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
