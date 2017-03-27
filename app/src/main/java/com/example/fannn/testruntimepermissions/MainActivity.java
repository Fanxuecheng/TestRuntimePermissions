package com.example.fannn.testruntimepermissions;

import android.Manifest;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPermission();
            }
        });
        findViewById(R.id.getpermission).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPermission();
            }
        });
    }

    private void checkPermission(){
        int i = ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE);
        Log.e(MainActivity.class.getSimpleName(),i+"");
    }

    private void getPermission(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,Manifest.permission.CALL_PHONE)){
            Log.e(MainActivity.class.getSimpleName(),"shouldShowRequestPermissionRationale");

        }else {
            Log.e(MainActivity.class.getSimpleName(),"false");
        }
        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},100);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Log.e(MainActivity.class.getSimpleName(),requestCode+"");
    }
	
	public void test(){
		Log.e(MainActivity.class.getSimpleName(),"sourcetree");
	}
	
	public void test2(){
		Log.e(MainActivity.class.getSimpleName(),"sourcetree");
	}
}
