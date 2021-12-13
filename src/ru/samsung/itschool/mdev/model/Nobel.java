package ru.samsung.itschool.mdev.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Nobel {

    @SerializedName("nobelPrizes")
    @Expose
    private List<NobelPrize> nobelPrizes = null;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("links")
    @Expose
    private Links links;

    public List<NobelPrize> getNobelPrizes() {
        return nobelPrizes;
    }

    public void setNobelPrizes(List<NobelPrize> nobelPrizes) {
        this.nobelPrizes = nobelPrizes;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}

