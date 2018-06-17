package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dpak on 1/15/18.
 */

class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new HistoricFragment();
        }
        else if ( position == 1){
            return new NaturalFragment();
        }
        else if ( position == 2){
            return new HotelsFragment();
        }

        else {
            return new MountainsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.category_historic);
        }
        else if (position== 1){
            return mContext.getString(R.string.category_natural);
        }
        else if (position==2){
            return mContext.getString(R.string.category_hotels);
        }
        else {
            return mContext.getString(R.string.category_mountains);
        }

    }
}
