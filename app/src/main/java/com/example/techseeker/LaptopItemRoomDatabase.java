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

import com.example.techseeker.model.LaptopItem;

@Database(entities = {LaptopItem.class}, version = 2, exportSchema = false)
public abstract class LaptopItemRoomDatabase extends RoomDatabase
{

    public abstract LaptopItemDao laptopItemDao();
    private static LaptopItemRoomDatabase INSTANCE;


    static LaptopItemRoomDatabase getDatabase(final Context context)
    {
        if(INSTANCE == null)
        {
            synchronized (LaptopItemRoomDatabase.class)
            {
                if(INSTANCE == null)
                {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), LaptopItemRoomDatabase.class, "laptop_item_database")
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

                private final LaptopItemDao mDao;

                PopulateDatabaseAsync(LaptopItemRoomDatabase database)
                {
                    mDao = database.laptopItemDao();
                }

                @Override
                protected Void doInBackground(final Void... params)
                {
                    mDao.deleteAll();

                    LaptopItem laptopItem1 = new LaptopItem();
                    laptopItem1.setLaptopID(1);
                    laptopItem1.setLaptopTitle("New Dell XPS 13");
                    laptopItem1.setLaptopDescription("Simply put, the best laptop overall.");
                    laptopItem1.setLaptopPrice("$1329.99");
                    laptopItem1.setLaptopImage("laptop1");



                    LaptopItem laptopItem2 = new LaptopItem();
                    laptopItem2.setLaptopID(2);
                    laptopItem2.setLaptopTitle("Razer Blade Stealth 13");
                    laptopItem2.setLaptopDescription("The best lightweight laptop for gamers.");
                    laptopItem2.setLaptopPrice("$1849.00");
                    laptopItem2.setLaptopImage("laptop2");



                    LaptopItem laptopItem3 = new LaptopItem();
                    laptopItem3.setLaptopID(3);
                    laptopItem3.setLaptopTitle("Apple MacBook Pro 13");
                    laptopItem3.setLaptopDescription("It's the best MacBook Pro ever made, and the number one choice for Mac users.");
                    laptopItem3.setLaptopPrice("$1699.00");
                    laptopItem3.setLaptopImage("laptop3");



                    LaptopItem laptopItem4 = new LaptopItem();
                    laptopItem4.setLaptopID(4);
                    laptopItem4.setLaptopTitle("Apple MacBook Air 13");
                    laptopItem4.setLaptopDescription("MacBook Air is a thin and lightweight laptop from Apple.");
                    laptopItem4.setLaptopPrice("$1449.00");
                    laptopItem4.setLaptopImage("laptop4");


                    LaptopItem laptopItem5 = new LaptopItem();
                    laptopItem5.setLaptopID(5);
                    laptopItem5.setLaptopTitle("Asus Zenbook UX333FA");
                    laptopItem5.setLaptopDescription("A small but powerful laptop with an elegant design.");
                    laptopItem5.setLaptopPrice("$999.99");
                    laptopItem5.setLaptopImage("laptop5");



                    LaptopItem laptopItem6 = new LaptopItem();
                    laptopItem6.setLaptopID(6);
                    laptopItem6.setLaptopTitle("Acer Nitro 5");
                    laptopItem6.setLaptopDescription("A gaming laptop with full HD display and powerful gaming tech.");
                    laptopItem6.setLaptopPrice("$999.99");
                    laptopItem6.setLaptopImage("laptop6");



                    LaptopItem laptopItem7 = new LaptopItem();
                    laptopItem7.setLaptopID(7);
                    laptopItem7.setLaptopTitle("New Inspiron 15 5000 2-in-1");
                    laptopItem7.setLaptopDescription("Flexible features to fit your inspiration, whenever it strikes.");
                    laptopItem7.setLaptopPrice("749.00");
                    laptopItem7.setLaptopImage("laptop7");


                    LaptopItem laptopItem8 = new LaptopItem();
                    laptopItem8.setLaptopID(8);
                    laptopItem8.setLaptopTitle("Acer Swift 3");
                    laptopItem8.setLaptopDescription("Style, power and lightweight portability are merged perfectly in the Swift 3.");
                    laptopItem8.setLaptopPrice("$999.99");
                    laptopItem8.setLaptopImage("laptop8");



                    LaptopItem laptopItem9 = new LaptopItem();
                    laptopItem9.setLaptopID(9);
                    laptopItem9.setLaptopTitle("Dell G7 15 Gaming Laptop");
                    laptopItem9.setLaptopDescription("A gaming laptop with a slim and sleek design.");
                    laptopItem9.setLaptopPrice("$1229.99");
                    laptopItem9.setLaptopImage("laptop9");



                    LaptopItem laptopItem10 = new LaptopItem();
                    laptopItem10.setLaptopID(10);
                    laptopItem10.setLaptopTitle("Acer Predator Helios 300");
                    laptopItem10.setLaptopDescription("A laptop with unbeatable gaming performance for the price.");
                    laptopItem10.setLaptopPrice("$1999.99");
                    laptopItem10.setLaptopImage("laptop10");



                    LaptopItem albumItem11 = new LaptopItem();
                    albumItem11.setLaptopID(11);
                    albumItem11.setLaptopTitle("Acer Aspire 5");
                    albumItem11.setLaptopDescription("Powerful, everyday computing at your side.");
                    albumItem11.setLaptopPrice("$849.00");
                    albumItem11.setLaptopImage("laptop11");
                    
                    
                    this.mDao.insert(laptopItem1);
                    this.mDao.insert(laptopItem2);
                    this.mDao.insert(laptopItem3);
                    this.mDao.insert(laptopItem4);
                    this.mDao.insert(laptopItem5);
                    this.mDao.insert(laptopItem6);
                    this.mDao.insert(laptopItem7);
                    this.mDao.insert(laptopItem8);
                    this.mDao.insert(laptopItem9);
                    this.mDao.insert(laptopItem10);
                    this.mDao.insert(albumItem11);
                    this.mDao.getAllLaptopItems();

                    return null;
                }

    }

}
