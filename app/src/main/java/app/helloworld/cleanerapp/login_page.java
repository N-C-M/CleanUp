package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_page extends AppCompatActivity {
    private Button button2,btnlog,btnskip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        button2 =(Button)findViewById(R.id.button4);
        btnlog=(Button)findViewById(R.id.login);
        btnskip=(Button)findViewById(R.id.btnskip);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensignup();

            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logdash();
            }
        });
        btnskip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skipguest();
            }
        });
    }
    public void opensignup(){

        Intent intent=new Intent(this,signup.class);
        startActivity(intent);
    }
    public void logdash(){

        Intent intent=new Intent(this,dashuser.class);
        startActivity(intent);
    }
    public void skipguest(){

        Intent intent=new Intent(this,guestuser.class);
        startActivity(intent);
    }
}
