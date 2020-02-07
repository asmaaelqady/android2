package com.example.eshraqa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button but ;
    private String mytext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but =(Button) findViewById(R.id.button1);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Createdialog();
            } });

    }
    public void  Createdialog(){

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert .setTitle("الصلاة ")
                 .setMessage("هل انت ملتزم بالصلاة ")
                .setPositiveButton("نعم",new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        AlertDialog.Builder alert1 = new AlertDialog.Builder(MainActivity.this);
                        alert1.setTitle("الصلاة").setMessage("هل يوجد قضاء")

                                .setPositiveButton("نعم", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(MainActivity.this, "hallo asmaa", Toast.LENGTH_SHORT).show();

//                                        AlertDialog.Builder alert2 = new AlertDialog.Builder(MainActivity.this);
//                                        alert2.setTitle("الصلاة").setMessage("كم عدد الاشهر الفائتة");
//                                        final EditText mounth = new EditText(MainActivity.this);
//                                        mounth.setInputType(InputType.TYPE_CLASS_NUMBER);
//                                        alert2.setView(mounth);
//                                        alert2.setPositiveButton("تم", new DialogInterface.OnClickListener() {
//                                            @Override
//                                            public void onClick(DialogInterface dialogInterface, int i) {
//                                                mytext = mounth.getText().toString();
//                                                Intent intent = new Intent(MainActivity.this,Table2.class);
//                                                  startActivity(intent);
//                                            }
//                                        });
//                                        alert2.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
//                                            @Override
//                                            public void onClick(DialogInterface dialogInterface, int i) {
//                                               dialogInterface.cancel();
//                                            }
//                                        });
//                                        alert2.show();
                                    }
                                });
                        alert1.setNegativeButton("لا", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(MainActivity.this,Table1.class);
                                startActivity(intent);
                            }
                        });
                    }
                });
                alert .setNegativeButton("لا", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this,Table.class);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alert .create();
                alertDialog.show();
            }

    }



