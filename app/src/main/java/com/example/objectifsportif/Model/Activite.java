package com.example.objectifsportif.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Activite {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name="label")
    public int idSport;

    @ColumnInfo(name="label")
    public int date;

    @ColumnInfo(name="label")
    public int duree;

    @ColumnInfo(name="label")
    public int distance;
}
