package com.umusic.stude.umusic;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by stude on 2/14/2018.
 */

public class Upload extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//set no title bar
        setContentView(R.layout.upload_activity);//read the layout
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//full screen
        setToolBar();
        setToggleBar();//set the three dots button(toggle button) and side bar
        //SeekBar sBar = (SeekBar) findViewById(R.id.seekbar);

    }
    /*
   Set side bar navigation, and have them each item have an action to do.
    */
    private void setToggleBar() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //add the navigation(side bar) and have a swtitch statement to do each thing on it.
        NavigationView mNavigationView = (NavigationView) findViewById(R.id.nav_bar);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem){
                Intent i;
                switch (menuItem.getItemId()){
                    case(R.id.my_account):
                        Toast.makeText(Upload.this, "Account Selected", Toast.LENGTH_SHORT).show();
                        i = new Intent(Upload.this,MainActivity.class);
                        startActivity(i);
                        return true;
                    case(R.id.my_playlist):
                        Toast.makeText(Upload.this, "Playlist", Toast.LENGTH_SHORT).show();
                        return true;
                    case(R.id.all_music):
                        Toast.makeText(Upload.this, "Music", Toast.LENGTH_SHORT).show();
                        return true;
                    case(R.id.transfer_files):
                        Toast.makeText(Upload.this, "Upload", Toast.LENGTH_SHORT).show();
                        return true;
                    case(R.id.download_files):
                        Toast.makeText(Upload.this, "Downloads", Toast.LENGTH_SHORT).show();
                        return true;
                    case(R.id.settings):
                        Toast.makeText(Upload.this, "Settings", Toast.LENGTH_SHORT).show();
                        return true;
                    case(R.id.about):
                        Toast.makeText(Upload.this, "About", Toast.LENGTH_SHORT).show();
                        return true;
                    default:return true;
                }
            }
        });
    }

    /*
    Set toolbar and change color of the text
     */
    private void setToolBar() {
        Toolbar myToolbar = (Toolbar) findViewById(R.id.nav_action);
        myToolbar.setTitleTextColor(Color.rgb(179,157,219));
        setSupportActionBar(myToolbar);
    }
    /*
    When the three dots button has been touch open
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
