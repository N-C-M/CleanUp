package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CollSche extends AppCompatActivity {
    private Button colbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coll_sche);
        colbtn= (Button) findViewById(R.id.btncoll);
        colbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendash();
            }
        });

    }
    public void opendash(){
        Intent intent=new Intent(this,dashuser.class);
        startActivity(intent);
    }
}

