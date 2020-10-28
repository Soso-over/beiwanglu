package com.example.beiwanglu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        Button button5=(Button)findViewById(R.id.button5);
        button1.setOnClickListener(l);
        button2.setOnClickListener(l);
        button4.setOnClickListener(l);
    }

    View.OnClickListener l=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            Fragment f=null;
            switch (v.getId()){
                case R.id.button1:
                    f= new biji();
                    break;
                case R.id.button2:
                    f=new daiban();
                    break;
                case R.id.button4:
                    f=new richang();
                    break;
                default:
                    break;
            }
            ft.replace(R.id.fragment,f);
            ft.commit();
        }
    };
}
