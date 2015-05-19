package com.ihongqiqu.common.library.sample.gson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Gson demo
 * <p/>
 * Created by zhenguo on 5/19/15.
 */
public class GsonDemoActivity extends Activity {

    public static void launch(Activity activity) {
        Intent intent = new Intent(activity, GsonDemoActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
