package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class repissue extends AppCompatActivity {
    private Button btnhm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repissue);
        btnhm=findViewById(R.id.home1);
        btnhm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home();
            }
        });
    }
    public void home(){
        Intent intent=new Intent(this,dashuser.class);
        startActivity(intent);
    }
}
