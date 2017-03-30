package com.example.lg.class3;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button normal,gg,center,snack,chat,radio,check,set;
    EditText x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chat = (Button)findViewById(R.id.cha);
        radio = (Button)findViewById(R.id.radio);
        check = (Button)findViewById(R.id.check);
        set = (Button)findViewById(R.id.set);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);

                dlg.setTitle("기본")
                        .setMessage("인정?")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("닫기",null)
                        .setNegativeButton("인정", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"ㅎㅇ",Toast.LENGTH_SHORT).show();
                            }
                        });
                dlg.show();
            }
        });
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);

                String data[]={"치킨","만두","파전","백숙"};
                dlg.setTitle("골라")
                        .setSingleChoiceItems(data,0,null)
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("닫기",null)
                        .setNegativeButton("모찌롱", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"ㅎㅇ",Toast.LENGTH_SHORT).show();
                            }
                        });
                dlg.show();
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);

                final String data[]={"치킨","만두","파전","백숙"};
                final boolean checked[]={true,false,false,false};
                dlg.setTitle("골라골라")
                        .setMultiChoiceItems(data, checked, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                checked[which] = isChecked;
                            }
                        })
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("닫기",null)
                        .setNegativeButton("모찌롱", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String text="";
                                int count=0;
                                for(int i=0;i<data.length;i++){
                                    if(checked[i]){
                                        text+=", ";
                                        text+=data[i];
                                        count++;
                                    }
                                }
                                Toast.makeText(getApplicationContext(),text.substring(1),Toast.LENGTH_SHORT).show();
                            }
                        });
                dlg.show();
            }
        });

//        x = (EditText)findViewById(R.id.x);
//        y = (EditText)findViewById(R.id.y);
//        normal = (Button)findViewById(R.id.normal);
//        normal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"일반",Toast.LENGTH_SHORT).show();
//            }
//        });
//        gg = (Button)findViewById(R.id.gg);
//        gg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int x_num = Integer.parseInt(x.getText().toString());
//                int y_num = Integer.parseInt(y.getText().toString());
//                Toast gToast = Toast.makeText(getApplicationContext(),"위치지정",
//                        Toast.LENGTH_SHORT);
//                gToast.setGravity(Gravity.LEFT | Gravity.TOP,x_num,y_num);
//                gToast.show();
//            }
//        });
//        center = (Button)findViewById(R.id.center);
//        center.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                View view = View.inflate(getApplicationContext(),R.layout.mytoast,null);
//                TextView tv = (TextView)view.findViewById(R.id.tv);
//                tv.setText("jqwiofjoiwejfoiwejfowjiof");
//
//
//                Toast cToast = new Toast(getApplicationContext());
//                cToast.setDuration(Toast.LENGTH_SHORT);
//                cToast.setGravity(Gravity.CENTER,0,100);
//                cToast.setView(view);
//                cToast.show();
//            }
//        });
//
//        snack = (Button)findViewById(R.id.snack);
//        snack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v,"하이염",Snackbar.LENGTH_SHORT).setAction("OK", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        x.setText("22");
//                        y.setText("33");
//                    }
//                }).show();
//            }
//        });
    }


}
