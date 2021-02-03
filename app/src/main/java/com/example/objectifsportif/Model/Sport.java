package com.example.objectifsportif.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Sport {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name="label")
    public String label;

    @ColumnInfo(name="temps")
    public Boolean temps;

    @ColumnInfo(name="distance")
    public Boolean distance;

}
