package sac4java.android_buttonclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button clickButton;
    Button toggleScreen;
    Button editText;
    Button progressBar;
    Button sac4java;
    Button basicActivity;
    Button navigationActivity;
    Button timer;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView4);
        textView.setText("This is the changed value");
        //Here R.id.button --> button is id same given xml file
        clickButton = (Button) findViewById(R.id.button);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"You just clicked button",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        toggleScreen = (Button) findViewById(R.id.button3);
        toggleScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ToggleActivity.class);
                startActivity(intent);
            }
        });

        editText = (Button) findViewById(R.id.editText);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
                startActivity(intent);
            }
        });

        progressBar = (Button) findViewById(R.id.progressBarButton);
        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProgressbarAct.class);
                startActivity(intent);
            }
        });

        sac4java = (Button) findViewById(R.id.sac4java);
        sac4java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebPagesAct.class);
                startActivity(intent);
            }
        });

        basicActivity = (Button) findViewById(R.id.basicactivity);
        basicActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BasicActivityAct.class);
                startActivity(intent);
            }
        });

        navigationActivity = (Button) findViewById(R.id.navigationact);
        navigationActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NavigationDrawerAct.class);
                startActivity(intent);
            }
        });

        timer = (Button) findViewById(R.id.timer);
        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TimerActivity.class);
                startActivity(intent);
            }
        });

     }
}
