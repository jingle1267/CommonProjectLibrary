package com.ihongqiqu.common.library.sample.glide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.ihongqiqu.common.library.sample.R;

/**
 * Glide demo
 * <p/>
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
        setContentView(R.layout.layout_glide);

        ImageView img_first = (ImageView) findViewById(R.id.img_first);
        ImageView img_second = (ImageView) findViewById(R.id.img_second);

        Glide.with(GlideDemoActivity.this)
                .load("https://raw.githubusercontent.com/jingle1267/TestResource/master/imgs/ic_launcher_128.png")
                .centerCrop()
                .into(img_first);

        Glide.with(GlideDemoActivity.this)
                .load("https://avatars2.githubusercontent.com/u/3887795?v=2&s=400")
                .centerCrop()
                .placeholder(R.drawable.ic_launcher)
                .crossFade()
                .into(img_second);
    }

}
