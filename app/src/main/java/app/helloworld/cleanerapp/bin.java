package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bin extends AppCompatActivity {
    Button backbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bin);
        backbtn2=(Button) findViewById(R.id.btnbin);
        backbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goback2();
            }
        });
    }
    public void goback2(){
        Intent intent = new Intent(this,dashuser.class);
        startActivity(intent);
    }
}
