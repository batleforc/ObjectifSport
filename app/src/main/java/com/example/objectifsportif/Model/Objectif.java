package com.example.objectifsportif.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Objectif {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name="label")
    public int sportId;

    @ColumnInfo(name="label")
    public Date start;

    @ColumnInfo(name="label")
    public Date end;

    @ColumnInfo(name="label")
    public Boolean isTemps;

    @ColumnInfo(name="label")
    public int value;

}
