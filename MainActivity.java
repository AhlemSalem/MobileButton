package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  TextView txt1;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(TextView) findViewById(R.id.mytext);
        txt1.setText("Ahlem Salem");
        String s= txt1.getText().toString();



        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            public  void  onClick(View view){
                Toast.makeText(MainActivity.this, "Hello"+s, Toast.LENGTH_SHORT).show();

            }
        });
    }
}