package com.umusic.stude.umusic;

import java.io.File;
import java.io.Serializable;

/**
 * Created by stude on 2/14/2018.
 */
public class SongObject implements Serializable {
    String path;
    private String name;
    private String uploadFolderPath;
    private String id;
    public SongObject(File f,String i, String fp)
    {
        this.name = f.getName();
        path = f.getPath();
        id = i;//id of the uploaded file
        uploadFolderPath = fp;
    }
    private String getName()
    {
        return this.name;
    }
    private String getPathFolder()
    {
        return uploadFolderPath;
    }
    private String getSongPath()
    {
        return path;
    }
    private void setSong(File f)
    {
        path = f.getParent();
        this.name = f.getName();
    }
    //no way to change the name of the file
    public String toString()
    {
        return name;
    }
}