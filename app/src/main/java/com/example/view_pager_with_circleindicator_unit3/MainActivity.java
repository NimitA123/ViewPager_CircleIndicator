package com.example.view_pager_with_circleindicator_unit3;




import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.ViewPager);
        tabLayout = findViewById(R.id.tabLayout);
      //  tabLayout.addOnTabSelectedListener(this);
        setAdapter();
    }

    private void setAdapter() {
        ViewPagerSampleAdapter viewPagerSampleAdapter = new ViewPagerSampleAdapter
                (getSupportFragmentManager(),  getLifecycle());
        viewPager.setAdapter(viewPagerSampleAdapter);
        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
             //   tab.setText("Fragment - "+position);
            }
        }).attach();
    }
/**    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        Log.d("Lloyd", "onTabSelected");
    }

    /*
    Called when the user goes to the next tab i.e unselected the previous tab
     */
/*
    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        Log.d("Lloyd", "onTabUnselected");
    }

    /*
    If the user clicks on the current tab
     */
    /***
    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        Log.d("Lloyd", "onTabReselected");
    }
    **/

}