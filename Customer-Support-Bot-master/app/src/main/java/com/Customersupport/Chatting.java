package com.Customersupport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Chatting extends AppCompatActivity {

    ImageButton fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);







        fb=(ImageButton)findViewById(R.id.fbb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebookIntent = openfb(Chatting.this);
                startActivity(facebookIntent);
            }
        });
    }
    public static Intent openfb(Context context){
        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://page/1545831918843600"));
        } catch (Exception e){

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/Customer-Support-Bot-1545831918843600/"));
        }
    }

    public void man(View v)

    {
    Intent i=new Intent(this,Users.class);
    startActivity(i);
    }
    public void News(View v)
    {
        Intent i=new Intent(this,ImageListActivity.class);
        startActivity(i);
    }

}
