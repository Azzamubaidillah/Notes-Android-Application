package com.azzam.catatan.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Notes (

        @PrimaryKey(autoGenerate = true)
        var id:Int,

        @ColumnInfo(name = "title")
        var title:String,

        @ColumnInfo(name = "sub_title")
        var subtitle:String,

        @ColumnInfo(name = "date_time")
        var dateTime:String,

        @ColumnInfo(name = "note_text")
        var noteText:String,

        @ColumnInfo(name = "img_path")
        var imtPath:String,

        @ColumnInfo(name = "web_title")
        var webLink:String,

        @ColumnInfo(name = "color")
        var color:String,


        ): Serializable {
    override fun toString(): String {
        return "$title : $dateTime"
    }
}