package com.ihongqiqu.common.library.sample.butterknife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.ihongqiqu.common.library.sample.R;

/**
 * ButterKnife Demo
 *
 * Created by zhenguo on 5/21/15.
 */
public class ButterKnifeDemoActivity extends Activity {

    public static void launch(Activity activity) {
        Intent intent = new Intent(activity, ButterKnifeDemoActivity.class);
        activity.startActivity(intent);
    }

    @InjectView(R.id.tv_title) TextView tvTitle;
    @InjectView(R.id.btn_submit)  Button btnSubmit;
    @InjectView(R.id.img_photo) ImageView imgPhoto;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_butterknife);
        ButterKnife.inject(this);
        tvTitle.setText("testTextView");
        btnSubmit.setText("testButton");
        imgPhoto.setImageResource(R.drawable.ic_launcher);
    }

    @OnClick(R.id.btn_submit) void doSubmit() {
        tvTitle.setText("click submit button");
    }
}