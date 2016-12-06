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

    private String imageURLString;
    private String titleGiftString;
    private String descriptionGiftString;

    public Gift(String ImageURLString, String TitleGiftString, String DescriptionGiftString){

        this.imageURLString = ImageURLString;
        this.titleGiftString = TitleGiftString;
        this.descriptionGiftString =  DescriptionGiftString;
    }



}
