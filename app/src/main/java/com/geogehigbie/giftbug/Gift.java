package com.geogehigbie.giftbug;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by georgehigbie on 12/6/16.
 */

public class Gift {

    private ImageView imageGift;
    private TextView  titleGift;
    private TextView descriptionGift;
    private String titleString;
    private String descriptionString;

    public Gift(ImageView ImageGift, TextView TitleGift, TextView DescriptionGift){

        this.imageGift = ImageGift;
        this.titleGift = TitleGift;
        this.descriptionGift =  DescriptionGift;

    }

    public TextView getDescriptionGift() {
        return descriptionGift;
    }


    public void setDescriptionGift(TextView descriptionGift) {
        this.descriptionGift = descriptionGift;
    }


    public String getDescriptionString() {
        return descriptionString;
    }


    public void setDescriptionString(String descriptionString) {
        this.descriptionString = descriptionString;
    }


    public ImageView getImageGift() {
        return imageGift;
    }


    public void setImageGift(ImageView imageGift) {
        this.imageGift = imageGift;
    }


    public TextView getTitleGift() {
        return titleGift;
    }


    public void setTitleGift(TextView titleGift) {
        this.titleGift = titleGift;
    }


    public String getTitleString() {
        return titleString;
    }


    public void setTitleString(String titleString) {
        this.titleString = titleString;
    }

}
