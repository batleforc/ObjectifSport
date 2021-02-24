package com.example.objectifsportif.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities={Activite.class,Objectif.class,Sport.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

}
