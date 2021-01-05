package com.example.techseeker.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "pc_item_table")
public class PCItem
{

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "pc_id")
    private int mPCID;

    @NonNull
    @ColumnInfo(name = "pc_title")
    private String mPCTitle;

    @NonNull
    @ColumnInfo(name = "pc_description")
    private String mPCDescription;

    @NonNull
    @ColumnInfo(name = "pc_price")
    private String mPCPrice;

    @NonNull
    @ColumnInfo(name = "pc_image")
    private String mPCImage;


    public PCItem()
    {
        this.mPCID = 0;
        this.mPCTitle = null;
        this.mPCDescription = null;
        this.mPCPrice = null;
        this.mPCImage = null;
    }

    public int getPCID()
    {
        return mPCID;
    }

    public void setPCID(int mPCID)
    {
        this.mPCID = mPCID;
    }

    public String getPCTitle()
    {
        return mPCTitle;
    }

    public void setPCTitle(@NonNull String mPCTitle)
    {
        this.mPCTitle = mPCTitle;
    }

    public String getPCDescription()
    {
        return mPCDescription;
    }

    public void setPCDescription(@NonNull String mPCDescription)
    {
        this.mPCDescription = mPCDescription;
    }

    public String getPCPrice()
    {
        return mPCPrice;
    }

    public void setPCPrice(@NonNull String mPCPrice)
    {
        this.mPCPrice = mPCPrice;
    }


    @NonNull
    public String getPCImage() {
        return mPCImage;
    }

    public void setPCImage(@NonNull String mPCImage) {
        this.mPCImage = mPCImage;
    }
}
