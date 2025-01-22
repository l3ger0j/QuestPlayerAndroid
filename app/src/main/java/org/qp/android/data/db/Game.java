package org.qp.android.data.db;

import android.net.Uri;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.List;

@Entity(tableName = "game")
public class Game {

    @PrimaryKey(autoGenerate = true)
    public long id;
    public int listId;
    public String author = "";
    public String portedBy = "";
    public String version = "";
    public String title = "";
    public String lang = "";
    public String player = "";
    @TypeConverters({GameIconConverter.class})
    public Uri gameIconUri;
    public String fileUrl = "";
    public long fileSize;
    public String fileExt = "";
    public String descUrl = "";
    public String pubDate = "";
    public String modDate = "";

    @TypeConverters({GameDirConverter.class})
    public Uri gameDirUri;

    @TypeConverters({GameFilesConverter.class})
    public List<Uri> gameFilesUri;

}
