package com.example.nekit.testofintegrity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by NEKIT on 28.01.2017.
 */

public class TestModel {
    private int question;
    private int toCounterYes;
    private int toCounterNo;

    public TestModel(int question, int toCounterYes, int toCounterNo) {
        this.question = question;
        this.toCounterYes = toCounterYes;
        this.toCounterNo = toCounterNo;
    }

    public int getQuestion() {
        return question;
    }

    public int getToCounterYes() {
        return toCounterYes;
    }

    public int getToCounterNo() {
        return toCounterNo;
    }

    public static List<TestModel> testArray(){
        return new ArrayList<>(Arrays.asList(
                new TestModel(R.string.q1,1,0),
                new TestModel(R.string.q2,0,1),
                new TestModel(R.string.q3,1,0),
                new TestModel(R.string.q4,0,1),
                new TestModel(R.string.q5,1,0),
                new TestModel(R.string.q6,1,0),
                new TestModel(R.string.q7,0,1),
                new TestModel(R.string.q8,1,0),
                new TestModel(R.string.q9,1,0),
                new TestModel(R.string.q10,1,0),
                new TestModel(R.string.q11,1,0),
                new TestModel(R.string.q12,1,0),
                new TestModel(R.string.q13,0,1),
                new TestModel(R.string.q14,1,0),
                new TestModel(R.string.q15,1,0),
                new TestModel(R.string.q16,1,0),
                new TestModel(R.string.q17,1,0),
                new TestModel(R.string.q18,1,0),
                new TestModel(R.string.q19,1,0),
                new TestModel(R.string.q20,1,0),
                new TestModel(R.string.q21,1,0),
                new TestModel(R.string.q22,1,0),
                new TestModel(R.string.q23,1,0),
                new TestModel(R.string.q24,1,0),
                new TestModel(R.string.q25,1,0),
                new TestModel(R.string.q26,0,1),
                new TestModel(R.string.q27,0,1),
                new TestModel(R.string.q28,1,0),
                new TestModel(R.string.q29,1,0),
                new TestModel(R.string.q30,1,0),
                new TestModel(R.string.q31,1,0),
                new TestModel(R.string.q32,1,0),
                new TestModel(R.string.q33,1,0),
                new TestModel(R.string.q34,1,0)
        ));
    }
}
