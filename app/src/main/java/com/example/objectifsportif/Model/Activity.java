package com.example.objectifsportif.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Activity {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name="idSport")
    public int idSport;

    @ColumnInfo(name="when")
    public long Day;

    @ColumnInfo(name="duree")
    public int duree;

    @ColumnInfo(name="distance")
    public int distance;

    public Date getDate(){
        return new Date(this.Day);
    }
    public void setDate(Date date){
        this.Day = date.getTime();
    }
}
