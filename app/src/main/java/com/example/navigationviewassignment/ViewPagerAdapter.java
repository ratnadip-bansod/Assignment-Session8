package com.example.navigationviewassignment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0) {
            return new DeveloperFragment();
        }
        if (position ==1) {
            return new OrganisationFragment();
        }

        if (position ==2) {
            return new SettingFragment();
        }
        return new DeveloperFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
