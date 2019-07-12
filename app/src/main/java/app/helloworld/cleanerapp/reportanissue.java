package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reportanissue extends AppCompatActivity {
    private Button sub1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportanissue);
        sub1= (Button) findViewById(R.id.subx);
        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit1();
            }
        });
    }
    public void submit1(){

        Intent intent=new Intent(this,guestuser.class);
        startActivity(intent);
    }
}
