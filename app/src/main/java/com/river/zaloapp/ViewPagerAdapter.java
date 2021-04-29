package com.river.zaloapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TinNhanFragment();
            case 1:
                return new DanhBaFragment();
            case 2:
                return new BanBeFragment();
            case 3:
                return new NhatKyFragment();
            case 4:
                return new ThemFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
