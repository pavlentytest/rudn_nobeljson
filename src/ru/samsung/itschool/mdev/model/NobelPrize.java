package ru.samsung.itschool.mdev.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NobelPrize {

    @SerializedName("awardYear")
    @Expose
    private String awardYear;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("categoryFullName")
    @Expose
    private CategoryFullName categoryFullName;
    @SerializedName("dateAwarded")
    @Expose
    private String dateAwarded;
    @SerializedName("prizeAmount")
    @Expose
    private Integer prizeAmount;
    @SerializedName("prizeAmountAdjusted")
    @Expose
    private Integer prizeAmountAdjusted;
    @SerializedName("links")
    @Expose
    private List<Link> links = null;
    @SerializedName("laureates")
    @Expose
    private List<Laureate> laureates = null;
    @SerializedName("topMotivation")
    @Expose
    private TopMotivation topMotivation;

    public String getAwardYear() {
        return awardYear;
    }

    public void setAwardYear(String awardYear) {
        this.awardYear = awardYear;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CategoryFullName getCategoryFullName() {
        return categoryFullName;
    }

    public void setCategoryFullName(CategoryFullName categoryFullName) {
        this.categoryFullName = categoryFullName;
    }

    public String getDateAwarded() {
        return dateAwarded;
    }

    public void setDateAwarded(String dateAwarded) {
        this.dateAwarded = dateAwarded;
    }

    public Integer getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(Integer prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    public Integer getPrizeAmountAdjusted() {
        return prizeAmountAdjusted;
    }

    public void setPrizeAmountAdjusted(Integer prizeAmountAdjusted) {
        this.prizeAmountAdjusted = prizeAmountAdjusted;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Laureate> getLaureates() {
        return laureates;
    }

    public void setLaureates(List<Laureate> laureates) {
        this.laureates = laureates;
    }

    public TopMotivation getTopMotivation() {
        return topMotivation;
    }

    public void setTopMotivation(TopMotivation topMotivation) {
        this.topMotivation = topMotivation;
    }
}
