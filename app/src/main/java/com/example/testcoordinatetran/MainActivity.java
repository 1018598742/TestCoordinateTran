package com.example.testcoordinatetran;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.CoordinateConverter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertUtils(View view) {
        //第一个参数为纬度，第二个参数为经度
        //117.175882,39.074595
        LatLng sourceLatLng = new LatLng(39.074595, 117.175882);

        //初始化左边转换工具类，指定源坐标类型和坐标数据
        //sourceLatLng 待转换坐标  高德坐标转百度坐标
        CoordinateConverter converter = new CoordinateConverter()
                .from(CoordinateConverter.CoordType.COMMON)
                .coord(sourceLatLng);

        //转换坐标
        LatLng desLatLng = converter.convert();
        double latitude = desLatLng.latitude;
        double longitude = desLatLng.longitude;
        Log.i("My_Test", "BMapApiDemoMain-convertUt: longitude,latitude=" + longitude + "," + latitude);
    }
}
