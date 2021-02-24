package com.example.objectifsportif.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Objectif {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name="idSport")
    public int sportId;

    @ColumnInfo(name="start")
    public Date start;

    @ColumnInfo(name="stop")
    public Date end;

    @ColumnInfo(name="isTemps")
    public Boolean isTemps;

    @ColumnInfo(name="value")
    public int value;

}
