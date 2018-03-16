package com.umusic.stude.umusic;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by stude on 2/14/2018.
 */

public class UploadObject {
    private File file;
    private ArrayList arrayOfSongs;
    private ArrayList songsList;
    public UploadObject(File f, ArrayList a)
    {
        file = f;//once we upload it we will call it "sendToComputer.data"
        arrayOfSongs = a;//array of songs you want to upload
    }

    private void start()
    {
        songsList = getSongsList();
        for(int i =0;i<arrayOfSongs.size();i++) {
            if (!check((SongObject) arrayOfSongs.get(i),songsList)) {//check if the songs you want to upload is repeated
                //this methods is n^2, we can make it smaller complexity of we use a hashtable.
            }
            else//the song is repeated,
            {

            }
        }

    }
    /*
    Get the song objects and return them so you can add it to the check
     */
    private ArrayList getSongsList()
    {
        ArrayList temp = new ArrayList();
        return temp;
    }
    //check if repeated
    private boolean check(SongObject o, ArrayList a) {
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i).toString().equals(o.toString()))//the song name is the same.
            {
                return true;
            }
        }
        return false;
    }
}
