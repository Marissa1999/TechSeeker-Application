package com.example.techseeker;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.techseeker.model.LaptopItem;
import com.example.techseeker.model.PCItem;

import java.util.List;

public class PCItemRepository
{

    private PCItemDao mPCItemDao;
    private LiveData<List<PCItem>> mAllPCItems;

    PCItemRepository(Application application)
    {
        PCItemRoomDatabase database = PCItemRoomDatabase.getDatabase(application);
        mPCItemDao = database.PCItemDao();
        mAllPCItems = mPCItemDao.getAllPCItems();
    }

    LiveData<List<PCItem>> getAllLaptopItems()
    {
        return mAllPCItems;
    }

    public void insert (PCItem pc)
    {
        new insertAsyncTask(mPCItemDao).execute(pc);
    }

    private static class insertAsyncTask extends AsyncTask<PCItem, Void, Void>
    {

        private PCItemDao mAsyncTaskDao;

        insertAsyncTask(PCItemDao dao)
        {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final PCItem... PCItems)
        {
            mAsyncTaskDao.insert(PCItems[0]);
            return null;
        }
    }



}
