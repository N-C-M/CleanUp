package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class photorep extends AppCompatActivity {
    private Button phobck,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photorep);
        phobck=(Button)findViewById(R.id.btnrep);
        sub=(Button)findViewById(R.id.sub);
        phobck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goback();
            }

        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit();
            }
        });
    }
    public void goback(){
        Intent intent=new Intent(this,dashuser.class);
        startActivity(intent);
    }
    public void submit(){
        Intent intent=new Intent(this,submitphotoresp.class);
        startActivity(intent);
    }
}

