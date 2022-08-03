package com.example.news;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pageadapter extends FragmentPagerAdapter {
    int tabcount;
    public pageadapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case  0 : return new BlankFragment1();
            case  1 : return new BlankFragment2();
            case  2 : return new BlankFragment3();
            case  3 : return new BlankFragment4();
            case  4 : return new BlankFragment5();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
