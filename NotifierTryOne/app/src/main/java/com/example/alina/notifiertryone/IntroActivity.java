package com.example.alina.notifiertryone;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by ALINA on 7/14/2017.
 */

public class IntroActivity extends AppIntro2 {
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance("Android", "App in your hand", R.drawable.ic_done_white, getColor(R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance("Patan College", "BSC.CSIT in Patan", R.drawable.ic_done_white, getColor(R.color.colorRed)));
        addSlide(AppIntroFragment.newInstance("Notes", "Notes in your hand", R.drawable.ic_done_white, getColor(R.color.colorOrange)));
        setFlowAnimation();
        showSkipButton(false);
    }

}
