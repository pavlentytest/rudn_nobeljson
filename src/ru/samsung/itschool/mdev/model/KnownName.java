package ru.samsung.itschool.mdev.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KnownName {

    @SerializedName("en")
    @Expose
    private String en;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

}