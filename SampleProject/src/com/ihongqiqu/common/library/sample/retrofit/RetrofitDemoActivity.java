package com.ihongqiqu.common.library.sample.retrofit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Retrofit demo
 *
 * Created by zhenguo on 5/19/15.
 */
public class RetrofitDemoActivity extends Activity {

    public static void launch(Activity activity) {
        Intent intent = new Intent(activity, RetrofitDemoActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
