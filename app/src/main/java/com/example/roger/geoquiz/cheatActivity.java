package com.example.roger.geoquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by roger on 3/07/16.
 */
public class cheatActivity extends AppCompatActivity {

    public static final String EXTRA_ANSWER_IS_TRUE = "com.example.roger.geoquiz.answer_is_true";
    private boolean mAnswerIsTrue;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);
    }
}
