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

    @ColumnInfo(name="temps")
    public Boolean temps;

    @ColumnInfo(name="day")
    public long Day;

    @ColumnInfo(name="distance")
    public Boolean distance;

    public Date getDate(){
        return new Date(this.Day);
    }
    public void setDate(Date date){
        this.Day = date.getTime();
    }

}
