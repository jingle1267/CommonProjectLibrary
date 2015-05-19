package com.ihongqiqu.common.library.sample.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.ihongqiqu.common.library.sample.R;
import com.ihongqiqu.common.library.sample.eventbus.EventBusDemoActivity;
import com.ihongqiqu.common.library.sample.glide.GlideDemoActivity;
import com.ihongqiqu.common.library.sample.gson.GsonDemoActivity;
import com.ihongqiqu.common.library.sample.retrofit.RetrofitDemoActivity;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_eventbus:
                EventBusDemoActivity.launch(this);
                break;
            case R.id.btn_glide:
                GlideDemoActivity.launch(this);
                break;
            case R.id.btn_gson:
                GsonDemoActivity.launch(this);
                break;
            case R.id.btn_retrofit:
                RetrofitDemoActivity.launch(this);
                break;
        }
    }

}
