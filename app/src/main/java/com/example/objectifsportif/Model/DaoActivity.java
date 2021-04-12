package com.example.objectifsportif.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.Date;
import java.util.List;

@Dao
public interface DaoActivity {
    @Query("Select * from Activity")
    List<Activity> getAll();

    @Query("Select * from Activity where uid like :first limit 1")
    Activity getOneActivityById(int first);

    @Query("Select * from Activity where idSport like :idSport")
    List<Activity> getActivityBySport(int idSport);

    @Query("Select * from Activity where `when` BETWEEN :whenStart and :whenEnd ")
    List<Activity> getActivityByDate(long whenStart,long whenEnd);

    @Insert
    long insert(Activity activity);

    @Update
    int update(Activity activity);

    @Delete
    void delete(Activity activity);

}
