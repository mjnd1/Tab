package com.example.mylibrary;

import android.support.v4.app.Fragment;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 57751 on 2018/11/21.
 * 作者
 * 邮箱
 * 作用:添加Fragment
 */

public class ItHqAddFragment {
    public  static List<Fragment> addFragment(Fragment ...fragments){
        Fragment[] m = fragments;
        List<Fragment> fragmentList = Arrays.asList(m);
        return fragmentList;
    }
}
