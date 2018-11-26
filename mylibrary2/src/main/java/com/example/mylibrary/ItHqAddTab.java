package com.example.mylibrary;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.List;

/**
 * Created by 57751 on 2018/11/21.
 * 作者
 * 邮箱
 * 作用:设置适配器并且与TabLayout关联
 */

public class ItHqAddTab {
    public  static  void addTab(TabLayout tabLayout, //TabLayout，Tab导航
                                ViewPager viewPager,//Tab导航下面的布局
                                final List<Fragment> fragments,//接收Fragment布局
                                final List<String> title,//接收Tab导航的文字或者改成图片
                                FragmentManager fragmentManager){
        /**
         * 预加载
         */
        viewPager.setOffscreenPageLimit(fragments.size());
        /**
         * 设置适配器
         */
        viewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                //获取Fragment页卡,经过一次处理即可
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();//返回Fragment的长度，即Fragment的数量
            }
            public CharSequence getPageTitle(int position){
                return title.get(position);//ViewPager与TabLayout绑定后，这里获取到PageTitle就是Tab的Text
            }
        });
        //TabLayout关联ViewPager
        tabLayout.setupWithViewPager(viewPager);
    }
}
