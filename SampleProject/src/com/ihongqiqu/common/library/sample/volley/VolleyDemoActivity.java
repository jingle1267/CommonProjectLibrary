package com.ihongqiqu.common.library.sample.volley;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Retrofit demo
 *
 * Created by zhenguo on 5/19/15.
 */
public class VolleyDemoActivity extends Activity {

    public static void launch(Activity activity) {
        Intent intent = new Intent(activity, VolleyDemoActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onClick(View view) {
        request();
    }

    private void request() {
    }

}
