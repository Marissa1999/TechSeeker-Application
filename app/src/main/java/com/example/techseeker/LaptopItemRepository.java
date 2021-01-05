package com.example.techseeker;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.techseeker.model.LaptopItem;

import java.util.List;

public class LaptopItemRepository
{

    private LaptopItemDao mLaptopItemDao;
    private LiveData<List<LaptopItem>> mAllLaptopItems;

    LaptopItemRepository(Application application)
    {
        LaptopItemRoomDatabase database = LaptopItemRoomDatabase.getDatabase(application);
        mLaptopItemDao = database.laptopItemDao();
        mAllLaptopItems = mLaptopItemDao.getAllLaptopItems();
    }

    LiveData<List<LaptopItem>> getAllLaptopItems()
    {
        return mAllLaptopItems;
    }

    public void insert (LaptopItem laptop)
    {
        new insertAsyncTask(mLaptopItemDao).execute(laptop);
    }

    private static class insertAsyncTask extends AsyncTask<LaptopItem, Void, Void>
    {

        private LaptopItemDao mAsyncTaskDao;

        insertAsyncTask(LaptopItemDao dao)
        {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final LaptopItem... laptopItems)
        {
            mAsyncTaskDao.insert(laptopItems[0]);
            return null;
        }
    }



}
