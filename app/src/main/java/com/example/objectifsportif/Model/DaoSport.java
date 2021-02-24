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

    @Insert
    int insert(Sport sport);

    @Update
    int update(Sport sport);

    @Delete
    void delete(Sport sport);
}
