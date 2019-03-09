package com.example.a20140550.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import static com.example.a20140550.progressbar.R.id.progressBarID;

public class MainActivity extends AppCompatActivity {
private ProgressBar progressBar;
    int Progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar= (ProgressBar) findViewById(progressBarID);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
      thread.start();
    }
    public void doWork() {
for(Progress=10;Progress<=100;Progress=Progress+10)
{
    try {
        Thread.sleep(1000);
        progressBar.setProgress(Progress);
    }
    catch (InterruptedException e)
    {
        e.printStackTrace();
    }

}

    }
}
