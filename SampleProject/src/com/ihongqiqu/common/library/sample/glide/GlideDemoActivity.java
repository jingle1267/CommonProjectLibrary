package com.ihongqiqu.common.library.sample.glide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Glide demo
 *
 * Created by zhenguo on 5/19/15.
 */
public class GlideDemoActivity extends Activity {

    public static void launch(Activity activity) {
        Intent intent = new Intent(activity, GlideDemoActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}