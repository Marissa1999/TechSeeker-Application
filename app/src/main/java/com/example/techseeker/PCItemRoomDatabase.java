package com.example.techseeker;

import android.annotation.TargetApi;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.NonNull;

import com.example.techseeker.model.PCItem;

@Database(entities = {PCItem.class}, version = 2, exportSchema = false)
public abstract class PCItemRoomDatabase extends RoomDatabase
{

    public abstract PCItemDao PCItemDao();
    private static PCItemRoomDatabase INSTANCE;


    static PCItemRoomDatabase getDatabase(final Context context)
    {
        if(INSTANCE == null)
        {
            synchronized (PCItemRoomDatabase.class)
            {
                if(INSTANCE == null)
                {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), PCItemRoomDatabase.class, "pc_item_database")
                            .fallbackToDestructiveMigration()
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }

        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback()
    {

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase database)
        {
            super.onOpen(database);
            new PopulateDatabaseAsync(INSTANCE).execute();
        }
    };

    private static class PopulateDatabaseAsync extends AsyncTask<Void, Void, Void>
    {

        private final PCItemDao mDao;

        PopulateDatabaseAsync(PCItemRoomDatabase database)
        {
            mDao = database.PCItemDao();
        }

        @Override
        protected Void doInBackground(final Void... params)
        {
            mDao.deleteAll();

            PCItem pcItem1 = new PCItem();
            pcItem1.setPCID(1);
            pcItem1.setPCTitle("Dell Inspiron Desktop");
            pcItem1.setPCDescription("Extensive storage meets upgraded speed and power without sacrificing performance.");
            pcItem1.setPCPrice("$479.99");
            pcItem1.setPCImage("desktop1");


            PCItem pcItem2 = new PCItem();
            pcItem2.setPCID(2);
            pcItem2.setPCTitle("Optiplex 5270 All-In-One");
            pcItem2.setPCDescription("Expand your productivity with the Optiplex 5270 All-In-One.");
            pcItem2.setPCPrice("1428.00");
            pcItem2.setPCImage("desktop2");


            PCItem pcItem3 = new PCItem();
            pcItem3.setPCID(3);
            pcItem3.setPCTitle("Apple iMac 21.5");
            pcItem3.setPCDescription("Easy-to-use technology into an elegant, all-in-one design.");
            pcItem3.setPCPrice("$1949.99");
            pcItem3.setPCImage("desktop3");


            PCItem pcItem4 = new PCItem();
            pcItem4.setPCID(4);
            pcItem4.setPCTitle("Legion Y720 Cube");
            pcItem4.setPCDescription("Enjoy high-performance processing and sharp graphics wherever you want to play.");
            pcItem4.setPCPrice("$699.00");
            pcItem4.setPCImage("desktop4");


            PCItem pcItem5 = new PCItem();
            pcItem5.setPCID(5);
            pcItem5.setPCTitle("Alienware Aurora Gaming PC");
            pcItem5.setPCDescription("Experience gaming like never before with this innovative Alienware Gaming PC.");
            pcItem5.setPCPrice("$1979.99");
            pcItem5.setPCImage("desktop6");


            PCItem pcItem6 = new PCItem();
            pcItem6.setPCID(6);
            pcItem6.setPCTitle("HP Pavilion All-In-One");
            pcItem6.setPCDescription("Everything you need to take on everyday computing tasks.");
            pcItem6.setPCPrice("$699.95");
            pcItem6.setPCImage("desktop7");


            PCItem pcItem7 = new PCItem();
            pcItem7.setPCID(7);
            pcItem7.setPCTitle("CyberPowerPC Gamer Xtreme");
            pcItem7.setPCDescription("Enthusiast-level Gaming PC.");
            pcItem7.setPCPrice("$1009.99");
            pcItem7.setPCImage("desktop8");


            PCItem pcItem8 = new PCItem();
            pcItem8.setPCID(8);
            pcItem8.setPCTitle("Acer Nitro Gaming PC");
            pcItem8.setPCDescription("Powerful, lag-free gaming is easily experienced with the Acer Nitro gaming PC..");
            pcItem8.setPCPrice("$900.99");
            pcItem8.setPCImage("desktop9");


            PCItem pcItem9 = new PCItem();
            pcItem9.setPCID(9);
            pcItem9.setPCTitle("HP Omen Obelisk");
            pcItem9.setPCDescription("This high-performance gaming PC delivers smooth play and true-to-life visuals.");
            pcItem9.setPCPrice("$1500.99");
            pcItem9.setPCImage("desktop10");


            PCItem pcItem10 = new PCItem();
            pcItem10.setPCID(10);
            pcItem10.setPCTitle("Acer Predator Orion 3000");
            pcItem10.setPCDescription("Mid-range, off-the-shelf gaming PC that won't break your bank.");
            pcItem10.setPCPrice("$1800.99");
            pcItem10.setPCImage("desktop11");

            PCItem pcItem11 = new PCItem();
            pcItem11.setPCID(11);
            pcItem11.setPCTitle("Lenovo IdeaCentre 510A");
            pcItem11.setPCDescription("Contemporary and affordable style for your family.");
            pcItem11.setPCPrice("$849.99");
            pcItem11.setPCImage("desktop12");

            PCItem pcItem12 = new PCItem();
            pcItem12.setPCID(12);
            pcItem12.setPCTitle("Apple Mac Mini");
            pcItem12.setPCDescription("Modest performance in an extremely compact and elegant case.");
            pcItem12.setPCPrice("$1399.99");
            pcItem12.setPCImage("desktop13");

            PCItem pcItem13 = new PCItem();
            pcItem13.setPCID(13);
            pcItem13.setPCTitle("Dell Inspiron 5680 Gaming PC");
            pcItem13.setPCDescription("Your portal into the world of realistic graphics and fierce competition.");
            pcItem13.setPCPrice("$1000.00");
            pcItem13.setPCImage("desktop5");


            this.mDao.insert(pcItem1);
            this.mDao.insert(pcItem2);
            this.mDao.insert(pcItem3);
            this.mDao.insert(pcItem4);
            this.mDao.insert(pcItem5);
            this.mDao.insert(pcItem6);
            this.mDao.insert(pcItem7);
            this.mDao.insert(pcItem8);
            this.mDao.insert(pcItem9);
            this.mDao.insert(pcItem10);
            this.mDao.insert(pcItem11);
            this.mDao.insert(pcItem12);
            this.mDao.insert(pcItem13);
            this.mDao.getAllPCItems();

            return null;
        }

    }

}
