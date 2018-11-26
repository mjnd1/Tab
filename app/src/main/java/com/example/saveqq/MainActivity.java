package com.example.saveqq;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import utils.ItHqAddFragment;
import utils.ItHqAddTab;
import utils.ItHqAddTitle;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
//    private ViewPager mViewPager;
    private List<String> mTitle;//接收首页，中心
    private List<Fragment> mFragment;//接收Fragment1,2的界面
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = (TabLayout)findViewById(R.id.mTabLayour);
        mViewPager =(ViewPager) findViewById(R.id.mViewPager);
        mTitle = ItHqAddTitle.addTitle("首页","中心");//Tab导航上面的文字或者图片
        mFragment = ItHqAddFragment.addFragment(new Fragment(),new Fragment2());//添加Fragment
        ItHqAddTab.addTab(mTabLayout,mViewPager,mFragment,mTitle,getSupportFragmentManager());//设置适配器并且与TabLayout关联

       // mTitle = new ArrayList<>();
//        mTitle.add("首页");
//        mTitle.add("中心");
//        mFragment = new ArrayList<>();
//        mFragment.add(new Fragment1());
//        mFragment.add(new Fragment2());
//        /**
//         * 预加载
//         */
//        mViewPager.setOffscreenPageLimit(mFragment.size());
//        /**
//         * 设置适配器
//         */
//        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
//            @Override
//            public Fragment getItem(int position) {
//                //获取Fragment页卡,经过一次处理即可
//                return mFragment.get(position);
//            }
//
//            @Override
//            public int getCount() {
//                return mFragment.size();//返回Fragment的长度，即Fragment的数量
//            }
//            public CharSequence getPageTitle(int position){
//                return mTitle.get(position);//ViewPager与TabLayout绑定后，这里获取到PageTitle就是Tab的Text
//            }
//        });
//        //TabLayout关联ViewPager
//        mTabLayout.setupWithViewPager(mViewPager);
    }
}
