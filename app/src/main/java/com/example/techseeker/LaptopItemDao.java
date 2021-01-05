package com.example.techseeker;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.techseeker.model.LaptopItem;

import java.util.List;

@Dao
public interface LaptopItemDao
{
    @Insert
    void insert(LaptopItem laptop);

    @Query("DELETE FROM laptop_item_table")
    void deleteAll();

    @Query("SELECT * from laptop_item_table ORDER BY laptop_id ASC")
    LiveData<List<LaptopItem>> getAllLaptopItems();


}
