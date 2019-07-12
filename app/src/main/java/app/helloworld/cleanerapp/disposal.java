package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class disposal extends AppCompatActivity {
    private Button btnpt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disposal);
        btnpt1=(Button) findViewById(R.id.btndisp);
        btnpt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goback1();
            }
        });
    }
    public void goback1(){
        Intent intent = new Intent(this,dashuser.class);
        startActivity(intent);
    }
}
