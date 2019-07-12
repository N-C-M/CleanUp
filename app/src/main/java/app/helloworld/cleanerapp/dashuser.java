package app.helloworld.cleanerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashuser extends AppCompatActivity {
    private Button btncs,btnpic,btnvol,btnview,btnnb,btndisp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashuser);
        btncs =(Button)findViewById(R.id.cs);
        btnpic =(Button)findViewById(R.id.pic);
        btnvol =(Button)findViewById(R.id.volcln);
        btnview =(Button)findViewById(R.id.viewpt);
        btnnb =(Button)findViewById(R.id.nbin);
        btndisp =(Button)findViewById(R.id.disptip);
        btncs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cs();
            }
        });
        btnpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pic();
            }
        });
        btnvol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vol();
            }
        });
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewp();
            }
        });
        btnnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nb();
            }
        });
        btndisp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp();
            }
        });
    }
    public void cs(){

        Intent intent=new Intent(this,CollSche.class);
        startActivity(intent);
    }
    public void pic(){

        Intent intent=new Intent(this,photorep.class);
        startActivity(intent);
    }
    public void vol(){

        Intent intent=new Intent(this,volun.class);
        startActivity(intent);
    }
    public void viewp(){

        Intent intent=new Intent(this,mypts.class);
        startActivity(intent);

    }
    public void nb(){

        Intent intent=new Intent(this,bin.class);
        startActivity(intent);
    }
    public void disp(){

        Intent intent=new Intent(this,disposal.class);
        startActivity(intent);
    }
}
