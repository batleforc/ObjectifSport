package com.example.objectifsportif.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.Date;
import java.util.List;

@Dao
public interface DaoActivite {
    @Query("Select * from Activite")
    List<Activite> getAll();

    @Query("Select * from Activite where uid like :first limit 1")
    Activite getOneActivityById(int first);

    @Query("Select * from Activite where idSport like :idSport")
    List<Activite> getActiviteBySport(int idSport);

    @Query("Select * from Activite where `when` like :when")
    List<Activite> getActiviteByDate(Date when);

    @Insert
    int insert(Activite activite);

    @Update
    int update(Activite activite);

    @Delete
    void delete(Activite activite);

}
