package com.example.neosoft.tabviewpager.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.neosoft.tabviewpager.R;
import com.example.neosoft.tabviewpager.adapters.ViewPagerAdapter;
import com.example.neosoft.tabviewpager.fragments.ScreenAFragment;
import com.example.neosoft.tabviewpager.fragments.ScreenBFragment;
import com.example.neosoft.tabviewpager.fragments.ScreenCFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout= (TabLayout) findViewById(R.id.tabLayout);
        viewPager= (ViewPager) findViewById(R.id.viewPager);

        List<Fragment> fragmentList=new ArrayList<>();
        List<String> tabTitleList=new ArrayList<>();

        fragmentList.add(new ScreenAFragment());
        fragmentList.add(new ScreenBFragment());
        fragmentList.add(new ScreenCFragment());

        tabTitleList.add("Screen A");
        tabTitleList.add("Screen B");
        tabTitleList.add("Screen C");

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),fragmentList,tabTitleList));
        tabLayout.setupWithViewPager(viewPager);
    }
}
