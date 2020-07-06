package com.azapps.sliderwithviewpager.view.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.azapps.sliderwithviewpager.view.fragment.ScreenSlidePageFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        position = position+1;
        Bundle bundle = new Bundle();
        bundle.putString("msg","Fragment: "+position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}