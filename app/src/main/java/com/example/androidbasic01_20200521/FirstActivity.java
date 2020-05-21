package com.example.androidbasic01_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.androidbasic01_20200521.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    ActivityFirstBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_first);
        setUpEvents();
        setValues();

    }

    void setUpEvents() {

        binding.goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
//                이전 화면으로 돌아갈때는 Intent를 사용하지 않는다.
//                Intent는 새화면을 만들어내는 기능이 포함되어있다.
//                  => 돌아가는게 아니라, 다른 새 화면을 얹어주는 효과가 발생.
            }
        });

    }

    void setValues() {

    }

}
