package sac4java.android_buttonclick;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class BasicActivityAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setActionTextColor(Color.RED)
                        .setAction("Action", new ShowToastMethod()).show();
            }
        });



    }
    public class ShowToastMethod implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(BasicActivityAct.this, "Clickeed on SnackBar Action", Toast.LENGTH_SHORT).show();

        }
    }


}
