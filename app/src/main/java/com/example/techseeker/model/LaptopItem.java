package com.example.techseeker.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "laptop_item_table")
public class LaptopItem
{

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "laptop_id")
    private int mLaptopID;

    @NonNull
    @ColumnInfo(name = "laptop_title")
    private String mLaptopTitle;

    @NonNull
    @ColumnInfo(name = "laptop_description")
    private String mLaptopDescription;

    @NonNull
    @ColumnInfo(name = "laptop_price")
    private String mLaptopPrice;

    @NonNull
    @ColumnInfo(name = "laptop_image")
    private String mLaptopImage;

    public LaptopItem()
    {
        this.mLaptopID = 0;
        this.mLaptopTitle = null;
        this.mLaptopDescription = null;
        this.mLaptopPrice = null;
    }

    public int getLaptopID()
    {
        return mLaptopID;
    }

    public void setLaptopID(int mLaptopID)
    {
        this.mLaptopID = mLaptopID;
    }

    public String getLaptopTitle()
    {
        return mLaptopTitle;
    }

    public void setLaptopTitle(@NonNull String mLaptopTitle)
    {
        this.mLaptopTitle = mLaptopTitle;
    }

    public String getLaptopDescription()
    {
        return mLaptopDescription;
    }

    public void setLaptopDescription(@NonNull String mLaptopDescription)
    {
        this.mLaptopDescription = mLaptopDescription;
    }

    public String getLaptopPrice()
    {
        return mLaptopPrice;
    }

    public void setLaptopPrice(@NonNull String mLaptopPrice)
    {
        this.mLaptopPrice = mLaptopPrice;
    }


    @NonNull
    public String getLaptopImage() {
        return mLaptopImage;
    }

    public void setLaptopImage(@NonNull String mLaptopImage) {
        this.mLaptopImage = mLaptopImage;
    }
}
