package sac4java.android_buttonclick;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TimerActivity extends AppCompatActivity {
    TextView timerOutPut;
    EditText timerSeconds;
    Button startTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        timerOutPut = (TextView) findViewById(R.id.timeroutput);
        timerSeconds = (EditText) findViewById(R.id.addseconds);
        final Editable val = timerSeconds.getText();

        startTimer = (Button) findViewById(R.id.starttimer);
        startTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTimer(Integer.parseInt(val.toString()));
            }
        });

    }

    public  void startTimer(int seconds){
        new CountDownTimer(seconds * 1000, 1000) {
            @Override
            public void onTick(long sec) {
                timerOutPut.setText("CountDown in Seconds:"+ sec/1000);
            }

            @Override
            public void onFinish() {
                timerOutPut.setText("CountDown in Seconds is finished now:");
            }
        }.start();

    }
}
