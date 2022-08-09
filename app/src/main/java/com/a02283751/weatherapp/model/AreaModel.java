package com.a02283751.weatherapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class AreaModel {
    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo
    public String areaName;

    @ColumnInfo(name = "created_at")
    public long createdAt;

}
