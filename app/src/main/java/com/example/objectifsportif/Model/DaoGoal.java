package com.example.objectifsportif.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.Date;
import java.util.List;

@Dao
public interface DaoObjectif {
    @Query("Select * from Goal")
    List<Goal> getAll();

    @Query("select * from Goal where start BETWEEN :start and :end")
    List<Goal> getAllGoalWhoStartAt(long start, long end);

    @Query("select * from Goal where idSport like :idsport")
    List<Goal> getAllGoalByIdSport(int idsport);

    @Query("select * from Goal where uid like :id")
    Goal getOneGoalById(int id);

    @Insert
    int insert(Goal goal);

    @Delete
    void delete(Goal goal);
}
