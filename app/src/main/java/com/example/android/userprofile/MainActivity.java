package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView name = (TextView) findViewById(R.id.name);
    TextView birthday = (TextView) findViewById(R.id.birthday);
    TextView country = (TextView) findViewById(R.id.country);
    ImageView myPhoto = (ImageView) findViewById(R.id.profile_picture);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name.setText("Ertuğrul");

        birthday.setText("12.08.1997");

        country.setText("Turkey");

        myPhoto.setImageResource(R.drawable.my_photo);
    }
}
