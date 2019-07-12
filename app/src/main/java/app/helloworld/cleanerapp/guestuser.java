package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guestuser extends AppCompatActivity {
    private Button btnb2,btndp2,btnsn,btnrep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guestuser);
        btnb2 =(Button)findViewById(R.id.guestnb);
        btndp2 =(Button)findViewById(R.id.guestdt);
        btnsn =(Button)findViewById(R.id.guestsn);
        btnrep =(Button)findViewById(R.id.guestrep);
        btnb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nb2();
            }
        });
        btndp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp2();
            }
        });
        btnsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snp();
            }
        });
        btnrep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rep();
            }
        });
    }
    public void nb2(){

        Intent intent=new Intent(this,bin.class);
        startActivity(intent);
    }
    public void dp2(){

        Intent intent=new Intent(this,disposal.class);
        startActivity(intent);
    }
    public void snp(){
        Intent intent=new Intent(this,signup.class);
        startActivity(intent);

    }
    public void rep(){

        Intent intent=new Intent(this,reportanissue.class);
        startActivity(intent);
    }

}
