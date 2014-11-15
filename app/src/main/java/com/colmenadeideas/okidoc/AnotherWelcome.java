package com.colmenadeideas.okidoc;

/**
 * Created by dlarez on 13/11/14.
 */

    import android.os.Bundle;
    import android.support.v4.app.FragmentActivity;
    import android.support.v4.view.ViewPager;
    import android.view.Menu;

    import com.viewpagerindicator.CirclePageIndicator;
    import com.viewpagerindicator.PageIndicator;
    public class AnotherWelcome extends FragmentActivity {

        TestFragmentAdapter mAdapter;
        ViewPager mPager;
        PageIndicator mIndicator;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.another_welcome);

            mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

            mPager = (ViewPager)findViewById(R.id.pager);
            mPager.setAdapter(mAdapter);

            CirclePageIndicator indicator = (CirclePageIndicator)findViewById(R.id.indicator);
            mIndicator = indicator;
            indicator.setViewPager(mPager);

            final float density = getResources().getDisplayMetrics().density;
            indicator.setBackgroundColor(0xFFCCCCCC);
            indicator.setRadius(10 * density);
            indicator.setPageColor(0xFF888888);
            indicator.setFillColor(0x880000FF);
            indicator.setStrokeColor(0xFF000000);
            indicator.setStrokeWidth(2 * density);
        }



    }