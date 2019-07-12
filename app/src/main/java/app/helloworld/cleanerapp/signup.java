package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {
    private Button button3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        button3=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.mainsn);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlogin1();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dash();
            }
        });
    }
    public void openlogin1(){
        Intent intent= new Intent(this,login_page.class);
        startActivity(intent);
    }
    public void dash(){
        Intent intent= new Intent(this,dashuser.class);
        startActivity(intent);
    }



}

