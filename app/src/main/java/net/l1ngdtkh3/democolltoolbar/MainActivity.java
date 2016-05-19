package net.l1ngdtkh3.democolltoolbar;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapsing_toolbar);
        ButterKnife.bind(this);
        CustomPagerAdapter customPagerAdapter = new CustomPagerAdapter(this);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(customPagerAdapter);
        indicator.setViewPager(mPager);
        customPagerAdapter.registerDataSetObserver(indicator.getDataSetObserver());
    }
}
