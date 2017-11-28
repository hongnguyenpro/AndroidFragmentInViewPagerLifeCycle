package toong.vn.androidfragmentinviewpagerlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import toong.vn.androidfragmentinviewpagerlifecycle.fragment.Fragment1;
import toong.vn.androidfragmentinviewpagerlifecycle.fragment.Fragment2;
import toong.vn.androidfragmentinviewpagerlifecycle.fragment.Fragment3;
import toong.vn.androidfragmentinviewpagerlifecycle.fragment.Fragment4;

public class MainActivity extends AppCompatActivity {
    ViewPager mViewPager;
    PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.pager);
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());

        mPagerAdapter.addFragment(new Fragment1());
        mPagerAdapter.addFragment(new Fragment2());
        mPagerAdapter.addFragment(new Fragment3());
        mPagerAdapter.addFragment(new Fragment4());

        mViewPager.setOffscreenPageLimit(2);
        mViewPager.setAdapter(mPagerAdapter);
        mViewPager.setOffscreenPageLimit(4);
        findViewById(R.id.button_footer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FooterActivity.class));
            }
        });
    }

    private class PagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment) {
            mFragmentList.add(fragment);
        }
    }
}
