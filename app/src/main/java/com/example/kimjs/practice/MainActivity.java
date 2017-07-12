package com.example.kimjs.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn_login).setOnClickListener(this);
        findViewById(R.id.btn_simple_list).setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "on destory");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1 : {
                Toast.makeText(this, "버튼 1 클릭됨", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.btn2 : {
                Intent intent = new Intent(this, SubActivity.class);
                startActivity(intent);
                break;
            }
            case  R.id.btn_login : {
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_simple_list : {
                Intent intent = new Intent(this, SimpleListActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}