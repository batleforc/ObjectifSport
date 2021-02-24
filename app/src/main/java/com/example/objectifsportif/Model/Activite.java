package com.example.objectifsportif.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Activite {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name="idSport")
    public int idSport;

    @ColumnInfo(name="when")
    public Date date;

    @ColumnInfo(name="duree")
    public int duree;

    @ColumnInfo(name="distance")
    public int distance;
}
