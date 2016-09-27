package com.example.talgat.remaindme.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.talgat.remaindme.fragment.ExampleFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{
    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab 1",
                "Напоминания",
                "Tab 2"
        };

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:

                    return ExampleFragment.getInstance();
                case 1:
                     return ExampleFragment.getInstance();

                case 2:
                    return ExampleFragment.getInstance();
            }

            return null;
        }


    private String[] tabs;

    @Override
    public int getCount() {
        return tabs.length;
    }
}
