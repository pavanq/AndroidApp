package com.example.user.practice;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RandomGenerator randomGenerator = new RandomGenerator();
    private TextView HelloTextView;
    private ImageView MainImageView;
    private Button textChangeButton;
    private Button ActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        HelloTextView = (TextView) findViewById(R.id.HelloTextView);
        textChangeButton = (Button) findViewById(R.id.textChangeButton);
        MainImageView = (ImageView) findViewById(R.id.MainImageView);
        ActivityButton = (Button) findViewById(R.id.ActivityButton);

        Toast.makeText(MainActivity.this,"App is running",Toast.LENGTH_SHORT).show();

        firstbuttonlistener();
        secondbuttonlistener();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuItem menuItem = menu.add("settings");
//        menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
//        menuItem.setIcon(R.drawable.ic_settings_black_24dp);
//        menuItem.getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);

        getMenuInflater().inflate(R.menu.options,menu);
        Drawable drawable = menu.findItem(R.id.SettingsItem).getIcon();
        drawable.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.SettingsItem:
                Toast.makeText(this,"Settings tapped",Toast.LENGTH_SHORT).show();
                break;
            case R.id.MoreItem:
                Toast.makeText(this,"More tapped",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void firstbuttonlistener() {
        textChangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doRandom();
            }
        });
    }

    private void secondbuttonlistener() {
        ActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("value",HelloTextView.getText());
                startActivity(intent);
            }
        });
    }


    private void doRandom() {
        int x=randomGenerator.getNumber();
        String msg = "Image No " + x;
        HelloTextView.setText(msg);
        switch (x){
            case 0:
                MainImageView.setImageResource(R.drawable.page0);
                break;
            case 1:
                MainImageView.setImageResource(R.drawable.page1);
                break;
            case 2:
                MainImageView.setImageResource(R.drawable.page2);
                break;
            case 3:
                MainImageView.setImageResource(R.drawable.page3);
                break;
            case 4:
                MainImageView.setImageResource(R.drawable.page4);
                break;
            case 5:
                MainImageView.setImageResource(R.drawable.page5);
                break;
            case 6:
                MainImageView.setImageResource(R.drawable.page6);
                break;


        }

    }
}
