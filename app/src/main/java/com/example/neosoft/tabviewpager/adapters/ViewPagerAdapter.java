package com.example.neosoft.tabviewpager.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Neosoft on 8/10/2017.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> fragmentList;
    private final List<String> tabTitleList;

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> fragmentList,List<String> tabTitleList) {
        super(fm);
        this.fragmentList=fragmentList;
        this.tabTitleList=tabTitleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitleList.get(position);
    }
}
