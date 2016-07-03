package com.example.roger.geoquiz;

/**
 * Created by roger on 18/06/16.
 */
public class TrueFalse {

    private int mQuestion;
    private boolean mTrueQuestion;

    public boolean ismTrueQuestion() {
        return mTrueQuestion;
    }

    public int getmQuestion() {
        return mQuestion;
    }

    public void setmTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }

    public void setmQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }


    public TrueFalse (int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }
}
