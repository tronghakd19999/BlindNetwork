package com.application.blindnetwork;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.application.blindnetwork.Fragment.Fragment_Home;
import com.application.blindnetwork.Fragment.Fragment_Love;
import com.application.blindnetwork.Fragment.Fragment_Profile;
import com.application.blindnetwork.Fragment.Fragment_Search;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Fragment_Home()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNav = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selected = null;
            switch (item.getItemId()){
                case R.id.home_bottom:
                    selected = new Fragment_Home();
                    break;


                case R.id.search_bottom:
                    selected = new Fragment_Search();
                    break;

                case R.id.love_bottom:
                    selected = new Fragment_Love();
                    break;

                case R.id.profile_bottom:
                    selected = new Fragment_Profile();
                    break;

//                case R.id.notification_bottom:
//                    selected = new Fragment_Noti();
//                    break;


            }
            if (selected != null){
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                        selected).commit();
            }

            return true;
        }
    };
}