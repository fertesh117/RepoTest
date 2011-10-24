package com.example.RepoTest;

import android.app.Activity;
import android.os.Bundle;

public class RepoTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        System.out.println("Weeeeee");
    }
}