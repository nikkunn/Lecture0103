package com.example.leejunsu.lecture0103;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }
    public void onBackButtonClicked(View view) {
        Toast.makeText(getApplicationContext(), "도라가기 버튼이 눌린것 같스빈다..ㅇ.러머\n아ㅣ으으라\n 장비를 멈춫수가 없싀만어리ㅏㅓㅁㄴㅇ리ㅏ\nsafd\n\n\n\n\n", Toast.LENGTH_LONG).show();
        finish();
    }
}
