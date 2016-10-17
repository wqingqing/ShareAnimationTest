package com.test.animation.shareanimationtest;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgView;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(this , SecondActivity.class);
        imgView = (ImageView)findViewById(R.id.item_image);
        bt = (Button)findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (android.os.Build.VERSION.SDK_INT > 20) {
                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, imgView, "transitionImg").toBundle());

//                    共享多个元素
//                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,
//                            Pair.create(view1, "agreedName1"),
//                            Pair.create(view2, "agreedName2"));

                } else {
                    startActivity(intent);
                }
            }
        });


    }
}
