package com.example.saveqq;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {
    //@Nullable 表示定义的字段可以为空
    //@Override 重载
    //@Nullable 参数可为null
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle saveInstanceState){
        return inflater.inflate(R.layout.fragment_fragment1,null);
    }
}
