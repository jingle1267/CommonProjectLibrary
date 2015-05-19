package com.ihongqiqu.common.library.sample.volley;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.android.volley.*;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ihongqiqu.common.library.sample.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Retrofit demo
 * <p/>
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
        setContentView(R.layout.layout_volley);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_get:
                requestGetAddress();
                break;
            case R.id.btn_post:
                requestPostAddress();
                break;
        }
    }

    private void requestGetAddress() {
        RequestQueue mQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest("https://raw.githubusercontent.com/jingle1267/TestResource/master/data/address.json",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("TAG", "Volley : " + response);
                        Toast.makeText(VolleyDemoActivity.this, "response : " + response, Toast.LENGTH_SHORT).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", "Volley : " + error.getMessage(), error);
                Toast.makeText(VolleyDemoActivity.this, "error : " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        mQueue.add(stringRequest);
    }

    private void requestPostAddress() {
        RequestQueue mQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://raw.githubusercontent.com/jingle1267/TestResource/master/data/address.json",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("TAG", "Volley : " + response);
                        Toast.makeText(VolleyDemoActivity.this, "response : " + response, Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", "Volley : " + error.getMessage(), error);
                        Toast.makeText(VolleyDemoActivity.this, "error : " + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<String, String>();
                map.put("params1", "value1");
                map.put("params2", "value2");
                return map;
            }
        };

        mQueue.add(stringRequest);
    }

}
