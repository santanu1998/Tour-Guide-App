package com.example.tourguideapp;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tourguideapp.R;

public class ViewAdapterPage extends FragmentPagerAdapter {
    Context mcontext;
    public ViewAdapterPage(Context context, FragmentManager fm)
    {
        super(fm);
        mcontext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if(position == 0)
        {
            return new HistorialPlacesFragment();
        }
        else if(position == 1)
        {
            return new FoodStreetFragment();
        }
        else if(position == 2)
        {
            return new ShoppingPlacesFragment();
        }
        else
        {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
        {
            return mcontext.getString(R.string.HistorialPlaces);
        }
        else if(position == 1)
        {
            return mcontext.getString(R.string.FoodStreets);
        }
        else if(position == 2)
        {
            return mcontext.getString(R.string.ShoppingPlaces);
        }
        else
        {
            return mcontext.getString(R.string.Hotels);
        }
    }
}
