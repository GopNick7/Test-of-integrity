package com.example.nekit.testofintegrity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by NEKIT on 28.01.2017.
 */

public class Test {
    private int question;

    public Test(int question) {
        this.question = question;
    }

    public int getQuestion() {
        return question;
    }

    public static List<Test> testArray(){
        return new ArrayList<>(Arrays.asList(
                new Test(R.string.q1),
                new Test(R.string.q2),
                new Test(R.string.q3),
                new Test(R.string.q4),
                new Test(R.string.q5),
                new Test(R.string.q6),
                new Test(R.string.q7),
                new Test(R.string.q8),
                new Test(R.string.q9),
                new Test(R.string.q10),
                new Test(R.string.q11),
                new Test(R.string.q12),
                new Test(R.string.q13),
                new Test(R.string.q14),
                new Test(R.string.q15),
                new Test(R.string.q16),
                new Test(R.string.q17),
                new Test(R.string.q18),
                new Test(R.string.q19),
                new Test(R.string.q20),
                new Test(R.string.q21),
                new Test(R.string.q22),
                new Test(R.string.q23),
                new Test(R.string.q24),
                new Test(R.string.q25),
                new Test(R.string.q26),
                new Test(R.string.q27),
                new Test(R.string.q28),
                new Test(R.string.q29),
                new Test(R.string.q30),
                new Test(R.string.q31),
                new Test(R.string.q32),
                new Test(R.string.q33),
                new Test(R.string.q34)
        ));
    }
}
