package com.example.objectifsportif.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Sport {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name="label")
    public String label;

    @ColumnInfo(name="istime")
    public boolean isTime;

    @ColumnInfo(name="isdistance")
    public boolean isDistance;


}
