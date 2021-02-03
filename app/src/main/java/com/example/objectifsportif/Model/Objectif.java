package com.example.objectifsportif.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Objectif {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    public int sportId;

    public Date start;
    public Date end;

}
