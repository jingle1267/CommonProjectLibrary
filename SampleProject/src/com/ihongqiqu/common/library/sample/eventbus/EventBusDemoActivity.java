package com.ihongqiqu.common.library.sample.eventbus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.ihongqiqu.common.library.sample.R;
import de.greenrobot.event.EventBus;

/**
 * EventBus demo
 * <p/>
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
        setContentView(R.layout.layout_eventbus);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_message_event:
                EventBus.getDefault().post(new MessageEvent("Hello everyone!"));
                break;
            case R.id.btn_other_event:
                EventBus.getDefault().post(new SomeOtherEvent());
                break;
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        int priority = 1;
        EventBus.getDefault().register(this, priority);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    // This method will be called when a MessageEvent is posted
    public void onEvent(MessageEvent event) {
        Toast.makeText(this, event.message, Toast.LENGTH_SHORT).show();
    }

    // This method will be called when a SomeOtherEvent is posted
    public void onEvent(SomeOtherEvent event) {
        // doSomethingWith(event);
        Toast.makeText(this, "SomeOtherEvent", Toast.LENGTH_SHORT).show();
    }

}
