package com.example.techseeker;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.techseeker.model.PCItem;

import java.util.List;

@Dao
public interface PCItemDao
{
    @Insert
    void insert(PCItem pc);

    @Query("DELETE FROM pc_item_table")
    void deleteAll();

    @Query("SELECT * from pc_item_table ORDER BY pc_id ASC")
    LiveData<List<PCItem>> getAllPCItems();


}
