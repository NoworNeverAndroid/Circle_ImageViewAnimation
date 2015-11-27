package com.example.nowor_000.circledimageview;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.CircledImageView;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends Activity {

    private CircledImageView btnInformation, btnAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {

                btnInformation=(CircledImageView) stub.findViewById(R.id.viewInformation);
                btnInformation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                     animation(1);
                    }
                });

                btnAlert=(CircledImageView) stub.findViewById(R.id.viewAlert);
                btnAlert.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        animation(2);
                    }
                });

            }
        });


    }



    public void animation(int i){
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.hyperspace_jump);

        if(i==1){
            btnInformation.startAnimation(hyperspaceJumpAnimation);
        }else  if(i==2){
            btnAlert.startAnimation(hyperspaceJumpAnimation);
        }



    }
}
