package com.ihongqiqu.common.library.sample.eventbus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * EventBus demo
 *
 * Created by zhenguo on 5/19/15.
 */
public class EventBusDemoActivity extends Activity {

    public static void launch(Activity activity) {
        Intent intent = new Intent(activity, EventBusDemoActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
