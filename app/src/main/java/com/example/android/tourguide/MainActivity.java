package com.example.android.tourguide;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        CategoryAdapter adapter = new CategoryAdapter (MainActivity.this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);

        //Connect the tab layout with the view pager. This will
        // 1.Update the view pager when a tab is selected
        // 2. Update the view pager when the view pager is swiped
        // 3. Set the tab layout's tab names with the view pager's adapter's titles
        // by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
}
