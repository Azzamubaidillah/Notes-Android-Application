package com.azzam.catatan.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
class Notes:Serializable {

        @PrimaryKey(autoGenerate = true)
        var id:Int? = null

        @ColumnInfo(name = "title")
        var title:String? = null

        @ColumnInfo(name = "sub_title")
        var subtitle:String? = null

        @ColumnInfo(name = "date_time")
        var dateTime:String? = null

        @ColumnInfo(name = "note_text")
        var noteText:String? = null

        @ColumnInfo(name = "img_path")
        var imtPath:String? = null

        @ColumnInfo(name = "web_title")
        var webLink:String? = null

        @ColumnInfo(name = "color")
        var color:String? = null


    override fun toString(): String {
        return "$title : $dateTime"
    }
}