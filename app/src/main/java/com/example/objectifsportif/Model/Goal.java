package com.example.objectifsportif.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Goal {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name="idSport")
    public int sportId;

    @ColumnInfo(name="start")
    public long start;

    @ColumnInfo(name="stop")
    public long end;

    @ColumnInfo(name="isTemps")
    public Boolean isTemps;

    @ColumnInfo(name="value")
    public int value;

}
