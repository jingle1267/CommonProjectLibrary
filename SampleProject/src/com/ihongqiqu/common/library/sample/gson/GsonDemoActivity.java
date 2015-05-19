package com.ihongqiqu.common.library.sample.gson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.gson.Gson;
import com.ihongqiqu.common.library.sample.R;

import java.util.ArrayList;
import java.util.List;

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
        setContentView(R.layout.layout_gson);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_encode:
                encode();
                break;
            case R.id.btn_decode:
                decode();
                break;
        }
    }

    private void encode() {
        ResponseObj responseObj = new ResponseObj();
        responseObj.errCode = 100;
        responseObj.retCode = 200;
        responseObj.msg = "Hello World";
        AddressObj addressObj = new AddressObj();
        addressObj.address = "Beijing";
        addressObj.name = "Jingle1267";
        addressObj.phone = "18600006967";
        List<AddressObj> addressObjList = new ArrayList<>();
        addressObjList.add(addressObj);
        AddressListObj addressListObj = new AddressListObj();
        addressListObj.addressList = addressObjList;
        responseObj.data = addressListObj;

        Gson gson = new Gson();
        String json = gson.toJson(responseObj);
        Toast.makeText(this, "json : " + json, Toast.LENGTH_SHORT).show();
    }

    private void decode() {
        String result = "{\n" +
                "errCode: 0,\n" +
                "retCode: 0,\n" +
                "msg: \"\",\n" +
                "data: {\n" +
                "addressList: [\n" +
                "{\n" +
                "address: \"上海上海市宝山区教委大楼5曾601\",\n" +
                "addressId: 10,\n" +
                "city: \"上海市\",\n" +
                "district: \"宝山区\",\n" +
                "lastModifyTime: \"1414377342\",\n" +
                "lastUsedTime: \"1414375607\",\n" +
                "mobile: \"15800885222\",\n" +
                "name: \"张三\",\n" +
                "phone: \"\",\n" +
                "postcode: \"000000\",\n" +
                "province: \"上海\",\n" +
                "regionId: 205,\n" +
                "usedCount: 0\n" +
                "},\n" +
                "{\n" +
                "address: \"重庆重庆市永川市第二实验中学\",\n" +
                "addressId: 9,\n" +
                "city: \"重庆市\",\n" +
                "district: \"永川市\",\n" +
                "lastModifyTime: \"1414375427\",\n" +
                "lastUsedTime: \"1414375278\",\n" +
                "mobile: \"15043685888\",\n" +
                "name: \"李四\",\n" +
                "phone: \"13552558113\",\n" +
                "postcode: \"108563\",\n" +
                "province: \"重庆\",\n" +
                "regionId: 2107,\n" +
                "usedCount: 0\n" +
                "}\n" +
                "]\n" +
                "}\n" +
                "}";

        Gson gson = new Gson();
        ResponseObj responseObj = gson.fromJson(result, ResponseObj.class);
        String logMsg = "errCode : " + responseObj.errCode + " address: " + responseObj.data.addressList.get(0).address;
        Toast.makeText(this, logMsg, Toast.LENGTH_SHORT).show();
    }

}
