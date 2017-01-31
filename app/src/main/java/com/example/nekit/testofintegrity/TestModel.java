package com.example.nekit.testofintegrity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by NEKIT on 28.01.2017.
 */

public class TestModel {
    private int question;

    public TestModel(int question) {
        this.question = question;
    }

    public int getQuestion() {
        return question;
    }

    public static List<TestModel> testArray(){
        return new ArrayList<>(Arrays.asList(
                new TestModel(R.string.q1),
                new TestModel(R.string.q2),
                new TestModel(R.string.q3),
                new TestModel(R.string.q4),
                new TestModel(R.string.q5),
                new TestModel(R.string.q6),
                new TestModel(R.string.q7),
                new TestModel(R.string.q8),
                new TestModel(R.string.q9),
                new TestModel(R.string.q10),
                new TestModel(R.string.q11),
                new TestModel(R.string.q12),
                new TestModel(R.string.q13),
                new TestModel(R.string.q14),
                new TestModel(R.string.q15),
                new TestModel(R.string.q16),
                new TestModel(R.string.q17),
                new TestModel(R.string.q18),
                new TestModel(R.string.q19),
                new TestModel(R.string.q20),
                new TestModel(R.string.q21),
                new TestModel(R.string.q22),
                new TestModel(R.string.q23),
                new TestModel(R.string.q24),
                new TestModel(R.string.q25),
                new TestModel(R.string.q26),
                new TestModel(R.string.q27),
                new TestModel(R.string.q28),
                new TestModel(R.string.q29),
                new TestModel(R.string.q30),
                new TestModel(R.string.q31),
                new TestModel(R.string.q32),
                new TestModel(R.string.q33),
                new TestModel(R.string.q34)
        ));
    }
}
