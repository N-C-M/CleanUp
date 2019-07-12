package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mypts extends AppCompatActivity {
    private Button btnpt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypts);
        btnpt=(Button) findViewById(R.id.btnpt);
        btnpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goback();

            }
        });
    }
    public void goback(){
        Intent intent=new Intent(this,dashuser.class);
        startActivity(intent);
    }
}
