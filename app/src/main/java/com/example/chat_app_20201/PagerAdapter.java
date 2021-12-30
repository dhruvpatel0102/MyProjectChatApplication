package com.example.chat_app_20201;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm,int behaviour) {
        super(fm,behaviour);
        tabcount = behaviour;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new chatFragment();
            case 1:
                return new statusfragment();
            case 2:
                return new callFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
