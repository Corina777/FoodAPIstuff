
package com.devcookie.NutritionixAPI.foodstuff.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodPhoto {

    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("highres")
    @Expose
    private String highres;

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getHighres() {
        return highres;
    }

    public void setHighres(String highres) {
        this.highres = highres;
    }

}
