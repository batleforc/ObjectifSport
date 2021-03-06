package com.example.objectifsportif.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DaoSport {

    @Query("Select * from sport")
    List<Sport> getAll();

    @Query("select * from sport where istime = 1")
    List<Sport> getTimeSport();

    @Query("select * from sport where isdistance = 1")
    List<Sport> getDistanceSport();

    @Query("select * from sport where uid = :id limit 1")
    Sport getOneSport(int id);

    @Insert
    long insert(Sport sport);

    @Update
    int update(Sport sport);

    @Delete
    void delete(Sport sport);
}
