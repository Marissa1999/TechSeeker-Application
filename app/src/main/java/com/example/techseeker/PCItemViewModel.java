package com.example.techseeker;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.techseeker.model.LaptopItem;
import com.example.techseeker.model.PCItem;

import java.util.List;

public class PCItemViewModel extends AndroidViewModel
{
    private PCItemRepository mRepository;
    private LiveData<List<PCItem>> mAllPCItems;

    public PCItemViewModel(Application application)
    {
        super(application);
        mRepository = new PCItemRepository(application);
        mAllPCItems = mRepository.getAllLaptopItems();
    }

    LiveData<List<PCItem>> getAllPCItems()
    {
        return mAllPCItems;
    }

    public void insert(PCItem pc)
    {
        mRepository.insert(pc);
    }


}
