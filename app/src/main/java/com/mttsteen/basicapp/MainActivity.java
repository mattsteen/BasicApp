package com.mttsteen.basicapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        setSeekbarAction();

    }

    protected void setSeekbarAction() {

        SeekBar seekbar = (SeekBar) findViewById(R.id.seekBar);
        seekbar.setProgress(50);

    }

}
