package com.example.techseeker;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.techseeker.model.LaptopItem;

import java.util.List;

public class LaptopItemViewModel extends AndroidViewModel
{
    private LaptopItemRepository mRepository;
    private LiveData<List<LaptopItem>> mAllLaptopItems;

    public LaptopItemViewModel(Application application)
    {
        super(application);
        mRepository = new LaptopItemRepository(application);
        mAllLaptopItems = mRepository.getAllLaptopItems();
    }

    LiveData<List<LaptopItem>> getAllLaptopItems()
    {
        return mAllLaptopItems;
    }

    public void insert(LaptopItem laptop)
    {
        mRepository.insert(laptop);
    }


}
