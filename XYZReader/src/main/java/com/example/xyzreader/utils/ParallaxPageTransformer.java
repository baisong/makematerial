package com.example.xyzreader.utils;


import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.xyzreader.R;

public class ParallaxPageTransformer implements ViewPager.PageTransformer {

    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();
        if (position < -1) {
            view.setAlpha(1);
        } else if (position <= 1) {
           view.findViewById(R.id.photo).setTranslationX(-position * (pageWidth / 2));
        } else {
            view.setAlpha(1);
        }
    }

}