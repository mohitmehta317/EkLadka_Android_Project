package com.mohitmehta317.ekladka.ui.main;

import android.content.Context;


import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mohitmehta317.ekladka.R;
import com.mohitmehta317.ekladka.part1;
import com.mohitmehta317.ekladka.part10;
import com.mohitmehta317.ekladka.part11;
import com.mohitmehta317.ekladka.part2;
import com.mohitmehta317.ekladka.part3;
import com.mohitmehta317.ekladka.part4;
import com.mohitmehta317.ekladka.part5;
import com.mohitmehta317.ekladka.part6;
import com.mohitmehta317.ekladka.part7;
import com.mohitmehta317.ekladka.part8;
import com.mohitmehta317.ekladka.part9;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4,R.string.tab_text_5,R.string.tab_text_6,R.string.tab_text_7,R.string.tab_text_8,R.string.tab_text_9,R.string.tab_text_10,R.string.tab_text_11};
    private final Context mContext;
    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment=new part1();
                break;
            case 1:
                fragment=new part2();
                break;
            case 2:
                fragment=new part3();
                break;
            case 3:
                fragment=new part4();
                break;
            case 4:
                fragment=new part5();
                break;
            case 5:
                fragment=new part6();
                break;
            case 6:
                fragment=new part7();
                break;
            case 7:
                fragment=new part8();
                break;
            case 8:
                fragment=new part9();
                break;
            case 9:
                fragment=new part10();
                break;
            case 10:
                fragment=new part11();
                break;



        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 11;
    }
}