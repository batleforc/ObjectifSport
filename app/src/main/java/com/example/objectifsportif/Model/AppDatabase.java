package com.example.objectifsportif.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities={Activity.class, Goal.class,Sport.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DaoActivity activityDao();
    public abstract DaoGoal goalDao();
    public abstract DaoSport sportDao();
}
