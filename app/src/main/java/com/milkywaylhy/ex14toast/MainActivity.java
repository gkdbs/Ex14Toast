package com.milkywaylhy.ex14toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //onclick 속성이 부여된 view를 클리하면 발동되는 콜백 메소드
    public void clickbtn(View v){
        //Toast객채를 만들기!
        Toast t=Toast.makeText(this,"Hello",Toast.LENGTH_LONG);
        //위치 변경 (놓여질 위치로 중력을 당기기)
        t.setGravity(Gravity.TOP,0,0);

        //Toast보여주기
        t.show();
    }
    public void clickbtn2(View v){
        //costem view toast만들기
        //toast객체만들기
        Toast t=Toast.makeText(this,"",Toast.LENGTH_SHORT);

        t.show();
        //토스트가 보여줄 view설정
        //방법 1) java언어로 만들기
        //방법 2) view모양을 xml로 설계하여 설정

        //layout폴더안에있는 toast.xml이라는 문서를 읽어서
        //view객체로 만들어 주는 객체를 Context 로 부터 얻어오기
        //view 객체로 만들어 주는(inflate:부풀리다) 객체(Layourinflater를 객체를 Context
        LayoutInflater inflater= this.getLayoutInflater();
        LinearLayout layout=(LinearLayout)inflater.inflate(R.layout.toast,null);
        t.setView(layout);
//        ImageView iv= new ImageView(this);
//        iv.setImageResource(android.R.drawable.ic_lock_silent_mode);
//        TextView tv=new TextView(this);
//        tv.setText("음소거");
//
//        LinearLayout layout= new LinearLayout(this);
//        layout.setOrientation(LinearLayout.VERTICAL);
//
//        layout.addView(iv);
//        layout.addView(iv);
//        t.setView(layout);
//
//        t.setGravity(Gravity.CENTER,0,0);
//        t.show();
    }
}